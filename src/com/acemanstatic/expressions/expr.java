package com.acemanstatic.expressions;

import com.acemanstatic.SenatorASTContainer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by phatmanace on 29/04/2015.
 */
public abstract  class expr extends SenatorASTContainer {

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
        this.commands.add(cmd);
    }
    public void addMany(List<expr> cmd){
        this.commands.addAll(cmd);
    }
    public abstract Result exec(int depth);
}
