package com.acemanstatic;

import com.aceman.SenatorBaseVisitor;
import com.aceman.SenatorParser;
import com.acemanstatic.expressions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by phatmanace on 14/04/2015.
 */
public class InitialParseVisitor extends SenatorBaseVisitor<SenatorASTContainer> {

    SenatorASTContainer shiz = new ProgramContainer();
    ArrayList<Senator> _senators = new ArrayList<>();
    HashMap<String, PartyType> _senPartyMap = new HashMap<>();

    public expr getProgram() {
        return commands;
    }



    public expr commands = new RootExpr(Collections.<expr>emptyList(), null);



    @Override
    public SenatorASTContainer visitDisplayMyHouse(SenatorParser.DisplayMyHouseContext ctx){
        expr command = new DisplayHouseExpression("Display me");
        command.setContext(ctx.getStart());
        return command;
    }

    @Override
    public SenatorASTContainer visitPrinthouse(SenatorParser.PrinthouseContext ctx){
        expr command = new DisplayHouseExpression("Print me");
        command.setContext(ctx.getStart());
        return command;
    }

    @Override
    public SenatorASTContainer visitForIndexNum(SenatorParser.ForIndexNumContext ctx){
        System.out.println("Visit for index start by number" + ctx.getText());
        expr command = new ConstantExpression(ctx.getText(), ExprType.STRING);
        command.setContext(ctx.getStart());

        return command;
    }

    @Override
    public SenatorASTContainer visitVar( SenatorParser.VarContext ctx) {
        System.out.println("Visit for var eval : " + ctx.getText() + " => " + ctx.ID());
        expr command = new DisplayHouseExpression("Print me");
        command.setContext(ctx.getStart());
        return command;
    }

    @Override
    public SenatorASTContainer visitForIndexVar(SenatorParser.ForIndexVarContext ctx){
        visit(ctx.var());
        System.out.println("Visit for index start by Var: " + ctx.getText() + " => " + ctx.var().ID());

        expr command = new DisplayHouseExpression("Print me");
        command.setContext(ctx.getStart());
        return(command);
    }

    @Override
    public SenatorASTContainer visitLoop(SenatorParser.LoopContext ctx){
        System.out.println("Visiting Loop..." + ctx.getStart() + "..." + ctx.getChildCount());

        LinkedList<expr> commands = new LinkedList<>();
        visit(ctx.foridxitem(0));
        visit(ctx.foridxitem(1));

        ForExpression command = new ForExpression(1, 2, commands);


       // System.out.println(ctx.foridxstart().getText() + "::" +  (ctx.foridxstart().getRuleIndex() == SenatorParser.RULE_foridxstart));
       // System.out.println(ctx.foridxstop().getText());
        /*
        for(int i = 0;i < ctx.getChildCount();i++){
            ParseTree o = ctx.getChild(i);
            commands.add((expr)visit(o));
        }
        */
        System.out.println("Done..Visiting Loop..." + ctx.getStart());
        command.setContext(ctx.getStart());
        return command;
    }

    @Override
    public SenatorASTContainer visitProgstmt(SenatorParser.ProgstmtContext ctx){
        LinkedList<expr> commands = new LinkedList<>();
        for(int i = 0;i < ctx.getChildCount();i++){
            commands.add((expr)visit(ctx.getChild(i)));
        }
        return new RootExpr(commands, ctx.getStart());
    }
    @Override
    public SenatorASTContainer visitTopLevelRule( SenatorParser.TopLevelRuleContext ctx){
        System.out.println("Visiting top level statement......");

        for(int i = 0;i < ctx.getChildCount();i++){
            if(ctx.getChild(i) instanceof SenatorParser.SenatordfnContext){
                SenatorParser.SenatordfnContext senator = (SenatorParser.SenatordfnContext)ctx.getChild(i);
                SenatorASTContainer con = visit(senator);
                System.out.println(String.format("ss:>%d", _senators.size()));
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
                System.out.println(((SenatorParser.ProgstmtContext) ctx.getChild(i)).getClass().getName());
                commands.add((expr) visit(ctx.getChild(i)));
            }
        }

        for(Senator s:_senators){
            System.out.println("> " + s);
        }
        return shiz;
    }

    @Override
    public SenatorASTContainer visitSenatordfn( SenatorParser.SenatordfnContext ctx){

        System.out.println("Visiting Senator Definition......");
        SenatorASTContainer s = visit(ctx.senatorname());
        Party s1 = (Party)visit(ctx.party());
        Senator sen = new Senator(s.getFirstname(), s.getLastname());
        sen.setPartyType(s1.getPartyType());

        return new SenDefinition(sen);
    }
    @Override
    public SenatorASTContainer visitEndofstatement(SenatorParser.EndofstatementContext ctx){
        System.out.println("Visiting EOF......");

        return new EOFDef();
    }
    @Override
    public SenatorASTContainer visitSenatorname( SenatorParser.SenatornameContext ctx){
        System.out.println("Visiting Senator name......");
        StringDef firstName = (StringDef)visit(ctx.firstname());
        StringDef lastName = (StringDef)visit(ctx.lastname());
        return new SenDefinition(firstName.getString(), lastName.getString());
    }

    @Override
    public SenatorASTContainer visitFirstname( SenatorParser.FirstnameContext ctx){
        System.out.println(".....Visiting Senator Firstname......");
        return new StringDef(ctx.getText());
    }

    @Override
    public SenatorASTContainer visitLastname( SenatorParser.LastnameContext ctx){
        System.out.println("......Visiting Senator Last name......");
        return new StringDef(ctx.getText());
    }

    @Override
    public SenatorASTContainer visitDemocratRule( SenatorParser.DemocratRuleContext ctx){
        System.out.println("......Visiting Senator Democrat name......");

        return new Party(PartyType.DEMOCRAT);
    }
    @Override
    public SenatorASTContainer visitReblicanRule( SenatorParser.ReblicanRuleContext ctx){
        System.out.println("......Visiting Senator Republican name......");

        return new Party(PartyType.REPUBLICAN);
    }
}
