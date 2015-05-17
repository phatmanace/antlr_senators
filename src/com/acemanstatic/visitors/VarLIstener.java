package com.acemanstatic.visitors;

import com.aceman.SenatorBaseListener;
import com.aceman.SenatorParser;
import com.acemanstatic.Variables.Var;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 09/05/2015.
 */
public class VarListener extends SenatorBaseListener{

    Logger logger = Logger.getLogger(VarListener.class.getName());
    private Hashtable<String, Var> vars = new Hashtable<>();
    private List<String> errors = new ArrayList<>();


    public VarListener(){

    }

    @Override
    public void enterAssignvar( SenatorParser.AssignvarContext ctx) {
        if(ctx.getParent() == null){
            logger.info("Printing this from a root node");
        }else{
           // logger.info(String.format("Printing this from a %s",  ctx.getParent().getRuleContext().toStringTree()));

        }
        String varName  = ctx.getChild(1).getText();
        String varValue = ctx.getChild(3).getText();
        logger.info(String.format("Setting %s to %s", varName, varValue));
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

    public int getCount(){
        return vars.size();
    }


}
