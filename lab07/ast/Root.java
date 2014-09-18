package laboratorios.lab07.ast;

import java.util.List;
import java.util.LinkedList;

public class Root extends Node {
    private List<Node> list;

    public void add(Node node) {
	this.list.add(node);
    }

    public void print(String padding) {
	for (Node n: this.list) {
	    System.out.println("start -> ");
	    n.print(padding + "\t");
	}
    } 

    public void print() {
	this.print("");
    }
}