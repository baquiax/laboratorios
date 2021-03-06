import laboratorios.lab08.scanner.*;
import laboratorios.lab08.parser.*;
import laboratorios.lab08.ast.*;
import laboratorios.lab08.semantic.*;
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
	Semantic semantic = new Semantic();
	System.out.println("\n#SEMANTIC#");
	semantic.check(root);
	System.out.println("\n\n#END#\n");
    }
}