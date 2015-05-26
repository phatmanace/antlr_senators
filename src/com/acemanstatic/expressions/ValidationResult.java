package com.acemanstatic.expressions;

import java.util.Collections;
import java.util.List;

/**
 * Created by phatmanace on 24/05/2015.
 */
public class ValidationResult {
    private Valid valid;
    private List<String> errors = Collections.<String>emptyList();
    public ValidationResult(Valid valid, List<String> errors){
        this.valid = valid;
        this.errors = errors;

    }
    public ValidationResult(Valid valid){
        this.valid = valid;
    }
}
