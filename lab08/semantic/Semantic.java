package laboratorios.lab08.semantic;
import laboratorios.lab08.ast.*;

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
				if (!this.st.insertSymbol(var.getName(), decl.getType())) {
				    System.err.println("ERR: " + var.getName() + " already defined!");
				}
		    }
		} else if (n.getClass().getName().equals(Assign.class.getName())) {
		    //Check before declaration.
		    Assign a = (Assign) n;
		    if (this.st.findSymbol(a.getName()) == null) {
				System.err.println("ERR: " + a.getName() + " isn't defined!");
		    }
		    for (Node e : a.getExpressions()) {
				this.check(e);
		    }
		} else if (n.getClass().getName().equals(VarName.class.getName())) {
		    VarName var = (VarName) n;
	    	if (this.st.findSymbol(var.getName()) == null) {
				System.err.println("ERR: " + var.getName() + " isn't defined!");
	    	}
		} else if (n.getClass().getName().equals(BinOp.class.getName())) {
		    BinOp op = (BinOp) n;
		    this.check(op.getFirst());
		    this.check(op.getSecond());	    
		} else if (n.getClass().getName().equals(Root.class.getName())) {
		    Root r = (Root) n;
		    for (Node c : r.getChilds()) {
				this.check(c);
		    }
		}
    }

    public SymbolTable getST() {
		return st;
    }
}