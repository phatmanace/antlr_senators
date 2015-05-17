grammar SimpleVar;

stmt : ((programexpression) WS?)+ #TopLevelRule;

programexpression: progstmt ENDOFSTATEMENT;

progstmt: (assignvar) WS?;
assignvar: '$'ID'="'(ID+|NUM+)'"';


ENDOFSTATEMENT: ';';

ID : [a-zA-Z]+ ;
NUM: [0-9]+ ;
WS      : (' '|'\t'|'\n')+ {skip();};
NL      : '\r'? '\n' | '\r';
