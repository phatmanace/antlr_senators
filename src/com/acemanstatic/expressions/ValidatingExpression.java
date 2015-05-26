package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public abstract class ValidatingExpression extends expr {


    public ValidatingExpression(){

    }


    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }

}
