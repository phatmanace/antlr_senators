package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class DisplayHouseExpression extends expr {

    public DisplayHouseExpression(String name){

    }

    @Override
    public Result exec(int depth) {

        return new StringResult("I'm the house");
    }
}
