package com.Scope;

import com.acemanstatic.ScopeTree;
import com.acemanstatic.expressions.VarDecl;
import com.acemanstatic.expressions.VarMod;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

/**
 * Created by phatmanace on 24/05/2015.
 */
public class RegExTest {
    Logger logger = Logger.getLogger(RegExTest.class.getName());
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }
    @org.junit.Test
    public void RegExTest(){
        logger.info("Starting regEx test");
        String patt = ".*\\$([A-Z]+?).*";
        Pattern p = Pattern.compile(patt);
        String testString = "Foo $POSPO Wibble Wobble";
        if(testString.matches(patt)){
            Matcher m = p.matcher(testString);
            logger.info("regex matches " + m.groupCount());
            logger.info(m.toString());
            for(int i = 0;i < m.groupCount();i++){
                logger.info(String.format("Group %d. ==> %s", i, m.group(i)));
            }
        }else{
            logger.info("doesn't match");
        }

    }


}