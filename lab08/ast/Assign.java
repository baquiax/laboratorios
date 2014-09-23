package laboratorios.lab08.ast;

import java.util.List;
import java.util.LinkedList;

public class Assign extends Node {
    private String varName;
    private List<Node> expression;
    
    public Assign(String varName) {
    	this.varName = varName;
    	this.expression = new LinkedList<Node>();
    }

    public void add(Node node) {	
	   this.expression.add(node);
    }

    public void print(String padding) {
    	System.out.println(padding + "= -> ");
    	System.out.println(padding + this.varName);
    	for (Node n: this.expression) {
    	    n.print(padding + "\t");
    	}
    }
    
    public void print() {
	   this.print("");
    }
}