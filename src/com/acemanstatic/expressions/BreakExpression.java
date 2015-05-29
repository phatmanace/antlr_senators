package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class BreakExpression extends ValidatingExpression {


    public BreakExpression(){
        super();

    }



    @Override
    public Result exec(int depth) {
        return new BreakResult();
    }

    @Override
    public String toString(){
        return String.format("{Break Expression}");
    }


}
