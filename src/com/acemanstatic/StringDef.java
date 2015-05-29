package com.acemanstatic;

/**
 * Created by phatmanace on 30/04/2015.
 */
public class StringDef extends SenatorASTContainer {

    String name = null;

    public StringDef(String name){
        setString(name);
    }

    public void setString(String name){
        this.name = name;
    }

    public String getString(){
        return name;
    }
}
