lexer grammar Lab05Scanner;

@lexer::header {
            package laboratorios.lab05.scanner;
}

fragment DIGIT: [0-9];
fragment CHAR: [\u0020-\u0021\u0023-\u007A];
FORMAT  :   ( '\t' | ' ' | '\r' | '\n')+ ;
OPEN_BRACE  :   '{' { System.out.print("[OPEN_BRACE]"); };
CLOSE_BRACE :   '}' { System.out.print("[CLOSE_BRACE]"); };
OPEN_BRACKET    :   '[' { System.out.print("[OPEN_BRACKET]"); };
CLOSE_BRACKET   :   ']' { System.out.print("[CLOSE_BRACKET]"); };
SCAPPED_CHAR     :   '\\n' | '\\\"' | '\\\'' | '\\\\' | '\\t' { System.out.print("[SCAPPED_CHAR]"); };
STRING      :   '\"' (CHAR | SCAPPED_CHAR)* '\"' { System.out.print("[STRING]"); };
CHARACTER        :   '\'' (CHAR | SCAPPED_CHAR)? '\'' { System.out.print("[CHAR]"); };
INTEGER     :   ('-'?) DIGIT+ { System.out.print("[INTEGER]"); };
FLOAT       :   ('-'?) DIGIT+ ('.' DIGIT+)? { System.out.print("[FLOAT]"); };
BOOLEAN     :   'true' | 'false' { System.out.print("[BOOLEAN_VALUE]"); };
COLON       :   ':' { System.out.print("[COLON]"); };
COMMA       :   ',' { System.out.print("[COMMA]"); };
