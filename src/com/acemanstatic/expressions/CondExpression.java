package com.acemanstatic.expressions;

import java.util.List;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class CondExpression extends expr {

    String val;
    Result result = new NoOpResult();

    public CondExpression(expr lhs, expr rhs, String test,  List<expr> commands){
        this.addMany(commands);
    }



    @Override
    public Result exec(int depth) {
        resolveScopeCtx().pushNewScope(String.format("if(%d)", hashCode()));
        Result lastResult = new NoOpResult();
        for(expr ex: getCommands()){
            lastResult = ex.exec(depth + 1);
            if(lastResult.shouldBreak()){
                break;
            }
        }
        resolveScopeCtx().pop();
        return lastResult;
    }

    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
    }
    @Override
    public String toString(){
        return String.format("_IF Statement - %d commands", getCommands().size());
    }
}
