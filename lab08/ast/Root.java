package laboratorios.lab08.ast;

import java.util.List;
import java.util.LinkedList;

public class Root extends Node {
    private List<Node> list;
    
    public Root () {
	this.list = new LinkedList<Node>();
    }

    public List<Node> getChilds() {
	return this.list;
    }

    public void add(Node node) {
	this.list.add(node);
    }

    public void print(String padding) {
	System.out.println("start -> ");
	for (Node n: this.list) {
	    n.print(padding + "\t");
	}
    } 

    public void print() {
	this.print("");
    }

}