package com.acemanstatic.expressions;

import java.util.List;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class ForExpression extends expr {

    String val;
    Result result = new NoOpResult();
    int start = 0;
    int stop = 0;

    public ForExpression(int start, int stop, List<expr> commands){
        this.start = 0;
        this.stop = 0;
        this.addMany(commands);
    }



    @Override
    public Result exec(int depth) {

        for(int x = start; x < stop ;x++){
            for(expr c:commands){
                c.exec(depth);
            }
        }
        return new NoOpResult();
    }
}
