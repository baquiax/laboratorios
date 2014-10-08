package laboratorios.lab09.semantic;
import java.util.Hashtable;
import laboratorios.lab09.ast.Node;

public class SymbolTable {
    private Hashtable<String, Node> definedSymbols;
    
    public SymbolTable() {
		this.definedSymbols = new Hashtable<String, Node>();
    }
    
    public boolean insertSymbol(String symbol, Node n) {	
		if (this.findSymbol(symbol) != null) {
		    return false;
		} else {
		    this.definedSymbols.put(symbol, n);
		    return true;
		}
    }
    
    public Node findSymbol(String symbol) {
		return this.definedSymbols.get(symbol);
    }

}
