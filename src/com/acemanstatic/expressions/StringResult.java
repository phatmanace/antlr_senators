package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class StringResult extends Result{

    private String val;

    public StringResult(String val){
        this.val = val;
        setType(type.STRING);
    }

    @Override
    public String getStringResult() {
        return val;
    }
}
