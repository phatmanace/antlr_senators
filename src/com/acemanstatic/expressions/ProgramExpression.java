package com.acemanstatic.expressions;

import org.antlr.v4.runtime.Token;

import java.util.List;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class ProgramExpression extends expr {


    public ProgramExpression(List<expr> commands, Token context
    ){
        addMany(commands);
        setContext(context);

    }

    @Override
    public Result exec(int depth) {
        logger.info("Exec'ing at depth " + depth);
        logger.info(getCommands().toString());

        List<expr> children = getCommands();
        for(expr c: children){
            for(int i = 0; i <  depth;i++){
                logger.info("  ");
            }
            logger.info(">>> " + c.getClass().getName());
        }

        return new StringResult("Foo");
    }
    @Override
    public String toString(){
        return String.format("Program Statement - %d commands", getCommands().size());
    }
}
