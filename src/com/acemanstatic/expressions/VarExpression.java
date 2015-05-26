package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class VarExpression extends expr {

    String val;
    ExprType _type = null;
    Result result = new NoOpResult();

    public VarExpression(String val, ExprType _type){
        this.val = val;
        switch (_type){

            case INTEGER:
                result = new IntResult(Integer.parseInt(val.toString()));
                _type = ExprType.INTEGER;
                break;
            case STRING:
                result = new IntResult(Integer.parseInt(val.toString()));
                _type = ExprType.STRING;
                break;
        }
    }

    public VarExpression(String val){
        this.val = val;
        try{
            result = new IntResult(Integer.parseInt(val.toString()));
            _type = ExprType.INTEGER;
        }catch(Exception e){
            result = new IntResult(Integer.parseInt(val.toString()));
            _type = ExprType.STRING;
        }
    }


    @Override
    public ValidationResult validate(){
        return new ValidationResult(Valid.OK);
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
