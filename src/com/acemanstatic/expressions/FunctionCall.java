package com.acemanstatic.expressions;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class FunctionCall extends expr {
    Logger logger = Logger.getLogger(FunctionCall.class.getName());
    String functionName = "";
    HashMap<String, FunctionDef> _functions = new HashMap<String, FunctionDef>();
    public FunctionCall(String text, HashMap<String, FunctionDef> _functionMap){
        this.functionName = text;
        this._functions = _functionMap;
    }

    @Override
    public Result exec(int depth) {
        if(!_functions.containsKey(functionName)){
            throw new RuntimeException(String.format("Function %s not defined", functionName));
        }
        resolveScopeCtx().pushNewScope("__functioncall");
        FunctionDef def = _functions.get(functionName);
        for(FunctionParam p: def.getParams()){
            resolveScopeCtx().setVar(new VarDecl(p.paramName, "65"));
        }

        logAtDepth(depth, String.format("Function Call: %s (%s)", functionName, resolveScopeCtx().dump()));
        def.exec(depth + 1);


        return new StringResult(String.format("Function Call : %s", functionName));
    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }

    @Override
    public String toString(){
        return String.format("{FC>%s}", functionName);
    }
}
