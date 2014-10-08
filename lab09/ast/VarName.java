package laboratorios.lab09.ast;

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
        return this.type;
    }

    public void print(String padding) {
	   System.out.println(padding + "[" + this.type + "]" + this.value);	
    }
}