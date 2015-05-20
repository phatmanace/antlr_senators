package com.acemanstatic;

import com.aceman.SenatorLexer;
import com.aceman.SenatorParser;
import com.acemanstatic.expressions.expr;
import com.acemanstatic.visitors.VarListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.*;

public class TestRig {



    public static void main(String[] args) throws Exception {



        Logger logger = Logger.getLogger(TestRig.class.getName());

        String filename = "/var/tmp/senator.txt";

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
        SenatorLexer lexer = new SenatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SenatorParser parser = new SenatorParser(tokens);
       // parser.setBuildParseTree(true);


        VarListener vl =new VarListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(vl, parser.stmt());

        logger.info(String.format("Variable parsing completed ok: %d variables found ",  vl.getCount()));


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
        logger.info("Executing program");
        expr program = visitor.getProgram();
        logger.info(program.exec(0).toString());
        logger.info("done: " + returned);

    }
}

class BriefFormatter extends Formatter
{
    public BriefFormatter() { super(); }

    @Override
    public String format(final LogRecord record)
    {
        return record.getMessage();
    }
}