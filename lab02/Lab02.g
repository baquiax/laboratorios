lexer grammar Lab02;

@header{
	package laboratorios.lab02;
}

WS   : ('\t'|'\n'|'\r'|' ')+ { skip();};
OP_PLUS : '+' {System.out.println("suma");};
OP_SUB	 : '-' {System.out.println("resta");};
OP_MUL	 : '*' {System.out.println("multiplicacion");};
OP_DIV	 : '*' {System.out.println("division");};
INTEGER	 : [0-9]+ {System.out.println("integer");};
FLOAT	 : [0-9]+('.'[0-9])? {System.out.println("float");};
ERROR	 : [a-zA-Z] {System.err.println("ERROR! letras");};
FOO	 : 'foo' {System.err.println("foo");};
BAR	 : 'bar' {System.err.println("bar");};