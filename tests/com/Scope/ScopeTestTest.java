package com.Scope;

import com.acemanstatic.ScopeTree;
import com.acemanstatic.expressions.VarDecl;
import com.acemanstatic.expressions.VarMod;

import static org.junit.Assert.*;

/**
 * Created by phatmanace on 24/05/2015.
 */
public class ScopeTestTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }
    @org.junit.Test
    public void BasicScopeTest(){
        ScopeTree test = new ScopeTree();
        test.setVar(new VarDecl("_root", "4"));
        test.setVar(new VarDecl("D", "4"));
        test.pushNewScope("Aceman");
        test.setVar(new VarDecl("A", "4"));
        test.setVar(new VarDecl("B", "4"));
        test.setVar(new VarDecl("C", "4"));
        System.out.println(test.dump());
    }
    @org.junit.Test
    public void ScopeTest1(){
        ScopeTree test = new ScopeTree();
        test.setVar(new VarDecl("_root", "4"));
        test.setVar(new VarDecl("D", "4"));
        test.pushNewScope("Aceman");
        test.setVar(new VarDecl("A", "4"));
        test.setVar(new VarDecl("B", "4D"));
        test.setVar(new VarDecl("C", "4E"));
        assertEquals( "Should be two scopes", 2, test.getScopeCount());
        System.out.println(test.dump());
        test.pop();
       assertEquals( "Should be only one scope", 1, test.getScopeCount());
        System.out.println(test.dump());

    }

    @org.junit.Test
    public void ScopeTest2(){
        ScopeTree test = new ScopeTree();
        test.setVar(new VarDecl("_root", "4"));
        test.setVar(new VarDecl("D", "4"));

        System.out.println("Resolved to " + test.resolve("_root").getVarVal().getIntVal());

    }

    @org.junit.Test
    public void ScopeTestReadOnly(){
        ScopeTree test = new ScopeTree();
        test.setVar(new VarDecl("_root", "4"));
        test.setVar(new VarDecl("E", "4", VarMod.WRITE_ONCE_READ_MANY));
        test.setVar(new VarDecl("D", "4"));

        System.out.println("Resolved to " + test.resolve("_root").getVarVal().getIntVal());

    }


    @org.junit.Test
    public void ScopeTest3(){
        ScopeTree test = new ScopeTree();
        test.setVar(new VarDecl("_root", "4"));
        test.setVar(new VarDecl("D", "4"));
        test.pushNewScope("New");
        test.setVar(new VarDecl("_root", "5"));
        System.out.println("Resolved to " + test.resolve("_root").getVarVal().getIntVal());
        test.pop();
        System.out.println("Resolved to " + test.resolve("_root").getVarVal().getIntVal());

    }

}