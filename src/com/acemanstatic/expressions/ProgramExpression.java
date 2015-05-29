package com.acemanstatic.expressions;

import org.antlr.v4.runtime.Token;

import java.util.List;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class ProgramExpression extends expr {


    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }

    public ProgramExpression(List<expr> commands, Token context
    ){

        for(expr command: commands){
            command.setParent(this);
            add(command);
        }
        setContext(context);

    }

    @Override
    public Result exec(int depth) {

        Result res = new NoOpResult();
        List<expr> children = getCommands();
        for(expr c: children){
           res =  c.exec(depth + 1);
           if(res.shouldBreak()){
               break;
           }
        }

        return res;
    }
    @Override
    public String toString(){
        return String.format("Program Statement - %d commands", getCommands().size());
    }
}
