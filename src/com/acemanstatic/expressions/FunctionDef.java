package com.acemanstatic.expressions;


import sun.org.mozilla.javascript.internal.Function;

import java.util.*;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class FunctionDef extends expr {
    Logger logger = Logger.getLogger(FunctionDef.class.getName());
    String functionname = "";
    List<FunctionParam> params = new LinkedList<FunctionParam>();

    public List<expr> getStatements() {
        return statements;
    }
    public String getFunctionname(){
        return functionname;
    }

    public void setStatements(List<expr> statements) {
        this.statements = statements;
    }
    public void addStatement(expr statement){
        this.statements.add(statement);
    }

    List<expr> statements = new LinkedList<expr>();

    public ExprType getReturnType() {
        return returnType;
    }

    public void setReturnType(ExprType returnType) {
        this.returnType = returnType;
    }

    ExprType returnType = ExprType.VOID;


    public void addParameter(FunctionParam param){
        params.add(param);
    }
    public FunctionDef(String text){
        this.functionname = text;
    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }

    @Override
    public Result exec(int depth) {

        logger.info(String.format("Function Call: %s", functionname));
        return new StringResult(String.format("Function Call : %s", functionname));
    }

    @Override
    public String toString(){
        return String.format("{FN %s(%s) => %s}", functionname, getTypesAsString(), getReturnType());
    }
    private String getTypesAsString(){
        StringBuilder sb = new StringBuilder("");
        boolean first = true;
        for(FunctionParam p: params){
            if(!first) sb.append(",");
            sb.append(p.type);
            first = false;
        }
        return sb.toString();
    }
}
