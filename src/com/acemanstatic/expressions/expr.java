package com.acemanstatic.expressions;

import com.acemanstatic.SenatorASTContainer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 29/04/2015.
 */
public abstract  class expr extends SenatorASTContainer {

    Logger logger = Logger.getLogger(expr.class.getName());
    public Token getContext() {
        return context;
    }

    public void setContext(Token context) {
        this.context = context;
    }

    private Token context;
    public String command = null;
    private Token fromtoken = null;

    public LinkedList<expr> commands = new LinkedList<>();
    public expr(LinkedList<expr> commands, Token fromtoken){
        super();
        this.commands.addAll(commands);
        this.fromtoken = fromtoken;
    }
    public expr(){
        super();
    }
    public expr(String name, Token fromtoken){
        super();
        setCommand(name, fromtoken);
    }
    public void setCommand(String command, Token fromtoken){
        this.command = command;
        this.fromtoken = fromtoken;
    }
    public void add(expr cmd){
        if(cmd.getCommands().size() > 0) {
            logger.info(String.format("Adding command [%s] to class", cmd.getClass().getName()));
            this.commands.add(cmd);
        }else{
            logger.warning("Pruning empty command... " + cmd.toString());
        }
    }
    public void addMany(List<expr> cmd){
        this.commands.addAll(cmd);
    }
    public abstract Result exec(int depth);

    public List<expr> getCommands(){
        return commands;
    }
}
