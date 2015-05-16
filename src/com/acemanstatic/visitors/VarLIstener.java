package com.acemanstatic.visitors;

import com.aceman.SenatorBaseListener;
import com.aceman.SenatorParser;
import com.acemanstatic.Variables.Var;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by phatmanace on 09/05/2015.
 */
public class VarListener extends SenatorBaseListener{

    private Hashtable<String, Var> vars = new Hashtable<>();
    private List<String> errors = new ArrayList<>();


    public VarListener(){

    }

    @Override
    public void enterAssignvar( SenatorParser.AssignvarContext ctx) {
        if(ctx.getParent() == null){
            System.out.println("Printing this from a root node");
        }else{
            System.out.print(String.format("Printing this from a %s",  ctx.getParent().getRuleContext().toStringTree()));

        }
        String varName  = ctx.getChild(1).getText();
        String varValue = ctx.getChild(3).getText();
        System.out.println(String.format("Setting %s to %s", varName, varValue));
        if(vars.containsKey(varName)){
            errors.add(String.format("Redefinition of var %s at %d ", varName, ctx.getStart().getStartIndex()));
        }else {
            Var v = new Var(varValue);
            vars.put(varName, v);
        }

    }

    public boolean areErrors(){
        return errors.size() > 0;
    }

    public List<String> getErrors(){
        return errors;
    }


}
