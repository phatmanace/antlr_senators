package com.acemanstatic;

import com.aceman.SenatorBaseVisitor;
import com.aceman.SenatorParser;
import com.acemanstatic.expressions.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Logger;

public class InitialParseVisitor extends SenatorBaseVisitor<SenatorASTContainer> {

    Logger logger = Logger.getLogger(InitialParseVisitor.class.getName());
    SenatorASTContainer shiz = new ProgramContainer();
    ArrayList<Senator> _senators = new ArrayList<>();
    HashMap<String, PartyType> _senPartyMap = new HashMap<>();

    public expr _rootcommand = new RootExpr(Collections.<expr>emptyList(), null);

    public expr getProgram() {
        return _rootcommand;
    }







    @Override
    public SenatorASTContainer visitDisplayMyHouse(SenatorParser.DisplayMyHouseContext ctx){
        expr command = new DisplayHouseExpression("Display me");
        command.setContext(ctx.getStart());
        return command;
    }

    @Override
    public SenatorASTContainer visitPrinthouse(SenatorParser.PrinthouseContext ctx){
        logger.info("(V)Print house");
        expr command = new DisplayHouseExpression("Print me");
        command.setContext(ctx.getStart());
        return command;
    }



    @Override
    public SenatorASTContainer visitVar( SenatorParser.VarContext ctx) {
        logger.info("Visit for var eval : " + ctx.getText() + " => " + ctx.ID());
        expr command = new DisplayHouseExpression("Print me");
        command.setContext(ctx.getStart());
        return command;
    }

    @Override
    public SenatorASTContainer visitForIndexVar(SenatorParser.ForIndexVarContext ctx){
        visit(ctx.var());
        logger.info("Visit for index start by Var: " + ctx.getText() + " => " + ctx.var().ID());

        expr command = new DisplayHouseExpression("Print me");
        command.setContext(ctx.getStart());
        return(command);
    }

    @Override
    public SenatorASTContainer visitLoop(SenatorParser.LoopContext ctx){
        logger.info("Visiting Loop..." + ctx.getStart() + "..." + ctx.getChildCount());

        LinkedList<expr> commands = new LinkedList<>();
        visit(ctx.foridxitem(0));
        visit(ctx.foridxitem(1));

        ForExpression command = new ForExpression(1, 5, commands);


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
    public SenatorASTContainer visitTopLevelRule( SenatorParser.TopLevelRuleContext ctx){
        logger.info("Visiting top level statement......");

        for(int i = 0;i < ctx.getChildCount();i++){
            if(ctx.getChild(i) instanceof SenatorParser.SenatordfnContext){
                SenatorParser.SenatordfnContext senator = (SenatorParser.SenatordfnContext)ctx.getChild(i);
                SenatorASTContainer con = visit(senator);
                logger.info(String.format("ss:>%d", _senators.size()));
                if(_senators.contains(con.getSenator())){
                    throw new RuntimeException(String.format("You already have defined Senator(%s)", con.getSenator()));
                }
                if(_senPartyMap.containsKey(con.getSenator().getFullName()) && (_senPartyMap.get(con.getSenator().getFullName()) !=  con.getSenator().getPartyType())){
                    throw new RuntimeException(String.format("You already have defined Senator(%s), but they have a different party (%s)", con.getSenator(), _senPartyMap.get(con.getSenator().getFullName())));
                }
                _senPartyMap.put(con.getSenator().getFullName(), con.getSenator().getPartyType());
                _senators.add(con.getSenator());
            }
            if(ctx.getChild(i) instanceof SenatorParser.ProgstmtContext){
                logger.info("Class Name is " + ((SenatorParser.ProgstmtContext) ctx.getChild(i)).getClass().getName());
                expr command = (expr) visit(ctx.getChild(i));
                _rootcommand.add(command);
            }
        }

        for(Senator s:_senators){
            logger.info("[Senators_Print]> " + s);
        }
        return shiz;
    }

    @Override
    public SenatorASTContainer visitSenatordfn( SenatorParser.SenatordfnContext ctx){

        logger.info("Visiting Senator Definition......");
        SenatorASTContainer s = visit(ctx.senatorname());
        Party s1 = (Party)visit(ctx.party());
        Senator sen = new Senator(s.getFirstname(), s.getLastname());
        sen.setPartyType(s1.getPartyType());

        return new SenDefinition(sen);
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
