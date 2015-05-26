package com.acemanstatic.expressions;

import org.antlr.v4.runtime.Token;

import java.util.List;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class RootExpr extends expr {


    public RootExpr(List<expr> commands, Token context
    ){
        addMany(commands);
        setContext(context);

    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }

    @Override
    public Result exec(int depth) {
        logger.info(getCommands().toString());

        List<expr> children = getCommands();
        for(expr c: children){
            logger.info(">>> " + c.getClass().getName());
            c.exec(depth + 1);
        }

        return new StringResult("Foo");
    }
}
