package com.acemanstatic.expressions;


 public enum ExprType{
  INTEGER,STRING,VOID;

  public static ExprType inferFromType(String type){
   if(type.equals("int")) {
    return ExprType.INTEGER;
   }else{
    return ExprType.STRING;
   }
  }


 };