package laboratorios.lab09.ast;

import java.util.List;
import java.util.LinkedList;

public class Assign extends Node {
    private String varName;
    private Node expression;
    private String type;

    public Assign(String varName, Node e) {
    	this.varName = varName;
    	this.expression = e;
    }

    public String getName() {
	return this.varName;
    }

    public Node getE() {
	return this.expression;
    }    

    public String getType() {
        return this.type;
    }

    public void setType(String t) {
        this.type = t;
    }

    public void print(String padding) {
    	System.out.println(padding + "= -> ");
    	System.out.println(padding + this.varName);	
	    expression.print(padding + "\t");
    }
    
    public void print() {
	   this.print("");
    }
}