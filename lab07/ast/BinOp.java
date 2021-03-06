package laboratorios.lab07.ast;

public class BinOp extends Node {
    private String operator;
    private Node firstOperator;
    private Node secondOperator;

    public BinOp(String op, Node first, Node second) {
	this.operator = op;
	this.firstOperator = first;
	this.secondOperator = second;
    }

    public void print(String padding) {
	System.out.println(padding + this.operator);
	this.firstOperator.print(padding + "\t");
	this.secondOperator.print(padding + "\t");
    }
}