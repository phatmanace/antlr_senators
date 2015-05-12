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
    public Result exec(int depth) {
        System.out.print(getCommands());

        List<expr> children = getCommands();
        for(expr c: children){
            System.out.println(">>> " + c.getClass().getName());
        }

        return new StringResult("Foo");
    }
}
