lexer grammar JSONLexer;

@lexer::header {
	package laboratorios.lab06.scanner;
}

fragment DIGIT: [0-9];
fragment CHAR: [\u0020-\u0021\u0023-\u007A];
FORMAT  :   ( '\t' | ' ' | '\r' | '\n')+ { skip(); };
OPEN_BRACE  :   '{';
CLOSE_BRACE :   '}';
OPEN_BRACKET    :	'[';
CLOSE_BRACKET   :	']';
SCAPPED_CHAR    :   '\\n' | '\\\"' | '\\\'' | '\\\\' | '\\t';
STRING      :   '\"' (CHAR | SCAPPED_CHAR)* '\"';
CHARACTER        :   '\'' (CHAR | SCAPPED_CHAR)? '\'';
INTEGER     :   ('-'?) DIGIT+;
FLOAT       :   ('-'?) DIGIT+ ('.' DIGIT+)?;
BOOLEAN     :   'true' | 'false';
COLON       :   ':';
COMMA       :   ',';
