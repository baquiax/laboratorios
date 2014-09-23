import laboratorios.lab07.scanner.*;
import laboratorios.lab07.parser.*;
import laboratorios.lab07.ast.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
 
public class Lab08 {
    public static void main(String[] args) throws Exception {
	if (args.length < 1) {
	    System.err.println("Debe indicar el path de archivo a analizar.");
	    System.exit(1);
	}
	System.out.println("#LEXER TIME#");
	ScannerCalc l = new ScannerCalc(new ANTLRFileStream(args[0]));
	System.out.println("\n#PARSER TIME#");
	ParserCalc parser = new ParserCalc(new CommonTokenStream(l));
	ParseTree tree = parser.start();
	AstVisitor visitor = new AstVisitor();
	System.out.println("\n#AST#");
	Root root = (Root) visitor.visit(tree);
	root.print();
	System.out.println("\n\n#END#\n");
    }
}