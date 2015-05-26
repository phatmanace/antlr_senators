package com.acemanstatic.expressions;

import java.util.List;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class ForExpression extends expr {

    String val;
    Result result = new NoOpResult();
    ConstantExpression start = ConstantExpression.zero();
    ConstantExpression stop = ConstantExpression.zero();

    public ForExpression(ConstantExpression start, ConstantExpression stop, List<expr> commands){
        this.start = start;
        this.stop = stop;
        this.addMany(commands);
    }



    @Override
    public Result exec(int depth) {
        logger.info(String.format("For statement Executing(%d,%d)", start.getIntValue(), stop.getIntValue()));
        for(int x = start.getIntValue(); x < stop.getIntValue() ;x++){
            for(expr c:commands){
                c.exec(depth);
            }
        }
        return new NoOpResult();
    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }
    @Override
    public String toString(){
        return String.format("_For Statement - %d commands", getCommands().size());
    }
}
