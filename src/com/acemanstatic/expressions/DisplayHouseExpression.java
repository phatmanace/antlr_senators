package com.acemanstatic.expressions;

import com.acemanstatic.PartyType;
import com.acemanstatic.Senator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class DisplayHouseExpression extends expr {
    Logger logger = Logger.getLogger(DisplayHouseExpression.class.getName());
    List<Senator> _senators = new ArrayList<>();
    public DisplayHouseExpression(List<Senator> _senators){
        this._senators = _senators;

    }

    @Override
    public Result exec(int depth) {
        logger.info("Your Congress");
        StringBuilder sb = new StringBuilder("");
        for(Senator sen : _senators){
            if(sen.getPartyType() == PartyType.DEMOCRAT){
                sb.append(sen.getFullName());
                sb.append(" ");
            }
        }
        logger.info("Democrats: " + sb.toString());
        sb.setLength(0);
        for(Senator sen : _senators){
            if(sen.getPartyType() == PartyType.REPUBLICAN){
                sb.append(sen.getFullName());
                sb.append(" ");
            }
        }
        logger.info("Repulicans: " + sb.toString());
        return new StringResult("I'm the house");
    }

    @Override
    public String toString(){
        return "{Display_house_expression}";
    }
}
