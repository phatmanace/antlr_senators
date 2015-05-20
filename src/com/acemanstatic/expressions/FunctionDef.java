package com.acemanstatic.expressions;

import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class FunctionDef extends expr {
    Logger logger = Logger.getLogger(FunctionDef.class.getName());
    String text = "";
    public FunctionDef(String text){
        this.text = text;
    }

    @Override
    public Result exec(int depth) {

        logger.info(String.format("Function Call: %s", text));
        return new StringResult(String.format("Function Call : %s", text));
    }

    @Override
    public String toString(){
        return "{Display_house_expression}";
    }
}
