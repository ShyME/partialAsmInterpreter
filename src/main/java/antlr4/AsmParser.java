// Generated from Asm.g4 by ANTLR 4.7.1
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AsmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, HEX_NUMBER=4, WS=5, NL=6, INSTRUCTION_TYPE=7, 
		REGISTER=8, PLUS=9, MINUS=10, TIMES=11, NUMBER=12;
	public static final int
		RULE_instruction = 0, RULE_targetParam = 1, RULE_argument = 2, RULE_addSubtractExpr = 3, 
		RULE_multExpr = 4, RULE_minusExpr = 5, RULE_unaryArgument = 6, RULE_signedNumber = 7;
	public static final String[] ruleNames = {
		"instruction", "targetParam", "argument", "addSubtractExpr", "multExpr", 
		"minusExpr", "unaryArgument", "signedNumber"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'('", "')'", null, null, null, null, null, "'+'", "'-'", 
		"'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "HEX_NUMBER", "WS", "NL", "INSTRUCTION_TYPE", 
		"REGISTER", "PLUS", "MINUS", "TIMES", "NUMBER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Asm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AsmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InstructionContext extends ParserRuleContext {
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
	 
		public InstructionContext() { }
		public void copyFrom(InstructionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoubleArgumentInstructionContext extends InstructionContext {
		public TerminalNode INSTRUCTION_TYPE() { return getToken(AsmParser.INSTRUCTION_TYPE, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TargetParamContext targetParam() {
			return getRuleContext(TargetParamContext.class,0);
		}
		public TerminalNode NL() { return getToken(AsmParser.NL, 0); }
		public TerminalNode EOF() { return getToken(AsmParser.EOF, 0); }
		public DoubleArgumentInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterDoubleArgumentInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitDoubleArgumentInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitDoubleArgumentInstruction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleArgumentInstructionContext extends InstructionContext {
		public TerminalNode INSTRUCTION_TYPE() { return getToken(AsmParser.INSTRUCTION_TYPE, 0); }
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public TerminalNode NL() { return getToken(AsmParser.NL, 0); }
		public TerminalNode EOF() { return getToken(AsmParser.EOF, 0); }
		public SingleArgumentInstructionContext(InstructionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterSingleArgumentInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitSingleArgumentInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitSingleArgumentInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_instruction);
		int _la;
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new DoubleArgumentInstructionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(INSTRUCTION_TYPE);
				setState(17);
				argument();
				setState(18);
				match(T__0);
				setState(19);
				targetParam();
				setState(20);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new SingleArgumentInstructionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(INSTRUCTION_TYPE);
				setState(23);
				argument();
				setState(24);
				_la = _input.LA(1);
				if ( !(_la==EOF || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class TargetParamContext extends ParserRuleContext {
		public TerminalNode REGISTER() { return getToken(AsmParser.REGISTER, 0); }
		public TargetParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterTargetParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitTargetParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitTargetParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetParamContext targetParam() throws RecognitionException {
		TargetParamContext _localctx = new TargetParamContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_targetParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(REGISTER);
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

	public static class ArgumentContext extends ParserRuleContext {
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	 
		public ArgumentContext() { }
		public void copyFrom(ArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionContext extends ArgumentContext {
		public AddSubtractExprContext addSubtractExpr() {
			return getRuleContext(AddSubtractExprContext.class,0);
		}
		public ExpressionContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HexNumbContext extends ArgumentContext {
		public TerminalNode HEX_NUMBER() { return getToken(AsmParser.HEX_NUMBER, 0); }
		public HexNumbContext(ArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterHexNumb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitHexNumb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitHexNumb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argument);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case REGISTER:
			case MINUS:
			case NUMBER:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				addSubtractExpr(0);
				}
				break;
			case HEX_NUMBER:
				_localctx = new HexNumbContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(HEX_NUMBER);
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

	public static class AddSubtractExprContext extends ParserRuleContext {
		public AddSubtractExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addSubtractExpr; }
	 
		public AddSubtractExprContext() { }
		public void copyFrom(AddSubtractExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdditionContext extends AddSubtractExprContext {
		public AddSubtractExprContext addSubtractExpr() {
			return getRuleContext(AddSubtractExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(AsmParser.PLUS, 0); }
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public AdditionContext(AddSubtractExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionContext extends AddSubtractExprContext {
		public AddSubtractExprContext addSubtractExpr() {
			return getRuleContext(AddSubtractExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(AsmParser.MINUS, 0); }
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public SubtractionContext(AddSubtractExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToMultExprContext extends AddSubtractExprContext {
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public ToMultExprContext(AddSubtractExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterToMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitToMultExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitToMultExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddSubtractExprContext addSubtractExpr() throws RecognitionException {
		return addSubtractExpr(0);
	}

	private AddSubtractExprContext addSubtractExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddSubtractExprContext _localctx = new AddSubtractExprContext(_ctx, _parentState);
		AddSubtractExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_addSubtractExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMultExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(35);
			multExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(43);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new AdditionContext(new AddSubtractExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addSubtractExpr);
						setState(37);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(38);
						match(PLUS);
						setState(39);
						multExpr(0);
						}
						break;
					case 2:
						{
						_localctx = new SubtractionContext(new AddSubtractExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_addSubtractExpr);
						setState(40);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(41);
						match(MINUS);
						setState(42);
						multExpr(0);
						}
						break;
					}
					} 
				}
				setState(47);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultExprContext extends ParserRuleContext {
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
	 
		public MultExprContext() { }
		public void copyFrom(MultExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicationContext extends MultExprContext {
		public MultExprContext multExpr() {
			return getRuleContext(MultExprContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(AsmParser.TIMES, 0); }
		public MinusExprContext minusExpr() {
			return getRuleContext(MinusExprContext.class,0);
		}
		public MultiplicationContext(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToMinusExprContext extends MultExprContext {
		public MinusExprContext minusExpr() {
			return getRuleContext(MinusExprContext.class,0);
		}
		public ToMinusExprContext(MultExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterToMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitToMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitToMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		return multExpr(0);
	}

	private MultExprContext multExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultExprContext _localctx = new MultExprContext(_ctx, _parentState);
		MultExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_multExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMinusExprContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(49);
			minusExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplicationContext(new MultExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_multExpr);
					setState(51);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(52);
					match(TIMES);
					setState(53);
					minusExpr();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MinusExprContext extends ParserRuleContext {
		public MinusExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minusExpr; }
	 
		public MinusExprContext() { }
		public void copyFrom(MinusExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ToSimpleArgumentContext extends MinusExprContext {
		public UnaryArgumentContext unaryArgument() {
			return getRuleContext(UnaryArgumentContext.class,0);
		}
		public ToSimpleArgumentContext(MinusExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterToSimpleArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitToSimpleArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitToSimpleArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignChangeContext extends MinusExprContext {
		public TerminalNode MINUS() { return getToken(AsmParser.MINUS, 0); }
		public UnaryArgumentContext unaryArgument() {
			return getRuleContext(UnaryArgumentContext.class,0);
		}
		public SignChangeContext(MinusExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterSignChange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitSignChange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitSignChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinusExprContext minusExpr() throws RecognitionException {
		MinusExprContext _localctx = new MinusExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_minusExpr);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new SignChangeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(MINUS);
				setState(60);
				unaryArgument();
				}
				break;
			case 2:
				_localctx = new ToSimpleArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				unaryArgument();
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

	public static class UnaryArgumentContext extends ParserRuleContext {
		public UnaryArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryArgument; }
	 
		public UnaryArgumentContext() { }
		public void copyFrom(UnaryArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracesContext extends UnaryArgumentContext {
		public AddSubtractExprContext addSubtractExpr() {
			return getRuleContext(AddSubtractExprContext.class,0);
		}
		public BracesContext(UnaryArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RegContext extends UnaryArgumentContext {
		public TerminalNode REGISTER() { return getToken(AsmParser.REGISTER, 0); }
		public RegContext(UnaryArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitReg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitReg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SignedNumbContext extends UnaryArgumentContext {
		public SignedNumberContext signedNumber() {
			return getRuleContext(SignedNumberContext.class,0);
		}
		public SignedNumbContext(UnaryArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterSignedNumb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitSignedNumb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitSignedNumb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryArgumentContext unaryArgument() throws RecognitionException {
		UnaryArgumentContext _localctx = new UnaryArgumentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryArgument);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGISTER:
				_localctx = new RegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(REGISTER);
				}
				break;
			case MINUS:
			case NUMBER:
				_localctx = new SignedNumbContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				signedNumber();
				}
				break;
			case T__1:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__1);
				setState(67);
				addSubtractExpr(0);
				setState(68);
				match(T__2);
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

	public static class SignedNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(AsmParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(AsmParser.MINUS, 0); }
		public SignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).enterSignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AsmListener ) ((AsmListener)listener).exitSignedNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AsmVisitor ) return ((AsmVisitor<? extends T>)visitor).visitSignedNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignedNumberContext signedNumber() throws RecognitionException {
		SignedNumberContext _localctx = new SignedNumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_signedNumber);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(NUMBER);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(MINUS);
				setState(74);
				match(NUMBER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return addSubtractExpr_sempred((AddSubtractExprContext)_localctx, predIndex);
		case 4:
			return multExpr_sempred((MultExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean addSubtractExpr_sempred(AddSubtractExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multExpr_sempred(MultExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\4\3\4\5\4#\n\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\69\n\6\f\6\16\6<\13\6\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\5\bI\n\b\3\t\3\t\3\t\5\tN\n\t\3\t\2\4\b\n\n\2\4\6\b\n\f\16\20\2\3\3"+
		"\3\b\b\2P\2\34\3\2\2\2\4\36\3\2\2\2\6\"\3\2\2\2\b$\3\2\2\2\n\62\3\2\2"+
		"\2\f@\3\2\2\2\16H\3\2\2\2\20M\3\2\2\2\22\23\7\t\2\2\23\24\5\6\4\2\24\25"+
		"\7\3\2\2\25\26\5\4\3\2\26\27\t\2\2\2\27\35\3\2\2\2\30\31\7\t\2\2\31\32"+
		"\5\6\4\2\32\33\t\2\2\2\33\35\3\2\2\2\34\22\3\2\2\2\34\30\3\2\2\2\35\3"+
		"\3\2\2\2\36\37\7\n\2\2\37\5\3\2\2\2 #\5\b\5\2!#\7\6\2\2\" \3\2\2\2\"!"+
		"\3\2\2\2#\7\3\2\2\2$%\b\5\1\2%&\5\n\6\2&/\3\2\2\2\'(\f\5\2\2()\7\13\2"+
		"\2).\5\n\6\2*+\f\4\2\2+,\7\f\2\2,.\5\n\6\2-\'\3\2\2\2-*\3\2\2\2.\61\3"+
		"\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\t\3\2\2\2\61/\3\2\2\2\62\63\b\6\1\2\63"+
		"\64\5\f\7\2\64:\3\2\2\2\65\66\f\4\2\2\66\67\7\r\2\2\679\5\f\7\28\65\3"+
		"\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\13\3\2\2\2<:\3\2\2\2=>\7\f\2\2>"+
		"A\5\16\b\2?A\5\16\b\2@=\3\2\2\2@?\3\2\2\2A\r\3\2\2\2BI\7\n\2\2CI\5\20"+
		"\t\2DE\7\4\2\2EF\5\b\5\2FG\7\5\2\2GI\3\2\2\2HB\3\2\2\2HC\3\2\2\2HD\3\2"+
		"\2\2I\17\3\2\2\2JN\7\16\2\2KL\7\f\2\2LN\7\16\2\2MJ\3\2\2\2MK\3\2\2\2N"+
		"\21\3\2\2\2\n\34\"-/:@HM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}