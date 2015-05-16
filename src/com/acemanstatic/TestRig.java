package com.acemanstatic;

import com.aceman.SenatorLexer;
import com.aceman.SenatorParser;
import com.acemanstatic.visitors.VarListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class TestRig {



    public static void main(String[] args) throws Exception {



        Logger logger = Logger.getLogger(TestRig.class.getName());

        for(Handler iHandler:logger.getParent().getHandlers())
        {
           // logger.getParent().removeHandler(iHandler);
        }

        logger.setUseParentHandlers(false);

        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);

        BriefFormatter formatter = new BriefFormatter();
        ConsoleHandler handler = new ConsoleHandler();
        handler.setFormatter(formatter);


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
        logger.info("Executing program");
        logger.info(visitor.getProgram().exec(0).toString());
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