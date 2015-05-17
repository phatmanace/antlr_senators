package com.acemanstatic;

import com.aceman.SenatorLexer;
import com.aceman.SenatorParser;
import com.aceman.SimpleVars.SimpleVarLexer;
import com.aceman.SimpleVars.SimpleVarParser;
import com.acemanstatic.visitors.VarListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

public class TestRigSimple {



    public static void main(String[] args) throws Exception {



        Logger logger = Logger.getLogger(TestRigSimple.class.getName());

        String filename = "/var/tmp/vars.txt";

        File file = new File(filename);
        FileInputStream fis = new FileInputStream(file);

        int oneByte;
        while ((oneByte = fis.read()) != -1) {
            System.out.write(oneByte);
            // System.out.print((char)oneByte); // could also do this
        }
        System.out.flush();
        System.out.println("-------------------------");


        logger.setUseParentHandlers(false);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);

        BriefFormatter formatter = new BriefFormatter();
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(formatter);


        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(filename));
        SimpleVarLexer lexer = new SimpleVarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleVarParser parser = new SimpleVarParser(tokens);
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
        logger.info("Variable parsing completed ok");
        /*
        parser.reset();
        SenatorParser.StmtContext tree  = parser.stmt();
        InitialParseVisitor visitor = new InitialParseVisitor();



        Object returned = visitor.visit(tree);
        logger.info("Executing program");
        logger.info(visitor.getProgram().exec(0).toString());
        logger.info("done: " + returned);
    */
    }
}

