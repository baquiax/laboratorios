package laboratorios.lab09.ast;

public class Type extends Node {
    private String type;
    
    public Type(String t) {
		this.type = t;
    }

    public void setType(String t) {
        this.type = t;
    }

    public String getType() {
        return this.type;
    }

    public void print(String padding) {
		System.out.println(padding + this.type);
    }
}