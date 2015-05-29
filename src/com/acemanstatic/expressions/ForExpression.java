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
        resolveScopeCtx().pushNewScope(String.format("for(%d)", hashCode()));
        logAtDepth(depth, String.format("FR(%d,%d)", start.getIntValue(), stop.getIntValue()));
        Result res = new NoOpResult();
        // loop from the indexes we were given ... unless we get a break statement..
        for(int x = start.getIntValue(); (x < stop.getIntValue() && !res.shouldBreak()) ;x++){
            resolveScopeCtx().setVar(new VarDecl("_index", x, VarMod.PUBLIC));
         //   logAtDepth(depth, resolveScopeCtx().dump());
            for(expr c:commands){
                res = c.exec(depth);
                if(res.shouldBreak()){
                    logAtDepth(depth, "Break baby Break");
                    break;
                }
            }

        }
        resolveScopeCtx().pop();
        return res;
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
