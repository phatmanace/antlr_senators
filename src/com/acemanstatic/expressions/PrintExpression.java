package com.acemanstatic.expressions;

import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class PrintExpression extends expr {
    Logger logger = Logger.getLogger(PrintExpression.class.getName());
    String displayText = "";
    public PrintExpression(String text){
        this.displayText = text;
    }

    @Override
    public Result exec(int depth) {
        StringBuffer sb = new StringBuffer();
        logAtDepth(depth, resolveScopeCtx().dump());
        if(displayText.indexOf('$') == -1){
            sb.append(displayText);
        }else{
            for(String chunk: displayText.split(" ")){
                if(chunk.startsWith("$")) {
                    String varName = chunk.replace("$", "");
                    sb.append(resolveScopeCtx().resolve(varName).getVarVal().getStringValue());
                }else {
                    sb.append(chunk);
                }
                sb.append(" ");
            }

        }

        logAtDepth(depth, String.format("%s", sb.toString()));
        return new StringResult(String.format("*********%s*********", sb.toString()));
    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }

    @Override
    public String toString(){
        return "{Print_house_expression}";
    }
}
