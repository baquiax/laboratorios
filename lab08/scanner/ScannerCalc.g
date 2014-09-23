lexer grammar ScannerCalc;

@lexer::header {
	package laboratorios.lab08.scanner;
}

fragment DIGIT: [0-9];
FORMAT  	:   ( '\t' | ' ' | '\r' | '\n')+ {skip();};
INTEGER     :   ('-'?) DIGIT+;
FLOAT       :   ('-'?) DIGIT+ DOT DIGIT+;
BOOLEAN     :   'true' | 'false';
DOT			:	'.';
COLON       :   ':';
COMMA       :   ',';
ADD			:	'+';
SUB			:	'-';
MULT		:	'*';
DIV			:	'/';
OR			:	'|';
AND			:	'&';
POW			:	'^';
EQUAL		:	'=';
INTEGER_TYPE	:	'int';
FLOAT_TYPE:		'float';
BOOLEAN_TYPE:	'boolean';
VAR_NAME	:	[a-zA-Z_]+[a-zA-Z_0-9]*;
EOL			:	';';
