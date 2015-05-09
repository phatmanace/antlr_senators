package com.acemanstatic.expressions;

import java.util.List;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class ForExpression extends expr {

    String val;
    Result result = new NoOpResult();

    public ForExpression(int start, int stop, List<expr> commands){
        this.addMany(commands);
    }



    @Override
    public Result exec(int depth) {
        return result;
    }
}
