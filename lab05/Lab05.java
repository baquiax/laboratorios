import org.antlr.v4.runtime.*;
import laboratorios.lab05.scanner.Lab05Scanner;
public class Lab05 {
    
    public static void main(String args[]) throws Exception{
	if (args.length < 1) {
	    System.err.println("Debe indicar el path de archivo JSON a analizar.");
	    System.exit(1);
	}

	Lab05Scanner l = new Lab05Scanner(new ANTLRFileStream(args[0]));
	Token t = null;	     
	while ((t = l.nextToken()).getType() != Token.EOF) {	    
	    if (t.getType() == 1) {
		System.out.print(t.getText());
	    }
	}
	System.out.println("");
    }
}