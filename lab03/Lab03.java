import org.antlr.v4.runtime.*;
import laboratorios.lab03.scanner.Lab03Scanner;

public class Lab03 {
  public static void main(String[] args) throws Exception {
  	Lab03Scanner lexer = new Lab03Scanner(new ANTLRFileStream("test.txt"));
	while (lexer.nextToken().getType() != Token.EOF);
  }
}