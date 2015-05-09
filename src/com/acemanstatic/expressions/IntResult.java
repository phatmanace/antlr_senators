package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class IntResult  extends Result{

    private int val;

    public IntResult(int val){
        this.val = val;
        setType(type.INTEGER);
    }

    @Override
    public int getResult() {
        return val;
    }
}
