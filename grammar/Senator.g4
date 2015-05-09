grammar Senator;

stmt : ((senatordfn|progstmt) endofstatement)+ #TopLevelRule;

senatordfn: senatorname '('party')';

senatorname: firstname lastname;


progstmt: (assignvar|deletevar|printhouse|displayhouse|loop);
assignvar: '$'ID'="'ID'"';
deletevar: '~delete' ID;
printhouse: '~printhouse';
displayhouse: '~displayhouse'  #DisplayMyHouse;
loop: 'for(' foridxitem ',' foridxitem  '){' progstmt '}';
foridxitem: NUM     #ForIndexNum
              |
            var     #ForIndexVar;



var: '$'ID;

firstname: ID;
lastname: ID;
endofstatement: ';';

party: 'D' # DemocratRule
       |
       'R' # ReblicanRule;

ID : [a-z]+ ;
NUM: [0-9]+ ;
WS      : (' '|'\t'|'\n')+ {skip();};
NL      : '\r'? '\n' | '\r';