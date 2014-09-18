lexer grammar Lab04Scanner;

@lexer::header{
  package laboratorios.lab04.scanner;
}

//ignoramos espacios en blanco
WHITESPACE 	: 	( '\t' | ' ' | '\r' | '\n')+ { skip(); } ;
INTEGER     :   [0-9]+;
BOOLEAN     :   'true'|'false'|'TRUE'|'FALSE';
FLOAT       :   [0-9]+(.[0-9]+)?;
VAR_TYPE    :   ('int'|'float'|'boolean');
VAR_NAME    :   [a-zA-Z_]+[a-zA-Z0-9_]*;
EQUAL       :   '=';
END_LINE    :   ';';
LIST_SEPARATOR  :   ',';
OPERATOR    :   '+'|'-'|'*'|'/';
O_PARENTHESIS   : '(';
C_PARENTHESIS   : ')';
