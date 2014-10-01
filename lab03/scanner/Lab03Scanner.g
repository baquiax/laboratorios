lexer grammar Lab03Scanner;

@header {
  package laboratorios.lab03.scanner;
  /*
  Realizar un analizador léxico que reconozca:
	-Palabras reservadas (int, boolean)
	-Numeros enteros y flotantes
	-Literales hex
	-Literales caracter
	-Literales string
	-Literales booleanos
	-variables
	-Símbolos (coma, punto y coma y paréntesis)
	-Operadores (+,-,*,/,&,|,^,=)
	-Ignorar espacios en blanco
  */
}

WS   : ('\t'|'\n'|'\r'|' ')+ { skip();};
KEY_INT  : 'int' {System.out.println("INT");};
KEY_BOOLEAN  : 'boolean' {System.out.println("BOOLEAN");};
INTEGER	 : [0-9]+ {System.out.println("integer");};
FLOAT	 : [0-9]+('.'[0-9]+)? {System.out.println("float");};
HEX 	: '0x' [0-9A-Fa-f]+ {System.out.println("hexadecimal");};
CHAR	: '\'' [0-9A-Za-z ]?'\'' {System.out.println("char");};
STRING	: '\"' [0-9A-Za-z ]* '\"' {System.out.println("string");};
BOOLEAN	: 'TRUE'|'FALSE'|'true'|'false' {System.out.println("boolean");};
VAR:	[A-Za-z]+[0-9A-Za-z_-]* {System.out.println("var_name");};
SYMBOL:	(','|';'|'('|')') {System.out.println("symbol");};
OPERATORS:	('+'|'-'|'*'|'/'|'&'|'|'|'^'|'=') {System.out.println("operator");};