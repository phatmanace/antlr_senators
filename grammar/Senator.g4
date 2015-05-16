grammar Senator;

stmt : ((senatordfn|progstmt) ';'WS?)+ #TopLevelRule;

senatordfn: senatorname '('party')';

senatorname: firstname lastname;

programexpression: progstmt ';';

progstmt: (assignvar|deletevar|printhouse|displayhouse|loop)WS?;
assignvar: '$'ID+'="'(ID+|NUM+)'"';
deletevar: '~delete' ID;
printhouse: '~printhouse';
displayhouse: '~displayhouse'  #DisplayMyHouse;
loop: 'for(' foridxitem ',' foridxitem  '){' WS? (programexpression)+ WS?'}';
foridxitem: NUM     #ForIndexNum
              |
            var     #ForIndexVar;


var: '$'ID;

firstname: ID;
lastname: ID;


party: 'D' # DemocratRule
       |
       'R' # ReblicanRule;

ENDOFSTATEMENT: ';' {skip();};

COMMENT: '/*' .*? '*/' {skip();};


ID : [a-zA-Z]+ ;
NUM: [0-9]+ ;
WS      : (' '|'\t'|'\n')+ {skip();};
NL      : '\r'? '\n' | '\r';
