package com.acemanstatic;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

/**
 * Created by phatmanace on 14/04/2015.
 */
public abstract class SenatorASTContainer {


    public  void setName(String firstname, String lastname){
        throw new RuntimeException("Not Implemented in superclass");
    }
    public  void setCommand(String command, Token fromtoken){
        throw new RuntimeException("Not Implemented in superclass");
    }
    public  void setParty(PartyType party){
        throw new RuntimeException("Not Implemented in superclass");
    }
    public  void setString(String data){
        throw new RuntimeException("Not Implemented in superclass");
    }
    public  String getString(){
        throw new RuntimeException("Not Implemented in superclass");
    }

    public  String getFirstname(){
        throw new RuntimeException("Not Implemented in superclass");
    }

    public  String getLastname(){
        throw new RuntimeException("Not Implemented in superclass");
    }

    public PartyType getParty(){
        throw new RuntimeException("Not Implemented in superclass");
    }

    private String data = "";

    public SenatorASTContainer(){

    }

    public void setSenator(Senator senator) {
        this.senator = senator;
    }

    private Senator senator = null;
    private PartyType partyType = null;

    public Senator getSenator(){
        return senator;
    }

    public PartyType getPartyType() {
        return partyType;
    }

    public void setPartyType(PartyType partyType) {
        this.partyType = partyType;
    }

    public SenatorASTContainer(String data){
        this.data = data.substring(0, 1).toUpperCase() + data.substring(1);
    }

    public SenatorASTContainer(Senator data){
        this.senator = data;
    }

    public SenatorASTContainer(PartyType data){
        this.partyType = data;
    }

    @Override
    public String toString(){
        return "SenatorASTContainer: " + data.toString();
    }

    public String getData(){
        return data;
    }
}
