import laboratorios.lab02.Lab02;
import org.antlr.v4.runtime.*;

public class Main{
    public static void main(String[] args) throws Exception{
		try{
		    Lab02 lexer = new Lab02(new ANTLRFileStream(args[0]));
		    while (lexer.nextToken().getType() != Token.EOF);
		} catch(ArrayIndexOutOfBoundsException aiobe) {
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		} catch(Exception e) {
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		}
    }
}