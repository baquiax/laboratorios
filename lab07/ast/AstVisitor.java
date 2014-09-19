package laboratorios.lab07.ast;

import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import laboratorios.lab07.parser.ParserCalc;
import laboratorios.lab07.parser.ParserCalcBaseVisitor;

public class AstVisitor extends ParserCalcBaseVisitor<Node> {
    
    @Override
    public Node visitProgram(ParserCalc.ProgramContext ctx) {
	System.out.println("#program visit");
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
    
    @Override
    public Node visitInteger(ParserCalc.IntegerContext ctx) {
	return new IntLiteral(ctx.INTEGER().getText());
    }

    @Override
    public Node visitFloat(ParserCalc.FloatContext ctx) {
	return new FloatLiteral(ctx.FLOAT().getText());
    }

    @Override
    public Node visitMult(ParserCalc.MultContext ctx) {
	TerminalNode op = ctx.MULT();
	return new BinOp(op.getText(), visit(ctx.e(0)), visit(ctx.e(1)));
    }
        
    @Override
    public Node visitDiv(ParserCalc.DivContext ctx) {
	TerminalNode op = ctx.DIV();
	return new BinOp(op.getText(), visit(ctx.e(0)), visit(ctx.e(1)));
    }

    @Override
    public Node visitExpList(ParserCalc.ExpListContext ctx) {
	if (ctx.e() != null) {
	    return visit(ctx.e());
	} else {
	    return visit(ctx.a());
	}
    }
        
}