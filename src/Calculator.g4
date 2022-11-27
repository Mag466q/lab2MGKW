grammar Calculator;

expression
   : multiplyingExpression ((PLUS | MINUS) multiplyingExpression)*
   ;

multiplyingExpression
   : povsqrExpression ((TIMES |MOD| DIV) povsqrExpression)*
   ;

povsqrExpression
   : SQRT sing_simple
   | sing_simple (POV sing_simple)*
   ;

sing_simple
    : funcname simple *
    | LPAREN expression RPAREN
    | LABS expression PABS
    | MINUS sing_simple
    | PLUS sing_simple
    | simple
    ;
simple
    : (INT|FLOAT)
    ;

funcname
   : COS
   | TAN
   | SIN
   | ACOS
   | ATAN
   | ASIN
   | LOG
   | PI
   | E
   ;

FLOAT
    : INT+ DOT INT *
    ;

LPAREN
   : '('
   ;

RPAREN
   : ')'
   ;
LABS
    : '['
    ;
PABS
    : ']'
    ;

POV: '^' ;
SQRT: 'P' ;
INT: [0-9]+ ;
DOT: '.';
TIMES: '*' ;
DIV: '/' ;
PLUS: '+' ;
MINUS: '-' ;
WS : [ \t\r\n]+ -> skip ;

MOD: 'mod';
COS: 'cos';
SIN: 'sin';
TAN: 'tan';
ACOS: 'acos';
ASIN: 'asin';
ATAN: 'atan';
LOG: 'log';
PI : 'PI';
E : 'E';