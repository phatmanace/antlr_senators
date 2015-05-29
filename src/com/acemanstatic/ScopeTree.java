package com.acemanstatic;

import com.acemanstatic.expressions.VarDecl;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 24/05/2015.
 */
public class ScopeTree {
    LinkedList<ScopeImpl> scopes = new LinkedList<ScopeImpl>();
    Logger logger = Logger.getLogger(ScopeTree.class.getName());
    public ScopeTree(){
        pushNewScope("_global");
    }

    public void pushNewScope(String scopename){
        scopes.addLast(new ScopeImpl(scopename));

    }
    public VarDecl resolve(String varName){
        ScopeImpl scope = scopes.getLast();
        ListIterator<ScopeImpl> it = scopes.listIterator(scopes.size());
        do{
           if(scope.containsVar(varName)){
               return scope.getVar(varName);
           }
           scope = it.previous();
        }while(it.hasPrevious());
        throw new RuntimeException("Failed to resolve Variable: " + varName);
    }

    public void setVar(VarDecl var){
        scopes.getLast().add(var);

    }


    public int getScopeCount(){
        return scopes.size();
    }
    public void pop(){
        scopes.removeLast();
    }
    public String dump(){
        StringBuilder sb = new StringBuilder();
        ListIterator<ScopeImpl> it = scopes.listIterator();
        while(it.hasNext()){
            ScopeImpl n = it.next();
            sb.append(n.getScopeName() + "{" + n.getVarNames() + "}");
            if(it.hasNext()){
                sb.append("==>");
            }
        }
        return sb.toString();
    }
    @Override
    public String toString(){
        return "{ScopeTree: " + scopes.getLast() + "}";
    }

}
