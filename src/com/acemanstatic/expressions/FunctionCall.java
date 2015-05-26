package com.acemanstatic.expressions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class FunctionCall extends expr {
    Logger logger = Logger.getLogger(FunctionCall.class.getName());
    String text = "";
    HashMap<String, FunctionDef> _functions = new HashMap<String, FunctionDef>();
    public FunctionCall(String text, HashMap<String, FunctionDef> _functionMap){
        this.text = text;
        this._functions = _functionMap;
    }

    @Override
    public Result exec(int depth) {

        logger.info(String.format("Function Call: %s", text));
        return new StringResult(String.format("Function Call : %s", text));
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
