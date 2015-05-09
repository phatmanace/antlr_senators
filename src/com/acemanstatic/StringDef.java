package com.acemanstatic;

/**
 * Created by phatmanace on 30/04/2015.
 */
public class StringDef extends SenatorASTContainer {

    String name = null;

    public StringDef(String name){
        setString(name);
    }
    @Override
    public void setString(String name){
        this.name = name;
    }
    @Override
    public String getString(){
        return name;
    }
}
