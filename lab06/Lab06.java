import org.antlr.v4.runtime.*;
import laboratorios.lab06.scanner.JSONLexer;
import laboratorios.lab06.parser.JSONParser;
public class Lab06 {
    
    public static void main(String args[]) throws Exception{
		if (args.length < 1) {
		    System.err.println("Debe indicar el path de archivo JSON a analizar.");
		    System.exit(1);
		}
		System.out.println("\n#LEXER TIME#\n");
		JSONLexer l = new JSONLexer(new ANTLRFileStream(args[0]));
		Token t = null;	     
		while ((t = l.nextToken()).getType() != Token.EOF) {	    
		    if (t.getType() == 1) {
				System.out.print(t.getText());
		    }
		}
		l.reset();
		System.out.println("\n\n#PARSER TIME#\n");
		JSONParser parser = new JSONParser(new CommonTokenStream(l));
	    parser.start();
	    System.out.println("\n\n#END#\n");
    }
}