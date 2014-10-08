package laboratorios.lab09.ast;

public class FloatLiteral extends Node {
    private float value;
    private String type;
    
    public FloatLiteral(String v) {
		this.value = Float.parseFloat(v);
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