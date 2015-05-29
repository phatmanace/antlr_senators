package com.acemanstatic.expressions;

import com.acemanstatic.ScopeTree;
import com.acemanstatic.SenatorASTContainer;
import org.antlr.v4.runtime.Token;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 29/04/2015.
 */
public abstract  class SenatorDef extends expr {

    Logger logger = Logger.getLogger(SenatorDef.class.getName());
    private SenatorDef _parent = null;

    public SenatorDef getParent() {
        return _parent;
    }

    public void setParent(SenatorDef _parent) {
        this._parent = _parent;
    }

    public Token getContext() {
        return context;
    }

    public ScopeTree getScope() {
        return scope;
    }
    protected void logAtDepth(int depth, String log){
        StringBuffer sb = new StringBuffer("");
        for(int i = 0; i < depth;i++){
            sb.append(" ");
        }
        logger.info(String.format("%s %s", sb.toString(), log));
    }

    public ScopeTree resolveScopeCtx(){
        SenatorDef e = this;
        while(e.getScope() == null){
          e = e.getParent();
          if(e.getScope() != null){
              return e.getScope();
          }
        }
        throw new RuntimeException("Failed to resolve scope");
    }



    public void setScope(ScopeTree scope) {
        this.scope = scope;
    }


    private ScopeTree scope = null;



    public void setContext(Token context) {
        this.context = context;
    }

    private Token context;
    public String command = null;
    private Token fromtoken = null;

    public LinkedList<SenatorDef> commands = new LinkedList<>();
    public SenatorDef(LinkedList<SenatorDef> commands, Token fromtoken){
        super();
        this.commands.addAll(commands);
        this.fromtoken = fromtoken;
    }
    public SenatorDef(){
        super();
    }
    public SenatorDef(String name, Token fromtoken){
        super();
        setCommand(name, fromtoken);
    }
    public int getIntValue(){
        throw new RuntimeException("Not Implemented at expr() level");
    }
    public void setCommand(String command, Token fromtoken){
        this.command = command;
        this.fromtoken = fromtoken;
    }
    public void add(SenatorDef cmd){
        if(true || cmd.getCommands().size() > 0) {
            logger.info(String.format("Adding command [%s] to class", cmd.getClass().getName()));
            this.commands.add(cmd);
        }else{
            logger.warning("Pruning empty command... " + cmd.toString());
        }
    }

    public abstract Result exec(int depth);
    public abstract ValidationResult validate();


    public static String repeat(String s, int n) {
        if(s == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(s.length() * n);
        for(int i = 0; i < n; i++) {
            sb.append(s);
        }
        return sb.toString();
    }
}
