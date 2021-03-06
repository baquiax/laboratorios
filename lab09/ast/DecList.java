package laboratorios.lab09.ast;

import java.util.List;
import java.util.LinkedList;

public class DecList extends Node {
    private String type;
    private List<Node> list;
    
    public DecList(String type) {
    	this.type = type;
    	this.list = new LinkedList<Node>();
    }

    public void add(Node node) {	
	   this.list.add(node);
    }

    public List<Node> getVars() {
    	return this.list;
    }

    public void setType(String t) {
        this.type = t;
    }

    public String getType() {
        return this.type;
    }
    public void print(String padding) {
    	System.out.println(padding + "dec_list -> ");
    	System.out.println(padding + this.type);
    	for (Node n: this.list) {
    	    n.print(padding + "\t");
    	}
    }
    
    public void print() {
	   this.print("");
    }
}