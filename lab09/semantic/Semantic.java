package laboratorios.lab09.semantic;
import laboratorios.lab09.ast.*;

public class Semantic {

    public Semantic() {
	
    }
    
    public void check(Node n) {
	if (n.getClass().getName().equals(DecList.class.getName())) {
	    //Add to Symbol Table 
	    DecList decl = (DecList) n;
	    for (Node v : decl.getVars()) {
		VarName var = (VarName) v;
		if (!SymbolTable.insertSymbol(var.getName(), var)) {
		    System.err.println("ERR: " + var.getName() + " already defined!");
		}
	    }
	} else if (n.getClass().getName().equals(Assign.class.getName())) {
	    //Check before declaration.
	    Assign a = (Assign) n;
	    if (SymbolTable.findSymbol(a.getName()) == null) {
		System.err.println("ERR: " + a.getName() + " isn't defined!");
	    }
	    this.check(a.getE());
	    this.checkAssign(a);
	} else if (n.getClass().getName().equals(VarName.class.getName())) {
	    VarName var = (VarName) n;
	    if (SymbolTable.findSymbol(var.getName()) == null) {
		System.err.println("ERR: " + var.getName() + " isn't defined!");
	    }
	} else if (n.getClass().getName().equals(BinOp.class.getName())) {
	    BinOp op = (BinOp) n;
	    this.check(op.getFirst());
	    this.check(op.getSecond());
	    this.checkTypeOperator(op.getOperator(), op.getFirst(), op.getSecond());
	} else if (n.getClass().getName().equals(Root.class.getName())) {
	    Root r = (Root) n;
	    for (Node c : r.getChilds()) {
		this.check(c);
	    }
	}
    }
    
    public void checkAssign(Assign a) {
	VarName v = (VarName)SymbolTable.findSymbol(a.getName());
	if (v != null ) {
	    String varType = v.getType();
	    String right = a.getE().getType();
	    if (varType.equals("int") && right.equals("float")) {
		System.err.println("ERR: " + a.getName() + " has possible loss of information." );
		a.print("");
	    } else if (varType.equals("float") && right.equals("int")) {
		//Make a coercion
	    } else if (!v.getType().equals(a.getE().getType())) {
		System.err.println("ERR: " + a.getName() + " type isn't the same of the assignation" );
		a.print("");
	    }
	    
	}
    }
    
    public String getTypeNode(Node n) {
    	if (n == null) return "error";
    	if (n.getClass().getName().equals(VarName.class.getName())) {
	    VarName v = (VarName)n;
	    VarName f = (VarName)SymbolTable.findSymbol(v.getName());
	    if (f != null) {
		return f.getType();
	    } else {
		return "error";
	    }
    	}
    	return n.getType();
    }
    
    
    public void checkTypeOperator(String o, Node op1, Node op2) {
    	String op1Type = this.getTypeNode(op1);
	String op2Type = this.getTypeNode(op2);	
    	if (o.equals("+") || o.equals("-") || o.equals("*") || o.equals("/") || 
	    o.equals("^")) {
	    
	    if ((op1Type.equals("int") || op1Type.equals("float")) &&
		(op2Type.equals("int") || op2Type.equals("float"))) {
		
	    } else {
		System.err.println("ERR: Arithmetic operatios require int or float operands.");	
		op1.print("");
		System.out.print(" " + o + " ");
		op2.print("");
		System.out.println("");
	    }
	    
    	} else if (o.equals("&") || o.equals("|")) {
	    if (op1Type.equals("boolean") && op1Type.equals(op2Type)) {
    			//Valid check
	    } else {
		System.err.println("ERR: Logical operations require BOOLEAN operands.");	
		op1.print("");
		System.out.print(" " + o + " ");
		op2.print("");
		System.out.println("");
	    }
    	}
    }       
}