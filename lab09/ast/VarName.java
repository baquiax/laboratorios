package laboratorios.lab09.ast;
import laboratorios.lab09.semantic.SymbolTable;

public class VarName extends Node {
    private String value;
    private String type;

    public VarName(String v) {
	   this.value = v;
    }

    public String getName() { 
	   return this.value;
    }

    public void setType(String t) {
        this.type = t;
    }

    public String getType() {
	if (this.type == null){
	    VarName v = (VarName)SymbolTable.findSymbol(this.value);
	    if (v == null) {
		return "error";
	    } else {
		return v.getType();
	    }
	}
        return this.type;
    }

    public void print(String padding) {
	System.out.println(padding + this.value);	
    }
}