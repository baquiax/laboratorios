// Generated from parser/JSONParser.g by ANTLR 4.3

	package laboratorios.lab06.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JSONParser}.
 */
public interface JSONParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JSONParser#pair_list}.
	 * @param ctx the parse tree
	 */
	void enterPair_list(@NotNull JSONParser.Pair_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#pair_list}.
	 * @param ctx the parse tree
	 */
	void exitPair_list(@NotNull JSONParser.Pair_listContext ctx);

	/**
	 * Enter a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(@NotNull JSONParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(@NotNull JSONParser.PairContext ctx);

	/**
	 * Enter a parse tree produced by {@link JSONParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull JSONParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull JSONParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(@NotNull JSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(@NotNull JSONParser.ValueContext ctx);

	/**
	 * Enter a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(@NotNull JSONParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(@NotNull JSONParser.ObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link JSONParser#members}.
	 * @param ctx the parse tree
	 */
	void enterMembers(@NotNull JSONParser.MembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#members}.
	 * @param ctx the parse tree
	 */
	void exitMembers(@NotNull JSONParser.MembersContext ctx);

	/**
	 * Enter a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(@NotNull JSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(@NotNull JSONParser.ArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link JSONParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(@NotNull JSONParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link JSONParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(@NotNull JSONParser.Value_listContext ctx);
}