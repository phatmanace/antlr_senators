package com.acemanstatic;

import com.sun.xml.internal.ws.client.SenderException;

/**
 * Created by phatmanace on 27/04/2015.
 */
public class Senator {
    String firstname, lastname;
    PartyType partyType;
    public Senator(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }


    public PartyType getPartyType() {
        return partyType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Senator senator = (Senator) o;

        if (firstname != null ? !firstname.equals(senator.firstname) : senator.firstname != null) return false;
        if (lastname != null ? !lastname.equals(senator.lastname) : senator.lastname != null) return false;
        return partyType == senator.partyType;


    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (partyType != null ? partyType.hashCode() : 0);
        return result;
    }

    public void setPartyType(PartyType partyType) {
        this.partyType = partyType;

    }

    public String toString(){
        return String.format("%s, %s {%s}", lastname, firstname, partyType);
    }

    public String getFullName(){
        return String.format("%s, %s", lastname, firstname);
    }

}
