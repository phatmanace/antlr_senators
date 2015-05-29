package com.acemanstatic.expressions;

/**
 * Created by phatmanace on 08/05/2015.
 */
public abstract class Result {

    public enum type{INTEGER,STRING};
    public type _type;

    public boolean shouldBreak(){
        return false;
    }

    public type getType(){
        return _type;
    }
    public void setType(type _type){
        this._type = _type;
    }
    public int getResult(){
        throw new RuntimeException("Not implemented");
    }

    public String getStringResult(){
        throw new RuntimeException("Not implemented");
    }

}
