package com.acemanstatic;

import com.aceman.SenatorLexer;
import com.aceman.SenatorParser;
import com.acemanstatic.visitors.VarListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;

public class TestRig {
    public static void main(String[] args) throws Exception {

        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("/var/tmp/senator.txt"));
        SenatorLexer lexer = new SenatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SenatorParser parser = new SenatorParser(tokens);
       // parser.setBuildParseTree(true);

        VarListener vl =new VarListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(vl, parser.stmt());

        if(vl.areErrors()){
            System.out.println("Compilation Errors");
            for(String s : vl.getErrors()){
                System.out.println(String.format("Error Coco>> %s", s));
            }
            System.out.println("Not proceeding further");
            System.exit(-1);
        }

        parser.reset();
        SenatorParser.StmtContext tree  = parser.stmt();
        InitialParseVisitor visitor = new InitialParseVisitor();



        Object returned = visitor.visit(tree);
        visitor.getProgram().exec(0);

        System.out.println("done: " + returned);

    }
}
