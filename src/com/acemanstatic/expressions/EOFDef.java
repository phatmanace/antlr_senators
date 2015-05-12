package com.acemanstatic.expressions;



public class EOFDef extends expr{

    public  Result exec(int depth){
        return new NoOpResult();
    }
}
