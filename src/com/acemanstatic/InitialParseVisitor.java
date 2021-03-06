package com.acemanstatic;

import com.aceman.SenatorBaseVisitor;
import com.aceman.SenatorParser;
import com.acemanstatic.expressions.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.logging.Logger;

public class InitialParseVisitor extends SenatorBaseVisitor<SenatorASTContainer> {

    Logger logger = Logger.getLogger(InitialParseVisitor.class.getName());
    SenatorASTContainer shiz = new ProgramContainer();
    ArrayList<Senator> _senators = new ArrayList<>();
    HashMap<String, PartyType> _senPartyMap = new HashMap<>();
    HashMap<String, FunctionDef> _functionMap = new HashMap<>();


    public expr _rootcommand = new RootExpr(Collections.<expr>emptyList(), null);

    public expr getProgram() {
        return _rootcommand;
    }

    public InitialParseVisitor(){
        _rootcommand.setScope(new ScopeTree());
    }


    @Override
    public SenatorASTContainer visitConstant(SenatorParser.ConstantContext ctx){

        return new ConstantExpression(ctx.getText(), ExprType.STRING);
    }

    @Override
    public SenatorASTContainer visitSwait(SenatorParser.SwaitContext ctx) {
        return new WaitExpression(new ConstantExpression(ctx.getChild(1).getText(), ExprType.INTEGER));
    }

    @Override
    public SenatorASTContainer visitLoopexit(SenatorParser.LoopexitContext ctx){
        return new BreakExpression();
    }

        @Override
    public SenatorASTContainer visitProgramexpression(SenatorParser.ProgramexpressionContext ctx) {
        logger.info("Visiting Program Expression");
        int cc = ctx.getChildCount();


        Object ob = ctx.getChild(0);
        expr o = (expr)visit(ctx.getChild(0));
        ArrayList<expr> list = new ArrayList<>();
        list.add(o);

        return new ProgramExpression(list,ctx.getStart());


    }

    @Override
    public SenatorASTContainer visitPrints(SenatorParser.PrintsContext ctx){
        logger.info("Printing out container");
        return new PrintExpression(ctx.getChild(1).getText());
    }

    @Override
    public SenatorASTContainer visitDisplayMyHouse(SenatorParser.DisplayMyHouseContext ctx){
        expr command = new DisplayHouseExpression(_senators);
        command.setContext(ctx.getStart());
        return command;
    }

    @Override
    public SenatorASTContainer visitPrinthouse(SenatorParser.PrinthouseContext ctx){
        logger.info("(V)Print house");
        expr command = new DisplayHouseExpression(_senators);
        command.setContext(ctx.getStart());
        return command;
    }



    @Override
    public SenatorASTContainer visitVar( SenatorParser.VarContext ctx) {
        logger.info("Visit for var eval : " + ctx.getText() + " => " + ctx.ID());
        expr command = new VarDecl("foo", "bar");
        command.setContext(ctx.getStart());
        return command;
    }

    @Override
    public SenatorASTContainer visitForIndexVar(SenatorParser.ForIndexVarContext ctx){
        visit(ctx.var());
        logger.info("Visit for index start by Var: " + ctx.getText() + " => " + ctx.var().ID());

        expr command = new VarExpression("6", ExprType.INTEGER);
        command.setContext(ctx.getStart());
        return(command);
    }

    @Override
    public SenatorASTContainer visitFunction(SenatorParser.FunctionContext ctx){
        logger.info("Function Def...");
        FunctionDef fn = new FunctionDef(ctx.getChild(1).getText());
        // proto is 3...
        SenatorParser.FunctionprotoContext protoype = ctx.functionproto(0);
        List<SenatorParser.FunctionparamContext> params = protoype.functionparam();

        for(SenatorParser.FunctionparamContext param: params){
            logger.info(String.format("%s, %s", param.ID(), param.type().getText()));
            if( param.type().getText().equals("int") ) {
                fn.addParameter(new FunctionParam(param.ID().getText(), ExprType.INTEGER));
            }else{
                fn.addParameter(new FunctionParam(param.ID().getText(), ExprType.STRING));
            }
        }

       fn.setReturnType(ExprType.inferFromType(ctx.type().getText()));

        SenatorParser.FunctionbodyContext body = ctx.functionbody();
        for(int i = 0;i < body.getChildCount();i++){
            fn.addStatement((expr) visit(body.getChild(i)));

        }
        // body is 7
        _functionMap.put(fn.getFunctionname(), fn);
        return fn;
    }

    @Override
    public SenatorASTContainer visitFunctioncall(SenatorParser.FunctioncallContext ctx){
        String functionName = ctx.getChild(1).getText();
        logger.info("Visit Function Call");
        for(SenatorParser.FunctioncallparamContext parm : ctx.functioncallparam()){
            logger.info("function call param");
        }
        return new FunctionCall(ctx.getChild(1).getText(), _functionMap);
    }
    @Override
    public SenatorASTContainer visitForIndexNum(SenatorParser.ForIndexNumContext ctx){

      //  logger.info("Visit for index start by Num: " + ctx.getText() + "");

        expr command = new ConstantExpression(ctx.getText(), ExprType.INTEGER);
        command.setContext(ctx.getStart());
        return(command);
    }

    @Override
    public SenatorASTContainer visitIfstmt(SenatorParser.IfstmtContext ctx){

        // get out the conditional.
        SenatorParser.ConditionaltestContext cond = ctx.conditionaltest();
        ProgramExpression lhs = (ProgramExpression)visit(cond.progstmt(0));
        ProgramExpression rhs = (ProgramExpression)visit(cond.progstmt(1));
        String testOperator = cond.getChild(1).getText();
        CondExpression ce = new CondExpression(lhs, rhs, testOperator, Collections.<expr>emptyList());
        for(SenatorParser.ProgramexpressionContext pec : ctx.programexpression()){
            ProgramExpression pe = (ProgramExpression)visit(pec);
            pe.setParent(ce);
            ce.add(pe);
        }
        logger.info("Finished visiting if statement");
        return ce;
    }


    @Override
    public SenatorASTContainer visitLoop(SenatorParser.LoopContext ctx){
        logger.info("Visiting Loop..." + ctx.getStart() + "..." + ctx.getChildCount());

        LinkedList<expr> commands = new LinkedList<>();
        ConstantExpression loopStart = (ConstantExpression)visit(ctx.foridxitem(0));
        ConstantExpression loopStop  = (ConstantExpression)visit(ctx.foridxitem(1));
        logger.info(String.format("Start: %s", loopStart));
        logger.info(String.format("Stop : %s", loopStop));

        ForExpression command = new ForExpression(loopStart, loopStop, commands);


       // System.out.println(ctx.foridxstart().getText() + "::" +  (ctx.foridxstart().getRuleIndex() == SenatorParser.RULE_foridxstart));
       // System.out.println(ctx.foridxstop().getText());
        int cc = ctx.getChildCount();
        for(int i = 2;i < cc;i++){
            ParseTree o = ctx.getChild(i);
            String debug = o.toStringTree();
            logger.info(debug);
            expr e = (expr) visit(o);
            if(e != null) {
                logger.info("I visited a loop and found an: " + e.getClass().getName());
                commands.add(e);
            }
        }


        command.setContext(ctx.getStart());
        command.addMany(commands);
        logger.info("Done..Visiting Loop..." + ctx.getStart() + " I found " + command.getCommands().size() + " Commands");
        return command;
    }

    @Override
    public SenatorASTContainer visitProgstmt(SenatorParser.ProgstmtContext ctx){
        logger.info("Visiting program statement...");
        LinkedList<expr> commands = new LinkedList<>();
        for(int i = 0;i < ctx.getChildCount();i++){
            expr e = (expr)visit(ctx.getChild(i));
            logger.info(">>>>>>" + e);
            if(e != null) {
                commands.add(e);
            }
        }
        return new ProgramExpression(commands, ctx.getStart());
    }
    @Override
    public SenatorASTContainer visitAssignvar(SenatorParser.AssignvarContext ctx){
        logger.info("Visiting Assign var");
        return new VarDecl(ctx.getChild(1).getText(),ctx.getChild(3).getText() );
    }
    @Override
    public SenatorASTContainer visitTopLevelRule( SenatorParser.TopLevelRuleContext ctx){
        logger.info("Visiting top level statement......");

        for(int i = 0;i < ctx.getChildCount();i++){
            ParseTree child = ctx.getChild(i);
            if(ctx.getChild(i) instanceof SenatorParser.SenatordfnContext){
                /*
                SenatorParser.SenatordfnContext senator = (SenatorParser.SenatordfnContext)ctx.getChild(i);
                SenatorASTContainer con = visit(senator);
                logger.info(String.format("Senator Def:>%d", _senators.size()));
                if(_senators.contains(con.getSenator())){
                    throw new RuntimeException(String.format("You already have defined Senator(%s)", con.getSenator()));
                }
                if(_senPartyMap.containsKey(con.getSenator().getFullName()) && (_senPartyMap.get(con.getSenator().getFullName()) !=  con.getSenator().getPartyType())){
                    throw new RuntimeException(String.format("You already have defined Senator(%s), but they have a different party (%s)", con.getSenator(), _senPartyMap.get(con.getSenator().getFullName())));
                }
                _senPartyMap.put(con.getSenator().getFullName(), con.getSenator().getPartyType());
                _senators.add(con.getSenator());
                */
            }
            if(ctx.getChild(i) instanceof SenatorParser.ProgramexpressionContext){

                expr command = (expr) visit(ctx.getChild(i));
                command.setParent(_rootcommand);
                logger.info(String.format("I've added a command here...%d commands so far", _rootcommand.getCommands().size()));
                _rootcommand.add(command);
            }
        }
        return shiz;
    }

    @Override
    public SenatorASTContainer visitSenatordfn( SenatorParser.SenatordfnContext ctx){

        logger.info("Visiting Senator Definition......");
        SenatorASTContainer s = visit(ctx.senatorname());
        Party s1 = (Party)visit(ctx.party());
        SenDefinition sen = new SenDefinition(ctx.senatorname().firstname().getText(), ctx.senatorname().lastname().getText());


        return sen;
    }

    @Override
    public SenatorASTContainer visitSenatorname( SenatorParser.SenatornameContext ctx){
        logger.info("Visiting Senator name......");
        StringDef firstName = (StringDef)visit(ctx.firstname());
        StringDef lastName = (StringDef)visit(ctx.lastname());
        return new SenDefinition(firstName.getString(), lastName.getString());
    }

    @Override
    public SenatorASTContainer visitFirstname( SenatorParser.FirstnameContext ctx){
        return new StringDef(ctx.getText());
    }

    @Override
    public SenatorASTContainer visitLastname( SenatorParser.LastnameContext ctx){
        return new StringDef(ctx.getText());
    }

    @Override
    public SenatorASTContainer visitDemocratRule( SenatorParser.DemocratRuleContext ctx){
        return new Party(PartyType.DEMOCRAT);
    }
    @Override
    public SenatorASTContainer visitReblicanRule( SenatorParser.ReblicanRuleContext ctx){
        return new Party(PartyType.REPUBLICAN);
    }
}
