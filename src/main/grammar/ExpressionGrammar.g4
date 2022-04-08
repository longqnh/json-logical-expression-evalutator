grammar ExpressionGrammar;

options {
  language = Java;
}

expression
 : LPAREN expression RPAREN                                         # parentExpression
 | left=expression op=binary right=expression                       # multiExpression
 | left=field op=numComparator right=field                          # fieldComparatorExpression
 | left=field op=numComparator right=decimal                        # numComparatorExpression
 | left=field op=stringComparator right=bool                        # boolComparatorExpression
 | left=field op=stringComparator right=phrase                      # stringComparatorExpression
 | left=field op=IS right=nullPointer                               # isNullExpression
 | left=field op=IS_NOT right=nullPointer                           # isNotNullExpression
 | left=field op=MATCH right=regex                                  # matchExpression
 | left=field op=NOT_MATCH right=regex                              # notMatchExpression
 | left=field op=IN right=validList       	                        # inExpression
 | left=field op=NOT_IN right=validList   	                        # notInExpression
 ;

numComparator       : GT | GE | LT | LE | EQ | NEQ;
stringComparator    : EQ | NEQ;
binary              : AND | OR;
bool                : TRUE | FALSE;
decimal             : INTEGER | DOUBLE;
field               : IDENTIFIER;
validList           : quote | CUSTOM_STRING_LIST | CUSTOM_NUM_LIST;
nullPointer         : NULL;
phrase              : PHRASE;
quote               : QUOTE;
regex               : 'regex' LPAREN quote RPAREN;


AND                 : (('a' | 'A') ('n' | 'N') ('d' | 'D') | (AMPER AMPER?)) ;
OR                  : (('o' | 'O') ('r' | 'R') | (VBAR VBAR?));
NOT                 : ('n' | 'N') ('o' | 'O') ('t' | 'T');
TRUE                : ('T' | 't') ('R' | 'r') ('U' | 'u') ('E' | 'e');
FALSE               : ('F' | 'f') ('A' | 'a') ('L' | 'l') ('S' | 's') ('E' | 'e');
IN                  : ('I' | 'i') ('N' | 'n');
NOT_IN              : (NOT WS IN);
IS                  : ('I' | 'i') ('S' | 's');
IS_NOT              : (IS WS NOT);
LIKE                : ('L' | 'l') ('I' | 'i') ('K' | 'k') ('E' | 'e');
NOT_LIKE            : (NOT WS LIKE);
MATCH               : ('M' | 'm') ('A' | 'a') ('T' | 't') ('C' | 'c') ('H' | 'h');
NOT_MATCH           : (NOT WS MATCH);
NULL                : ('N' | 'n') ('U' | 'u') ('L' | 'l') ('L' | 'l');
CUSTOM_NUM_LIST     : LSPAREN (INTEGER | DOUBLE','*WS*)+ RSPAREN;
CUSTOM_STRING_LIST  : LSPAREN (QUOTE','*WS*)+ RSPAREN;
GT                  : '>' ;
GE                  : '>=' ;
LT                  : '<' ;
LE                  : '<=' ;
EQ                  : '=' ;
NEQ                 : '!=';
LPAREN              : '(' ;
RPAREN              : ')' ;
LSPAREN             : '[' ;
RSPAREN             : ']' ;
INTEGER             : '-'? [0-9]+;
DOUBLE              : '-'? [0-9]+ ( '.' [0-9]+ )? ;
SQUOTE              : '\'';
DQUOTE              : '"';
PHRASE              : SQUOTE (ESC_CHAR|~('\''|'\\'))+ SQUOTE;
QUOTE               : DQUOTE (ESC_CHAR|~('"'|'\\'))+ DQUOTE;
IDENTIFIER          : [a-zA-Z] [a-zA-Z_0-9]* ;
WS                  : [ \r\t\u000C\n]+ -> skip;

fragment VBAR       : '|' ;
fragment AMPER      : '&' ;
fragment ESC_CHAR   :  '\\' .;
