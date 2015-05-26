package com.acemanstatic.expressions;

import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class FunctionParam extends expr {
    Logger logger = Logger.getLogger(FunctionParam.class.getName());
    String paramName = "";
    ExprType type = ExprType.INTEGER;

    public FunctionParam(String text, ExprType type){
        this.paramName = text; this.type = type;
    }

    @Override
    public Result exec(int depth) {

        logger.info(String.format("Function Call: %s", paramName));
        return new StringResult(String.format("Function Call : %s", paramName));
    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }

    @Override
    public String toString(){
        return "{Display_house_expression}";
    }
}
