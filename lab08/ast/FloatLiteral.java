package laboratorios.lab08.ast;

public class FloatLiteral extends Node {
    private float value;
    
    public FloatLiteral(String v) {
	this.value = Float.parseFloat(v);
    }

    public void print(String padding) {
	System.out.println(padding + this.value);
    }
}