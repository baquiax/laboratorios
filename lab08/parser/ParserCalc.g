parser grammar ParserCalc;

options {
    tokenVocab=ScannerCalc;
}

@parser::header {
    package laboratorios.lab08.parser;
}

start:	(dec_list+ | exp_list+)+  {System.out.println("Program");} #program;

e : e MULT e 	{System.out.println("Mult");} #mult|
	e DIV e 	#div|
	e ADD e 	#add|
	e SUB e 	#sub|
	e OR e 		#or|
	e AND e 	#and|
	e POW e 	#pow|
	n 			#number|
	VAR_NAME 	{System.out.println("VAR_NAME");} #varName;

n:	INTEGER {System.out.println("INTEGER");} #integer|
	FLOAT	#float|
	BOOLEAN #boolean;

a:	VAR_NAME EQUAL e #assign;

type:	INTEGER_TYPE {System.out.println("TYPE int");} #intType |
		FLOAT_TYPE	{System.out.println("TYPE float");} #floatType |
		BOOLEAN_TYPE {System.out.println("TYPE boolean");} #booleanType;

dec_list:	type VAR_NAME (COMMA VAR_NAME)* EOL {System.out.println("decList");} #decList;

exp_list:	(e|a) EOL  {System.out.println("expList");} #expList;
