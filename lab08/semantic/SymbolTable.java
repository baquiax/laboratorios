package laboratorios.lab08.semantic;
import java.util.Hashtable;

public class SymbolTable {
    private Hashtable<String, String> definedSymbols;
    
    public SymbolTable() {
	this.definedSymbols = new Hashtable<String, String>();
    }
    
    public boolean insertSymbol(String symbol, String type) {	
	if (this.findSymbol(symbol) != null) {
	    return false;
	} else {
	    this.definedSymbols.put(symbol, type);
	    return true;
	}
    }
    
    public String findSymbol(String symbol) {
	return this.definedSymbols.get(symbol);
    }

    public String toString() {
	String s = "";
	for (String v : this.definedSymbols.keySet()) {
	    s += "(" + this.definedSymbols.get(v) + ")" + v + "\n";
	}
	return s;
    }
}
