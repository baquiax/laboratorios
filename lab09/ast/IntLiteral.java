package laboratorios.lab09.ast;

public class IntLiteral extends Node {
    private int value;
    private String type;

    public IntLiteral(String v) {
		this.value = Integer.parseInt(v);
    }

    public void setType(String t) {
        this.type = t;
    }

    public String getType() {
        return this.type;
    }

    public void print(String padding) {
		System.out.println(padding + "[" + this.type + "]"  + this.value) ;
    }
}