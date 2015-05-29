package com.acemanstatic;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

/**
 * Created by phatmanace on 14/04/2015.
 */
public abstract class SenatorASTContainer {



    public  void setCommand(String command, Token fromtoken){
        throw new RuntimeException("Not Implemented in superclass");
    }


    public SenatorASTContainer(){

    }


    @Override
    public String toString(){
        return "SenSuperClass";
    }

}
