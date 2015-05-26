package com.acemanstatic.expressions;

import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class WaitExpression extends expr {
    Logger logger = Logger.getLogger(WaitExpression.class.getName());
    ConstantExpression lengthMillis = ConstantExpression.zero();
    public WaitExpression(ConstantExpression value){
        lengthMillis = value;
    }

    @Override
    public Result exec(int depth) {
        logger.info(String.format("%s Waiting...for %d ms", repeat(" ", depth), lengthMillis.getIntValue()));
        try{
            Thread.sleep(lengthMillis.getIntValue());
        }catch (InterruptedException ex){}
        return new NoOpResult();
    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }

    @Override
    public String toString(){
        return "{Wait}";
    }
}
