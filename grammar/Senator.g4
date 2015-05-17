grammar Senator;

stmt : ((programexpression) WS?)+ #TopLevelRule;





programexpression: progstmt ENDOFSTATEMENT;

progstmt: (assignvar|deletevar|printhouse|displayhouse|loop|swait|senatordfn) WS?;
senatordfn: '->("' senatorname WS? '('party')")';
senatorname: firstname WS? lastname;
assignvar: '$'ID'="'(ID+|NUM+)'"';
swait: '~wait(' NUM ')';
deletevar: '~delete' ID;
printhouse: '~printhouse';
displayhouse: '~displayhouse'  #DisplayMyHouse;
loop: 'for(' foridxitem ',' foridxitem  '){'(WS? programexpression WS?)+'}';
foridxitem: NUM     #ForIndexNum
              |
            var     #ForIndexVar;


var: '$'ID;

firstname: ID;
lastname: ID;


party: 'D' # DemocratRule
       |
       'R' # ReblicanRule;

ENDOFSTATEMENT: ';';

COMMENT: '/*' .*? '*/' {skip();};


ID : [a-zA-Z]+ ;
NUM: [0-9]+ ;
WS      : (' '|'\t'|'\n')+ {skip();};
NL      : '\r'? '\n' | '\r';
