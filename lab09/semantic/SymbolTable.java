package laboratorios.lab09.semantic;
import java.util.Hashtable;
import laboratorios.lab09.ast.Node;

public class SymbolTable {
    private final static Hashtable<String, Node> definedSymbols = new Hashtable<String, Node>();       
    
    public static boolean insertSymbol(String symbol, Node n) {	
	if (SymbolTable.findSymbol(symbol) != null) {
	    return false;
	} else {
	    SymbolTable.definedSymbols.put(symbol, n);
	    return true;
	}
    }
    
    public static Node findSymbol(String symbol) {
	return SymbolTable.definedSymbols.get(symbol);
    }

}
