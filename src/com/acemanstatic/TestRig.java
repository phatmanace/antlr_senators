package com.acemanstatic;

import com.aceman.SenatorLexer;
import com.aceman.SenatorParser;
import org.antlr.v4.runtime.*;

import java.io.FileInputStream;

public class TestRig {
    public static void main(String[] args) throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("/var/tmp/senator.txt"));
        SenatorLexer lexer = new SenatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SenatorParser parser = new SenatorParser(tokens);
        parser.setBuildParseTree(true);
        SenatorParser.StmtContext tree  = parser.stmt();

        InitialParseVisitor visitor = new InitialParseVisitor();
        Object returned = visitor.visit(tree);
        visitor.getProgram().exec(0);

        System.out.println("done: " + returned);
    }
}
