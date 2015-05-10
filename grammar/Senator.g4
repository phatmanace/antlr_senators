grammar Senator;

stmt : ((senatordfn|progstmt) endofstatement)+ #TopLevelRule;

senatordfn: senatorname '('party')';

senatorname: firstname lastname;

programexpression: progstmt endofstatement;
progstmt: (assignvar|deletevar|printhouse|displayhouse|loop);
assignvar: '$'ID+'="'(ID+|NUM+)'"';
deletevar: '~delete' ID;
printhouse: '~printhouse';
displayhouse: '~displayhouse'  #DisplayMyHouse;
loop: 'for(' foridxitem ',' foridxitem  '){' (programexpression)+ '}';
foridxitem: NUM     #ForIndexNumÌ
              |
            var     #ForIndexVar;



var: '$'ID;

firstname: ID;
lastname: ID;
endofstatement: ';';

party: 'D' # DemocratRule
       |
       'R' # ReblicanRule;

COMMENT: '/*' .*? '*/' {skip();};


ID : [a-zA-Z]+ ;
NUM: [0-9]+ ;
WS      : (' '|'\t'|'\n')+ {skip();};
NL      : '\r'? '\n' | '\r';
