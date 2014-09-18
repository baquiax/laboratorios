parser grammar ParserCalc;

options {
    tokenVocab=ScannerCalc;
}

@parser::header {
    package laboratorios.lab07.parser;
}

start:	(dec_list+ | exp_list+)+ #program;

e : e MULT e 	#mult|
	e DIV e 	#div|
	e ADD e 	#add|
	e SUB e 	#sub|
	e OR e 		#or|
	e AND e 	#and|
	e POW e 	#pow|
	n 			#number|
	VAR_NAME 	#varName;

n:	INTEGER #integer|
	FLOAT	#float|
	BOOLEAN #boolean;

a:	VAR_NAME EQUAL e #assign;

type:	INTEGER_TYPE #intType |
		FLOAT_TYPE	#floatType |
		BOOLEAN_TYPE #booleanType;

dec_list:	(type VAR_NAME )(COMMA VAR_NAME)* EOL #decList;

exp_list:	(e|a) EOL  #expList;
