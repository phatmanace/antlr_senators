package com.acemanstatic.expressions;



public class EOFDef extends ValidatingExpression{

    public  Result exec(int depth){
        return new NoOpResult();
    }
}
