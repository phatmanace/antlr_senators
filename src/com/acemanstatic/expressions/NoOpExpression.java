package com.acemanstatic.expressions;

import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class NoOpExpression extends expr {
    Logger logger = Logger.getLogger(NoOpExpression.class.getName());

    @Override
    public Result exec(int depth) {

        return new NoOpResult();
    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }

    @Override
    public String toString(){
        return "{No_op exprezsion}";
    }
}
