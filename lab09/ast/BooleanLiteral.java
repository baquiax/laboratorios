package laboratorios.lab09.ast;

public class BooleanLiteral extends Node {
    private String value;
    private String type;
    
    public BooleanLiteral(String v) {
		this.value = v;
    }

    public void print(String padding) {
		System.out.println(padding + "[" + this.type + "]" + this.value) ;
    }

    public void setType(String t) {
        this.type = t;
    }

    public String getType() {
        return this.type;
    }
}