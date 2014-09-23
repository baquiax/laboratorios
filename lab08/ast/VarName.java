package laboratorios.lab08.ast;

public class VarName extends Node {
    private String value;

    public VarName(String v) {
	this.value = v;
    }

    public void print(String padding) {
	System.out.println(padding + this.value);	
    }
}