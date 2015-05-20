package com.acemanstatic.expressions;

import com.acemanstatic.PartyType;
import com.acemanstatic.Senator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by phatmanace on 08/05/2015.
 */
public class VarDecl extends expr {
    Logger logger = Logger.getLogger(VarDecl.class.getName());
    List<Senator> _senators = new ArrayList<>();
    public VarDecl(List<Senator> _senators){
        this._senators = _senators;

    }

    @Override
    public Result exec(int depth) {
        logger.info("Variable Declaration");
        return new StringResult("VarDecl");
    }

    @Override
    public String toString(){
        return "{Var Decl}";
    }
}
