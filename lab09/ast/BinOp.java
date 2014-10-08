package laboratorios.lab09.ast;

public class BinOp extends Node {
    private String operator;
    private Node firstOperator;
    private Node secondOperator;
    private String type;

    public BinOp(String op, Node first, Node second) {
    	this.operator = op;
    	this.firstOperator = first;
    	this.secondOperator = second;
    }

    public Node getFirst() {
	   return this.firstOperator;
    }

    public Node getSecond() {
	   return this.secondOperator;
    }

    public String getOperator() {
        return this.operator;
    }

    public void setType(String t) {
        this.type = t;
    }

    public String getType() {	
	if (this.firstOperator.getType().equals("float") || this.secondOperator.getType().equals("float")) {
	    return "float";
	} else if (this.firstOperator.getType().equals(this.secondOperator.getType())) {
            return this.firstOperator.getType();
        } else {
            return "error";
        }
    }

    public void print(String padding) {
    	System.out.println(padding + this.operator);
    	this.firstOperator.print(padding + "\t");
    	this.secondOperator.print(padding + "\t");
    }
}