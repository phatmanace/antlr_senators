package com.acemanstatic;

/**
 * Created by phatmanace on 29/04/2015.
 */
public class SenDefinition extends SenatorASTContainer {

    public String firstname, lastname;
    private Senator senator;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public PartyType getParty() {
        return party;
    }

    public PartyType party;

    public SenDefinition(String fn, String ln){
        setName(fn,ln);
    }

    public SenDefinition(Senator senator){
        setSenator(senator);
    }

    public void setSenator(Senator senator){
        this.senator = senator;
    }
    public Senator getSenator(){
        return senator;
    }

    public void setName(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void setParty(PartyType party){
        this.party = party;
    }
    public void setCommand(String command){
        throw new RuntimeException("Can't set command on a senator");
    }
}
