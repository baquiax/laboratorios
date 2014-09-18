parser grammar JSONParser;

options {
    tokenVocab=JSONLexer;
}

@parser::header {
	package laboratorios.lab06.parser;
}

start	:	object
			{System.out.println($object.text);};

object	:	OPEN_BRACE	members CLOSE_BRACE;
			
members	:	pair_list | ;

pair	:	STRING	COLON value;

value	:	STRING | INTEGER | BOOLEAN | FLOAT | object | array;

pair_list	:	pair | pair COMMA pair_list;

value_list	:	value | value COMMA value_list;

array	:	OPEN_BRACKET value_list? CLOSE_BRACKET;