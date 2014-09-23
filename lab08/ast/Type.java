package laboratorios.lab08.ast;

public class Type extends Node {
    private String value;
    
    public Type(String v) {
		this.value = v;
    }

    public void print(String padding) {
		System.out.println(padding + this.value);
    }
}