package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class NoOpResult extends Result{

    public NoOpResult(){

    }

    @Override
    public String getStringResult() {
        return "{NoOp()}";
    }
}
