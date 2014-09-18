package laboratorios.lab07.ast;

import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import laboratorios.lab07.parser.ParserCalc;
import laboratorios.lab07.parser.ParserCalcBaseVisitor;

public class AstVisitor extends ParserCalcBaseVisitor<Node> {
    
    public Node visitStart(ParserCalc.ProgramContext ctx) {
	Root root = new Root();
	List<ParserCalc.Dec_listContext> decList = ctx.dec_list();
	List<ParserCalc.Exp_listContext> expList = ctx.exp_list();

	for (ParserCalc.Dec_listContext e : decList) {
	    root.add(visit(e));
	}

	for (ParserCalc.Exp_listContext e : expList) {
	    root.add(visit(e));
	}
	return root;
    }

    public Node visitMult(ParserCalc.MultContext ctx) {
	TerminalNode op = ctx.MULT();
	return new BinOp(op.getText(), visit(ctx.e(0)), visit(ctx.e(1)));
    }
}