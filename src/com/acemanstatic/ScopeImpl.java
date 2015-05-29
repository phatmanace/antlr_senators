package com.acemanstatic;

import com.acemanstatic.expressions.VarDecl;
import com.acemanstatic.expressions.VarMod;

import java.util.HashMap;

/**
 * Created by phatmanace on 24/05/2015.
 */
public class ScopeImpl {
    private String name = "";
    HashMap<String, VarDecl> vars = new HashMap<>();
    public ScopeImpl(String name){
        this.name = name;
    }
    public String getScopeName(){
        return(name);
    }
    public boolean containsVar(String varname){
        return vars.containsKey(varname);
    }
    public VarDecl getVar(String varname){
        return vars.get(varname);
    }
    public void add(VarDecl newvar){
        // check if new exists
        if(vars.containsKey(newvar.getVarName()) && vars.get(newvar.getVarName()).getModifiers() == VarMod.WRITE_ONCE_READ_MANY){
            throw new RuntimeException(String.format("Couldn't update Variable - %s already set and marked read only", newvar.getVarName()));
        }
        vars.put(newvar.getVarName(), newvar);
    }
    public String getVarNames(){
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for(String key : vars.keySet()){
            if(!first){sb.append(",");}
            sb.append(String.format("%s=%s", key, vars.get(key).getVarVal().getStringValue()));

            first = false;

        }
        return sb.toString();
    }
}
