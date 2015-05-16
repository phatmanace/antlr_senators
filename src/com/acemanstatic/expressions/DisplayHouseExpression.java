package com.acemanstatic.expressions;

import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class DisplayHouseExpression extends expr {
    Logger logger = Logger.getLogger(DisplayHouseExpression.class.getName());
    public DisplayHouseExpression(String name){

    }

    @Override
    public Result exec(int depth) {
        logger.info("I'm displaying the house");
        return new StringResult("I'm the house");
    }

    @Override
    public String toString(){
        return "{Display_house_expression}";
    }
}
