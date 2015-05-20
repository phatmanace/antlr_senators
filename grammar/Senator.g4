grammar Senator;

stmt : ((programexpression) WS?)+ #TopLevelRule;

programexpression: progstmt ENDOFSTATEMENT;

progstmt: (
            |assignvar
            |deletevar
            |printhouse
            |displayhouse
            |loop
            |swait
            |senatordfn
            |function
            |functioncall
            |ifstmt
            |returnstatement
            |constant
            |prints
            ) WS?;

senatordfn: '->("' senatorname WS? '('party')")';
ifstmt: 'if(' WS? progstmt WS? TEST_OPERATOR WS? progstmt WS?'){' (WS? programexpression WS?) +'}';
assignvar: '$'ID'="'(ID+|NUM+)'"';
swait: '~wait(' NUM ')';
deletevar: '~delete' ID;
returnstatement: 'return' ID;
constant: (ID|NUM);
printhouse: '~printhouse';
function: 'function ' ID '(' (functionproto)+ ') as' WS? type WS?'{' WS? functionbody  WS? '}';
functionbody: (programexpression)+;
functionproto: (functionparam)+;
functionparam: type WS? ID COMMA?;
displayhouse: '~displayhouse'  #DisplayMyHouse;
prints: '~print(' WS? (STRING_LITERAL | var ) WS? ')';
functioncall: '@' ID '(' (functioncallparam COMMA?)+ ')';
functioncallparam: (STRING_LITERAL|NUM|var);
loop: 'for(' foridxitem ',' foridxitem  '){'(WS? programexpression WS?)+'}';
foridxitem: NUM     #ForIndexNum
              |
            var     #ForIndexVar;

senatorname: firstname WS? lastname;
var: '$'ID;

firstname: ID;
lastname: ID;

type: ('int'|'string');


party: 'D' # DemocratRule
       |
       'R' # ReblicanRule;

ENDOFSTATEMENT: ';';
TEST_OPERATOR: ('>'| '<'|'=='| '!=');
COMMENT: '/*' .*? '*/' {skip();};
COMMA: ',';
STRING_LITERAL : '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';
ID : [a-zA-Z]+ ;
NUM: [0-9]+ ;
WS      : (' '|'\t'|'\n')+ {skip();};
NL      : '\r'? '\n' | '\r';

