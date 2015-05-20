package com.acemanstatic.expressions;

import com.acemanstatic.PartyType;
import com.acemanstatic.Senator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class PrintExpression extends expr {
    Logger logger = Logger.getLogger(PrintExpression.class.getName());
    String text = "";
    public PrintExpression(String text){
        this.text = text;
    }

    @Override
    public Result exec(int depth) {

        logger.info(String.format("*********%s*********", text));
        return new StringResult(String.format("*********%s*********", text));
    }

    @Override
    public String toString(){
        return "{Display_house_expression}";
    }
}
