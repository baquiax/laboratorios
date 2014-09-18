// Generated from parser/JSONParser.g by ANTLR 4.3

	package laboratorios.lab06.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COLON=12, INTEGER=9, OPEN_BRACKET=4, BOOLEAN=11, FLOAT=10, SCAPPED_CHAR=6, 
		CLOSE_BRACE=3, FORMAT=1, COMMA=13, OPEN_BRACE=2, CHARACTER=8, STRING=7, 
		CLOSE_BRACKET=5;
	public static final String[] tokenNames = {
		"<INVALID>", "FORMAT", "'{'", "'}'", "'['", "']'", "SCAPPED_CHAR", "STRING", 
		"CHARACTER", "INTEGER", "FLOAT", "BOOLEAN", "':'", "','"
	};
	public static final int
		RULE_start = 0, RULE_object = 1, RULE_members = 2, RULE_pair = 3, RULE_value = 4, 
		RULE_pair_list = 5, RULE_value_list = 6, RULE_array = 7;
	public static final String[] ruleNames = {
		"start", "object", "members", "pair", "value", "pair_list", "value_list", 
		"array"
	};

	@Override
	public String getGrammarFileName() { return "JSONParser.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ObjectContext object;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); ((StartContext)_localctx).object = object();
			System.out.println((((StartContext)_localctx).object!=null?_input.getText(((StartContext)_localctx).object.start,((StartContext)_localctx).object.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public MembersContext members() {
			return getRuleContext(MembersContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(JSONParser.CLOSE_BRACE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(JSONParser.OPEN_BRACE, 0); }
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); match(OPEN_BRACE);
			setState(20); members();
			setState(21); match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MembersContext extends ParserRuleContext {
		public Pair_listContext pair_list() {
			return getRuleContext(Pair_listContext.class,0);
		}
		public MembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_members; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitMembers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitMembers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MembersContext members() throws RecognitionException {
		MembersContext _localctx = new MembersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_members);
		try {
			setState(25);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(23); pair_list();
				}
				break;
			case CLOSE_BRACE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COLON() { return getToken(JSONParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); match(STRING);
			setState(28); match(COLON);
			setState(29); value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode BOOLEAN() { return getToken(JSONParser.BOOLEAN, 0); }
		public TerminalNode FLOAT() { return getToken(JSONParser.FLOAT, 0); }
		public TerminalNode INTEGER() { return getToken(JSONParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(37);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(31); match(STRING);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); match(INTEGER);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(33); match(BOOLEAN);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 4);
				{
				setState(34); match(FLOAT);
				}
				break;
			case OPEN_BRACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(35); object();
				}
				break;
			case OPEN_BRACKET:
				enterOuterAlt(_localctx, 6);
				{
				setState(36); array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_listContext extends ParserRuleContext {
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public Pair_listContext pair_list() {
			return getRuleContext(Pair_listContext.class,0);
		}
		public Pair_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterPair_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitPair_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitPair_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_listContext pair_list() throws RecognitionException {
		Pair_listContext _localctx = new Pair_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pair_list);
		try {
			setState(44);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(39); pair();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); pair();
				setState(41); match(COMMA);
				setState(42); pair_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Value_listContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(JSONParser.COMMA, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public Value_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterValue_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitValue_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitValue_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Value_listContext value_list() throws RecognitionException {
		Value_listContext _localctx = new Value_listContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value_list);
		try {
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); value();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); value();
				setState(48); match(COMMA);
				setState(49); value_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACKET() { return getToken(JSONParser.CLOSE_BRACKET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(JSONParser.OPEN_BRACKET, 0); }
		public Value_listContext value_list() {
			return getRuleContext(Value_listContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONParserListener ) ((JSONParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JSONParserVisitor ) return ((JSONParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); match(OPEN_BRACKET);
			setState(55);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_BRACE) | (1L << OPEN_BRACKET) | (1L << STRING) | (1L << INTEGER) | (1L << FLOAT) | (1L << BOOLEAN))) != 0)) {
				{
				setState(54); value_list();
				}
			}

			setState(57); match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17>\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6(\n\6\3\7\3\7\3\7\3\7\3\7\5\7/\n\7\3\b\3\b\3\b\3\b\3\b\5\b\66\n\b\3"+
		"\t\3\t\5\t:\n\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2>\2\22\3\2\2\2"+
		"\4\25\3\2\2\2\6\33\3\2\2\2\b\35\3\2\2\2\n\'\3\2\2\2\f.\3\2\2\2\16\65\3"+
		"\2\2\2\20\67\3\2\2\2\22\23\5\4\3\2\23\24\b\2\1\2\24\3\3\2\2\2\25\26\7"+
		"\4\2\2\26\27\5\6\4\2\27\30\7\5\2\2\30\5\3\2\2\2\31\34\5\f\7\2\32\34\3"+
		"\2\2\2\33\31\3\2\2\2\33\32\3\2\2\2\34\7\3\2\2\2\35\36\7\t\2\2\36\37\7"+
		"\16\2\2\37 \5\n\6\2 \t\3\2\2\2!(\7\t\2\2\"(\7\13\2\2#(\7\r\2\2$(\7\f\2"+
		"\2%(\5\4\3\2&(\5\20\t\2\'!\3\2\2\2\'\"\3\2\2\2\'#\3\2\2\2\'$\3\2\2\2\'"+
		"%\3\2\2\2\'&\3\2\2\2(\13\3\2\2\2)/\5\b\5\2*+\5\b\5\2+,\7\17\2\2,-\5\f"+
		"\7\2-/\3\2\2\2.)\3\2\2\2.*\3\2\2\2/\r\3\2\2\2\60\66\5\n\6\2\61\62\5\n"+
		"\6\2\62\63\7\17\2\2\63\64\5\16\b\2\64\66\3\2\2\2\65\60\3\2\2\2\65\61\3"+
		"\2\2\2\66\17\3\2\2\2\679\7\6\2\28:\5\16\b\298\3\2\2\29:\3\2\2\2:;\3\2"+
		"\2\2;<\7\7\2\2<\21\3\2\2\2\7\33\'.\659";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}