parser grammar Lab04Parser;

options {
    tokenVocab=Lab04Scanner;
}

@parser::header{
  package laboratorios.lab04.parser;
}



/*-----------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

/*
  Para implementar la gramatica debe seguir las siguientes reglas.
  1. el inicio sera un listado de declaraciones o un listado de expresiones (pueden ser 0 o mas)
  2. el listado de declaraciones son de la forma 
        tipo variable, variable, variable;
     donde tipo es uno de int, boolean y float y el listado de variables lleva 1 o mas separadas
     por coma y esta terminado por un punto y coma
  3. el listado de expresiones debe llevar una expresion o una asignacion seguido de punto y coma
     la asignacion es de la forma 
        variable = expresion;
  4. la expresion puede ser una suma, resta, multiplicacion, un numero entero decimal o una variable
     E - > E + E |
           E - E |
           E * E | 
           E / E |
           N     |
           VAR;
  5. Aqui no estan todos los tokens, pero en los proximos labs vamos a editar esta gramatica

*/
e : e OPERATOR e 
    | INTEGER
    | FLOAT
    | BOOLEAN
    | VAR_NAME;
declaration    : VAR_TYPE VAR_NAME (LIST_SEPARATOR VAR_NAME)* END_LINE;
assignation    : VAR_NAME EQUAL e  END_LINE; 
start          : (assignation | declaration)* EOF;
