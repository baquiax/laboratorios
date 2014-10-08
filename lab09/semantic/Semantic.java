package laboratorios.lab09.semantic;
import laboratorios.lab09.ast.*;

public class Semantic {    
    private SymbolTable st;
    public Semantic() {
	this.st = new SymbolTable();
    }

    public void check(Node n) {
		if (n.getClass().getName().equals(DecList.class.getName())) {
		    //Add to Symbol Table 
		    DecList decl = (DecList) n;
		    for (Node v : decl.getVars()) {
				VarName var = (VarName) v;
				if (!this.st.insertSymbol(var.getName(), var)) {
				    System.err.println("ERR: " + var.getName() + " already defined!");
				}
		    }
		} else if (n.getClass().getName().equals(Assign.class.getName())) {
		    //Check before declaration.
		    Assign a = (Assign) n;
		    if (this.st.findSymbol(a.getName()) == null) {
				System.err.println("ERR: " + a.getName() + " isn't defined!");
		    }
		    this.check(a.getE());
		} else if (n.getClass().getName().equals(VarName.class.getName())) {
		    VarName var = (VarName) n;
	    	if (this.st.findSymbol(var.getName()) == null) {
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

    public String getTypeNode(Node n) {
    	if (n == null) return "error";
    	if (n.getClass().getName().equals(VarName.class.getName())) {
    		VarName v = (VarName)n;
    		VarName f = (VarName)this.st.findSymbol(v.getName());
    		if (f != null) {
    			return f.getType();
    		} else {
    			System.out.println(">>>" + v.getName());
    			return "error";
    		}
    	}
    	return n.getType();
    }


    public void checkTypeOperator(String o, Node op1, Node op2) {
    	String op1Type = this.getTypeNode(op1);
		String op2Type = this.getTypeNode(op2);
		System.out.println(">>> " + op1Type + " & " + op2Type);

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



    public SymbolTable getST() {
		return st;
    }
}