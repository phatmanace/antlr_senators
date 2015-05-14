grammar Senator;

stmt : ((senatordfn|progstmt) ';')+ #TopLevelRule;

senatordfn: senatorname '('party')';

senatorname: firstname lastname;


progstmt: (assignvar|deletevar|printhouse|displayhouse|loop);
assignvar: '$'ID+'="'(ID+|NUM+)'"';
deletevar: '~delete' ID;
printhouse: '~printhouse';
displayhouse: '~displayhouse'  #DisplayMyHouse;
loop: 'for(' foridxitem ',' foridxitem  '){' (programexpression)+ '}';
foridxitem: NUM     #ForIndexNumÌ
              |
            var     #ForIndexVar;

programexpression: progstmt ';';

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
