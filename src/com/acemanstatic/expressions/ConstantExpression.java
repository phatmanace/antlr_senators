package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class ConstantExpression extends expr {

    String val;
    Result result = new NoOpResult();
    private ExprType type = ExprType.INTEGER;

    public ConstantExpression(String val, ExprType _type){
        this.val = val;
        this.type = _type;
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
    public int getIntValue(){
        if(type == ExprType.INTEGER){
           return result.getResult();
        }
        throw new RuntimeException("Expected String, but you called me like an integer");
    }

    @Override
    public Result exec(int depth) {
        return result;
    }

    @Override
    public String toString(){
        return String.format("{Constant Expression:%s}", result.getResult());
    }


    public static ConstantExpression zero(){
        return(new ConstantExpression("0", ExprType.INTEGER));
    }
}
