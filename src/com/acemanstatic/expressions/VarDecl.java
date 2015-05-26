package com.acemanstatic.expressions;

import com.acemanstatic.PartyType;
import com.acemanstatic.Senator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class VarDecl extends expr {
    Logger logger = Logger.getLogger(VarDecl.class.getName());

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public VarExpression getVarVal() {
        return varVal;
    }

    public void setVarVal(VarExpression varVal) {
        this.varVal = varVal;
    }

    String varName = null;
    VarExpression varVal = null;
    public VarDecl(String name, String value){
        this.varName = name;
        this.varVal = new VarExpression(value);

    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }
    @Override
    public Result exec(int depth) {
        logger.info("Variable Declaration");
        return new StringResult("VarDecl");
    }

    @Override
    public String toString(){
        return "{Var Decl}";
    }
}
