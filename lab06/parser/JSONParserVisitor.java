// Generated from parser/JSONParser.g by ANTLR 4.3

	package laboratorios.lab06.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JSONParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JSONParser#pair_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_list(@NotNull JSONParser.Pair_listContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(@NotNull JSONParser.PairContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull JSONParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull JSONParser.ValueContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(@NotNull JSONParser.ObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#members}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMembers(@NotNull JSONParser.MembersContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull JSONParser.ArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link JSONParser#value_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_list(@NotNull JSONParser.Value_listContext ctx);
}