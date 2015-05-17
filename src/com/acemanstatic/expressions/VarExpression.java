package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class VarExpression extends expr {

    String val;
    Result result = new NoOpResult();

    public VarExpression(String val, ExprType _type){
        this.val = val;
        switch (_type){

            case INTEGER:
                result = new IntResult(Integer.parseInt(val.toString()));
                break;
            case STRING:
                result = new IntResult(Integer.parseInt(val.toString()));
                break;
        }
    }



    @Override
    public Result exec(int depth) {
        return result;
    }

    @Override
    public String toString(){
        return "{Var Expression}";
    }
}