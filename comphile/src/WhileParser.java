// $ANTLR 3.5.1 /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g 2023-11-20 16:06:24

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class WhileParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "COMMANDS", "CONS", 
		"DEFINITION", "EXPR", "FOR", "FOREACH", "FUNCTION", "HD", "IF", "INPUT", 
		"LIST", "OUTPUT", "SYMBOL", "TEST", "TL", "VARIABLE", "WHILE", "'%'", 
		"'('", "')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", 
		"'fi'", "'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int ASSIGN=4;
	public static final int COMMANDS=5;
	public static final int CONS=6;
	public static final int DEFINITION=7;
	public static final int EXPR=8;
	public static final int FOR=9;
	public static final int FOREACH=10;
	public static final int FUNCTION=11;
	public static final int HD=12;
	public static final int IF=13;
	public static final int INPUT=14;
	public static final int LIST=15;
	public static final int OUTPUT=16;
	public static final int SYMBOL=17;
	public static final int TEST=18;
	public static final int TL=19;
	public static final int VARIABLE=20;
	public static final int WHILE=21;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "vars", "definition", "command", "expression", "input", 
		"output", "commands", "inputSub", "program", "exprs", "lExpr", "function", 
		"exprBase"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public WhileParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public WhileParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public WhileParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return WhileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g"; }


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:31:1: exprBase : ( ( 'nil' | VARIABLE | SYMBOL ) | '(' 'cons' lExpr ')' -> ^( CONS lExpr ) | '(' 'list' lExpr ')' -> ^( LIST lExpr ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL lExpr ')' -> ^( SYMBOL lExpr ) );
	public final WhileParser.exprBase_return exprBase() throws RecognitionException {
		WhileParser.exprBase_return retval = new WhileParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set1=null;
		Token char_literal2=null;
		Token string_literal3=null;
		Token char_literal5=null;
		Token char_literal6=null;
		Token string_literal7=null;
		Token char_literal9=null;
		Token char_literal10=null;
		Token string_literal11=null;
		Token char_literal13=null;
		Token char_literal14=null;
		Token string_literal15=null;
		Token char_literal17=null;
		Token char_literal18=null;
		Token SYMBOL19=null;
		Token char_literal21=null;
		ParserRuleReturnScope lExpr4 =null;
		ParserRuleReturnScope lExpr8 =null;
		ParserRuleReturnScope exprBase12 =null;
		ParserRuleReturnScope exprBase16 =null;
		ParserRuleReturnScope lExpr20 =null;

		Object set1_tree=null;
		Object char_literal2_tree=null;
		Object string_literal3_tree=null;
		Object char_literal5_tree=null;
		Object char_literal6_tree=null;
		Object string_literal7_tree=null;
		Object char_literal9_tree=null;
		Object char_literal10_tree=null;
		Object string_literal11_tree=null;
		Object char_literal13_tree=null;
		Object char_literal14_tree=null;
		Object string_literal15_tree=null;
		Object char_literal17_tree=null;
		Object char_literal18_tree=null;
		Object SYMBOL19_tree=null;
		Object char_literal21_tree=null;
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:31:10: ( ( 'nil' | VARIABLE | SYMBOL ) | '(' 'cons' lExpr ')' -> ^( CONS lExpr ) | '(' 'list' lExpr ')' -> ^( LIST lExpr ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL lExpr ')' -> ^( SYMBOL lExpr ) )
			int alt1=6;
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==SYMBOL||LA1_0==VARIABLE||LA1_0==41) ) {
				alt1=1;
			}
			else if ( (LA1_0==23) ) {
				switch ( input.LA(2) ) {
				case 30:
					{
					alt1=2;
					}
					break;
				case 40:
					{
					alt1=3;
					}
					break;
				case 37:
					{
					alt1=4;
					}
					break;
				case 46:
					{
					alt1=5;
					}
					break;
				case SYMBOL:
					{
					alt1=6;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:32:2: ( 'nil' | VARIABLE | SYMBOL )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(32,2);
					set1=input.LT(1);
					if ( input.LA(1)==SYMBOL||input.LA(1)==VARIABLE||input.LA(1)==41 ) {
						input.consume();
						adaptor.addChild(root_0, (Object)adaptor.create(set1));
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						dbg.recognitionException(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:33:4: '(' 'cons' lExpr ')'
					{
					dbg.location(33,4);
					char_literal2=(Token)match(input,23,FOLLOW_23_in_exprBase175);  
					stream_23.add(char_literal2);
					dbg.location(33,8);
					string_literal3=(Token)match(input,30,FOLLOW_30_in_exprBase177);  
					stream_30.add(string_literal3);
					dbg.location(33,15);
					pushFollow(FOLLOW_lExpr_in_exprBase179);
					lExpr4=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr4.getTree());dbg.location(33,21);
					char_literal5=(Token)match(input,24,FOLLOW_24_in_exprBase181);  
					stream_24.add(char_literal5);

					// AST REWRITE
					// elements: lExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 33:25: -> ^( CONS lExpr )
					{
						dbg.location(33,28);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:33:28: ^( CONS lExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(33,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
						dbg.location(33,35);
						adaptor.addChild(root_1, stream_lExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:34:4: '(' 'list' lExpr ')'
					{
					dbg.location(34,4);
					char_literal6=(Token)match(input,23,FOLLOW_23_in_exprBase194);  
					stream_23.add(char_literal6);
					dbg.location(34,8);
					string_literal7=(Token)match(input,40,FOLLOW_40_in_exprBase196);  
					stream_40.add(string_literal7);
					dbg.location(34,15);
					pushFollow(FOLLOW_lExpr_in_exprBase198);
					lExpr8=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr8.getTree());dbg.location(34,21);
					char_literal9=(Token)match(input,24,FOLLOW_24_in_exprBase200);  
					stream_24.add(char_literal9);

					// AST REWRITE
					// elements: lExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 34:25: -> ^( LIST lExpr )
					{
						dbg.location(34,28);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:34:28: ^( LIST lExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(34,30);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						dbg.location(34,35);
						adaptor.addChild(root_1, stream_lExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:35:4: '(' 'hd' exprBase ')'
					{
					dbg.location(35,4);
					char_literal10=(Token)match(input,23,FOLLOW_23_in_exprBase213);  
					stream_23.add(char_literal10);
					dbg.location(35,8);
					string_literal11=(Token)match(input,37,FOLLOW_37_in_exprBase215);  
					stream_37.add(string_literal11);
					dbg.location(35,13);
					pushFollow(FOLLOW_exprBase_in_exprBase217);
					exprBase12=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase12.getTree());dbg.location(35,22);
					char_literal13=(Token)match(input,24,FOLLOW_24_in_exprBase219);  
					stream_24.add(char_literal13);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 35:26: -> ^( HD exprBase )
					{
						dbg.location(35,29);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:35:29: ^( HD exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(35,31);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
						dbg.location(35,34);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:36:4: '(' 'tl' exprBase ')'
					{
					dbg.location(36,4);
					char_literal14=(Token)match(input,23,FOLLOW_23_in_exprBase232);  
					stream_23.add(char_literal14);
					dbg.location(36,8);
					string_literal15=(Token)match(input,46,FOLLOW_46_in_exprBase234);  
					stream_46.add(string_literal15);
					dbg.location(36,13);
					pushFollow(FOLLOW_exprBase_in_exprBase236);
					exprBase16=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase16.getTree());dbg.location(36,22);
					char_literal17=(Token)match(input,24,FOLLOW_24_in_exprBase238);  
					stream_24.add(char_literal17);

					// AST REWRITE
					// elements: exprBase
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 36:26: -> ^( TL exprBase )
					{
						dbg.location(36,29);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:36:29: ^( TL exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(36,31);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
						dbg.location(36,34);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:37:4: '(' SYMBOL lExpr ')'
					{
					dbg.location(37,4);
					char_literal18=(Token)match(input,23,FOLLOW_23_in_exprBase251);  
					stream_23.add(char_literal18);
					dbg.location(37,8);
					SYMBOL19=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprBase253);  
					stream_SYMBOL.add(SYMBOL19);
					dbg.location(37,15);
					pushFollow(FOLLOW_lExpr_in_exprBase255);
					lExpr20=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr20.getTree());dbg.location(37,21);
					char_literal21=(Token)match(input,24,FOLLOW_24_in_exprBase257);  
					stream_24.add(char_literal21);

					// AST REWRITE
					// elements: lExpr, SYMBOL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 37:25: -> ^( SYMBOL lExpr )
					{
						dbg.location(37,28);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:37:28: ^( SYMBOL lExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(37,30);
						root_1 = (Object)adaptor.becomeRoot(stream_SYMBOL.nextNode(), root_1);
						dbg.location(37,37);
						adaptor.addChild(root_1, stream_lExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(37, 42);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprBase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprBase"


	public static class lExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lExpr"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:39:1: lExpr : ( exprBase lExpr )? ;
	public final WhileParser.lExpr_return lExpr() throws RecognitionException {
		WhileParser.lExpr_return retval = new WhileParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprBase22 =null;
		ParserRuleReturnScope lExpr23 =null;


		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:39:7: ( ( exprBase lExpr )? )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:40:2: ( exprBase lExpr )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(40,2);
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:40:2: ( exprBase lExpr )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==SYMBOL||LA2_0==VARIABLE||LA2_0==23||LA2_0==41) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:40:3: exprBase lExpr
					{
					dbg.location(40,3);
					pushFollow(FOLLOW_exprBase_in_lExpr276);
					exprBase22=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase22.getTree());
					dbg.location(40,12);
					pushFollow(FOLLOW_lExpr_in_lExpr278);
					lExpr23=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr23.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(40, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lExpr"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:42:1: expression : exprBase ( '=?' exprBase )? -> ^( EXPR exprBase ( exprBase )? ) ;
	public final WhileParser.expression_return expression() throws RecognitionException {
		WhileParser.expression_return retval = new WhileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal25=null;
		ParserRuleReturnScope exprBase24 =null;
		ParserRuleReturnScope exprBase26 =null;

		Object string_literal25_tree=null;
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:42:12: ( exprBase ( '=?' exprBase )? -> ^( EXPR exprBase ( exprBase )? ) )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:43:2: exprBase ( '=?' exprBase )?
			{
			dbg.location(43,2);
			pushFollow(FOLLOW_exprBase_in_expression289);
			exprBase24=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase24.getTree());dbg.location(43,11);
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:43:11: ( '=?' exprBase )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==29) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:43:12: '=?' exprBase
					{
					dbg.location(43,12);
					string_literal25=(Token)match(input,29,FOLLOW_29_in_expression292);  
					stream_29.add(string_literal25);
					dbg.location(43,17);
					pushFollow(FOLLOW_exprBase_in_expression294);
					exprBase26=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase26.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}

			// AST REWRITE
			// elements: exprBase, exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 43:28: -> ^( EXPR exprBase ( exprBase )? )
			{
				dbg.location(43,31);
				// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:43:31: ^( EXPR exprBase ( exprBase )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(43,33);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				dbg.location(43,38);
				adaptor.addChild(root_1, stream_exprBase.nextTree());dbg.location(43,47);
				// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:43:47: ( exprBase )?
				if ( stream_exprBase.hasNext() ) {
					dbg.location(43,47);
					adaptor.addChild(root_1, stream_exprBase.nextTree());
				}
				stream_exprBase.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(43, 56);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:45:1: vars : VARIABLE ( ',' ! vars )? ;
	public final WhileParser.vars_return vars() throws RecognitionException {
		WhileParser.vars_return retval = new WhileParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE27=null;
		Token char_literal28=null;
		ParserRuleReturnScope vars29 =null;

		Object VARIABLE27_tree=null;
		Object char_literal28_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:45:6: ( VARIABLE ( ',' ! vars )? )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:46:2: VARIABLE ( ',' ! vars )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(46,2);
			VARIABLE27=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars316); 
			VARIABLE27_tree = (Object)adaptor.create(VARIABLE27);
			adaptor.addChild(root_0, VARIABLE27_tree);
			dbg.location(46,11);
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:46:11: ( ',' ! vars )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==25) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:46:12: ',' ! vars
					{
					dbg.location(46,15);
					char_literal28=(Token)match(input,25,FOLLOW_25_in_vars319); dbg.location(46,17);
					pushFollow(FOLLOW_vars_in_vars322);
					vars29=vars();
					state._fsp--;

					adaptor.addChild(root_0, vars29.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(46, 22);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:48:1: exprs : expression ( ',' ! exprs )? ;
	public final WhileParser.exprs_return exprs() throws RecognitionException {
		WhileParser.exprs_return retval = new WhileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal31=null;
		ParserRuleReturnScope expression30 =null;
		ParserRuleReturnScope exprs32 =null;

		Object char_literal31_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:48:7: ( expression ( ',' ! exprs )? )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:49:2: expression ( ',' ! exprs )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(49,2);
			pushFollow(FOLLOW_expression_in_exprs333);
			expression30=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression30.getTree());
			dbg.location(49,13);
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:49:13: ( ',' ! exprs )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==25) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:49:14: ',' ! exprs
					{
					dbg.location(49,17);
					char_literal31=(Token)match(input,25,FOLLOW_25_in_exprs336); dbg.location(49,19);
					pushFollow(FOLLOW_exprs_in_exprs339);
					exprs32=exprs();
					state._fsp--;

					adaptor.addChild(root_0, exprs32.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(49, 25);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprs"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:51:1: output : VARIABLE ( ',' ! output )? ;
	public final WhileParser.output_return output() throws RecognitionException {
		WhileParser.output_return retval = new WhileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE33=null;
		Token char_literal34=null;
		ParserRuleReturnScope output35 =null;

		Object VARIABLE33_tree=null;
		Object char_literal34_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:51:8: ( VARIABLE ( ',' ! output )? )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:52:2: VARIABLE ( ',' ! output )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(52,2);
			VARIABLE33=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output351); 
			VARIABLE33_tree = (Object)adaptor.create(VARIABLE33);
			adaptor.addChild(root_0, VARIABLE33_tree);
			dbg.location(52,11);
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:52:11: ( ',' ! output )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==25) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:52:12: ',' ! output
					{
					dbg.location(52,15);
					char_literal34=(Token)match(input,25,FOLLOW_25_in_output354); dbg.location(52,17);
					pushFollow(FOLLOW_output_in_output357);
					output35=output();
					state._fsp--;

					adaptor.addChild(root_0, output35.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 24);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "output");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "output"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:54:1: inputSub : VARIABLE ( ',' ! inputSub )? ;
	public final WhileParser.inputSub_return inputSub() throws RecognitionException {
		WhileParser.inputSub_return retval = new WhileParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE36=null;
		Token char_literal37=null;
		ParserRuleReturnScope inputSub38 =null;

		Object VARIABLE36_tree=null;
		Object char_literal37_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:54:10: ( VARIABLE ( ',' ! inputSub )? )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:55:2: VARIABLE ( ',' ! inputSub )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(55,2);
			VARIABLE36=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputSub369); 
			VARIABLE36_tree = (Object)adaptor.create(VARIABLE36);
			adaptor.addChild(root_0, VARIABLE36_tree);
			dbg.location(55,11);
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:55:11: ( ',' ! inputSub )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==25) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:55:12: ',' ! inputSub
					{
					dbg.location(55,15);
					char_literal37=(Token)match(input,25,FOLLOW_25_in_inputSub372); dbg.location(55,17);
					pushFollow(FOLLOW_inputSub_in_inputSub375);
					inputSub38=inputSub();
					state._fsp--;

					adaptor.addChild(root_0, inputSub38.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(55, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inputSub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "inputSub"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:57:1: input : ( inputSub )? -> ^( INPUT ( inputSub )? ) ;
	public final WhileParser.input_return input() throws RecognitionException {
		WhileParser.input_return retval = new WhileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub39 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:57:7: ( ( inputSub )? -> ^( INPUT ( inputSub )? ) )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:58:2: ( inputSub )?
			{
			dbg.location(58,2);
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:58:2: ( inputSub )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==VARIABLE) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:58:2: inputSub
					{
					dbg.location(58,2);
					pushFollow(FOLLOW_inputSub_in_input386);
					inputSub39=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub39.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			// AST REWRITE
			// elements: inputSub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 58:12: -> ^( INPUT ( inputSub )? )
			{
				dbg.location(58,15);
				// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:58:15: ^( INPUT ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(58,17);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				dbg.location(58,23);
				// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:58:23: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					dbg.location(58,23);
					adaptor.addChild(root_1, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(58, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "input"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:60:1: commands : command ( ';' ! commands )? ;
	public final WhileParser.commands_return commands() throws RecognitionException {
		WhileParser.commands_return retval = new WhileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal41=null;
		ParserRuleReturnScope command40 =null;
		ParserRuleReturnScope commands42 =null;

		Object char_literal41_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(60, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:60:10: ( command ( ';' ! commands )? )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:61:2: command ( ';' ! commands )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(61,2);
			pushFollow(FOLLOW_command_in_commands405);
			command40=command();
			state._fsp--;

			adaptor.addChild(root_0, command40.getTree());
			dbg.location(61,10);
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:61:10: ( ';' ! commands )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==28) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:61:11: ';' ! commands
					{
					dbg.location(61,14);
					char_literal41=(Token)match(input,28,FOLLOW_28_in_commands408); dbg.location(61,16);
					pushFollow(FOLLOW_commands_in_commands411);
					commands42=commands();
					state._fsp--;

					adaptor.addChild(root_0, commands42.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(61, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "commands"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:63:1: command : ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF expression commands ( commands )? ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE expression commands ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR expression commands ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE expression commands ) );
	public final WhileParser.command_return command() throws RecognitionException {
		WhileParser.command_return retval = new WhileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal43=null;
		Token string_literal45=null;
		Token string_literal47=null;
		Token string_literal49=null;
		Token string_literal51=null;
		Token string_literal53=null;
		Token string_literal54=null;
		Token string_literal56=null;
		Token string_literal58=null;
		Token string_literal59=null;
		Token string_literal61=null;
		Token string_literal63=null;
		Token string_literal64=null;
		Token VARIABLE65=null;
		Token string_literal66=null;
		Token string_literal68=null;
		Token string_literal70=null;
		ParserRuleReturnScope vars44 =null;
		ParserRuleReturnScope exprs46 =null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope commands50 =null;
		ParserRuleReturnScope commands52 =null;
		ParserRuleReturnScope expression55 =null;
		ParserRuleReturnScope commands57 =null;
		ParserRuleReturnScope expression60 =null;
		ParserRuleReturnScope commands62 =null;
		ParserRuleReturnScope expression67 =null;
		ParserRuleReturnScope commands69 =null;

		Object string_literal43_tree=null;
		Object string_literal45_tree=null;
		Object string_literal47_tree=null;
		Object string_literal49_tree=null;
		Object string_literal51_tree=null;
		Object string_literal53_tree=null;
		Object string_literal54_tree=null;
		Object string_literal56_tree=null;
		Object string_literal58_tree=null;
		Object string_literal59_tree=null;
		Object string_literal61_tree=null;
		Object string_literal63_tree=null;
		Object string_literal64_tree=null;
		Object VARIABLE65_tree=null;
		Object string_literal66_tree=null;
		Object string_literal68_tree=null;
		Object string_literal70_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:63:9: ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF expression commands ( commands )? ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE expression commands ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR expression commands ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE expression commands ) )
			int alt11=6;
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			switch ( input.LA(1) ) {
			case 42:
				{
				alt11=1;
				}
				break;
			case VARIABLE:
				{
				alt11=2;
				}
				break;
			case 38:
				{
				alt11=3;
				}
				break;
			case 47:
				{
				alt11=4;
				}
				break;
			case 34:
				{
				alt11=5;
				}
				break;
			case 35:
				{
				alt11=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:64:2: ( 'nop' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(64,2);
					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:64:2: ( 'nop' )
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:64:3: 'nop'
					{
					dbg.location(64,3);
					string_literal43=(Token)match(input,42,FOLLOW_42_in_command425); 
					string_literal43_tree = (Object)adaptor.create(string_literal43);
					adaptor.addChild(root_0, string_literal43_tree);

					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:65:4: ( vars ':=' exprs )
					{
					dbg.location(65,4);
					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:65:4: ( vars ':=' exprs )
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:65:5: vars ':=' exprs
					{
					dbg.location(65,5);
					pushFollow(FOLLOW_vars_in_command432);
					vars44=vars();
					state._fsp--;

					stream_vars.add(vars44.getTree());dbg.location(65,10);
					string_literal45=(Token)match(input,27,FOLLOW_27_in_command434);  
					stream_27.add(string_literal45);
					dbg.location(65,15);
					pushFollow(FOLLOW_exprs_in_command436);
					exprs46=exprs();
					state._fsp--;

					stream_exprs.add(exprs46.getTree());
					}

					// AST REWRITE
					// elements: exprs, vars
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:22: -> ^( ASSIGN vars exprs )
					{
						dbg.location(65,25);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:65:25: ^( ASSIGN vars exprs )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(65,27);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						dbg.location(65,34);
						adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(65,39);
						adaptor.addChild(root_1, stream_exprs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:66:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
					{
					dbg.location(66,4);
					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:66:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:66:5: 'if' expression 'then' commands ( 'else' commands )? 'fi'
					{
					dbg.location(66,5);
					string_literal47=(Token)match(input,38,FOLLOW_38_in_command453);  
					stream_38.add(string_literal47);
					dbg.location(66,10);
					pushFollow(FOLLOW_expression_in_command455);
					expression48=expression();
					state._fsp--;

					stream_expression.add(expression48.getTree());dbg.location(66,21);
					string_literal49=(Token)match(input,45,FOLLOW_45_in_command457);  
					stream_45.add(string_literal49);
					dbg.location(66,28);
					pushFollow(FOLLOW_commands_in_command459);
					commands50=commands();
					state._fsp--;

					stream_commands.add(commands50.getTree());dbg.location(66,37);
					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:66:37: ( 'else' commands )?
					int alt10=2;
					try { dbg.enterSubRule(10);
					try { dbg.enterDecision(10, decisionCanBacktrack[10]);

					int LA10_0 = input.LA(1);
					if ( (LA10_0==32) ) {
						alt10=1;
					}
					} finally {dbg.exitDecision(10);}

					switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:66:38: 'else' commands
							{
							dbg.location(66,38);
							string_literal51=(Token)match(input,32,FOLLOW_32_in_command462);  
							stream_32.add(string_literal51);
							dbg.location(66,45);
							pushFollow(FOLLOW_commands_in_command464);
							commands52=commands();
							state._fsp--;

							stream_commands.add(commands52.getTree());
							}
							break;

					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(66,56);
					string_literal53=(Token)match(input,33,FOLLOW_33_in_command468);  
					stream_33.add(string_literal53);

					}

					// AST REWRITE
					// elements: expression, commands, commands
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 66:62: -> ^( IF expression commands ( commands )? )
					{
						dbg.location(66,65);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:66:65: ^( IF expression commands ( commands )? )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(66,67);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
						dbg.location(66,70);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(66,81);
						adaptor.addChild(root_1, stream_commands.nextTree());dbg.location(66,90);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:66:90: ( commands )?
						if ( stream_commands.hasNext() ) {
							dbg.location(66,90);
							adaptor.addChild(root_1, stream_commands.nextTree());
						}
						stream_commands.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:67:4: ( 'while' expression 'do' commands 'od' )
					{
					dbg.location(67,4);
					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:67:4: ( 'while' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:67:5: 'while' expression 'do' commands 'od'
					{
					dbg.location(67,5);
					string_literal54=(Token)match(input,47,FOLLOW_47_in_command488);  
					stream_47.add(string_literal54);
					dbg.location(67,13);
					pushFollow(FOLLOW_expression_in_command490);
					expression55=expression();
					state._fsp--;

					stream_expression.add(expression55.getTree());dbg.location(67,24);
					string_literal56=(Token)match(input,31,FOLLOW_31_in_command492);  
					stream_31.add(string_literal56);
					dbg.location(67,29);
					pushFollow(FOLLOW_commands_in_command494);
					commands57=commands();
					state._fsp--;

					stream_commands.add(commands57.getTree());dbg.location(67,38);
					string_literal58=(Token)match(input,43,FOLLOW_43_in_command496);  
					stream_43.add(string_literal58);

					}

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 67:44: -> ^( WHILE expression commands )
					{
						dbg.location(67,47);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:67:47: ^( WHILE expression commands )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(67,49);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						dbg.location(67,55);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(67,66);
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:68:4: ( 'for' expression 'do' commands 'od' )
					{
					dbg.location(68,4);
					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:68:4: ( 'for' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:68:5: 'for' expression 'do' commands 'od'
					{
					dbg.location(68,5);
					string_literal59=(Token)match(input,34,FOLLOW_34_in_command513);  
					stream_34.add(string_literal59);
					dbg.location(68,11);
					pushFollow(FOLLOW_expression_in_command515);
					expression60=expression();
					state._fsp--;

					stream_expression.add(expression60.getTree());dbg.location(68,22);
					string_literal61=(Token)match(input,31,FOLLOW_31_in_command517);  
					stream_31.add(string_literal61);
					dbg.location(68,27);
					pushFollow(FOLLOW_commands_in_command519);
					commands62=commands();
					state._fsp--;

					stream_commands.add(commands62.getTree());dbg.location(68,36);
					string_literal63=(Token)match(input,43,FOLLOW_43_in_command521);  
					stream_43.add(string_literal63);

					}

					// AST REWRITE
					// elements: commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 68:42: -> ^( FOR expression commands )
					{
						dbg.location(68,45);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:68:45: ^( FOR expression commands )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(68,47);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						dbg.location(68,51);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(68,62);
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:69:4: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					{
					dbg.location(69,4);
					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:69:4: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:69:5: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
					{
					dbg.location(69,5);
					string_literal64=(Token)match(input,35,FOLLOW_35_in_command538);  
					stream_35.add(string_literal64);
					dbg.location(69,15);
					VARIABLE65=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command540);  
					stream_VARIABLE.add(VARIABLE65);
					dbg.location(69,24);
					string_literal66=(Token)match(input,39,FOLLOW_39_in_command542);  
					stream_39.add(string_literal66);
					dbg.location(69,29);
					pushFollow(FOLLOW_expression_in_command544);
					expression67=expression();
					state._fsp--;

					stream_expression.add(expression67.getTree());dbg.location(69,40);
					string_literal68=(Token)match(input,31,FOLLOW_31_in_command546);  
					stream_31.add(string_literal68);
					dbg.location(69,45);
					pushFollow(FOLLOW_commands_in_command548);
					commands69=commands();
					state._fsp--;

					stream_commands.add(commands69.getTree());dbg.location(69,54);
					string_literal70=(Token)match(input,43,FOLLOW_43_in_command550);  
					stream_43.add(string_literal70);

					}

					// AST REWRITE
					// elements: commands, expression, VARIABLE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 69:60: -> ^( FOREACH VARIABLE expression commands )
					{
						dbg.location(69,63);
						// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:69:63: ^( FOREACH VARIABLE expression commands )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(69,65);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						dbg.location(69,73);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());dbg.location(69,82);
						adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(69,93);
						adaptor.addChild(root_1, stream_commands.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(69, 101);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "command"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:71:1: definition : 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) ;
	public final WhileParser.definition_return definition() throws RecognitionException {
		WhileParser.definition_return retval = new WhileParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal71=null;
		Token char_literal73=null;
		Token char_literal75=null;
		Token string_literal76=null;
		ParserRuleReturnScope input72 =null;
		ParserRuleReturnScope commands74 =null;
		ParserRuleReturnScope output77 =null;

		Object string_literal71_tree=null;
		Object char_literal73_tree=null;
		Object char_literal75_tree=null;
		Object string_literal76_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:71:12: ( 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:72:2: 'read' input '%' commands '%' 'write' output
			{
			dbg.location(72,2);
			string_literal71=(Token)match(input,44,FOLLOW_44_in_definition573);  
			stream_44.add(string_literal71);
			dbg.location(72,9);
			pushFollow(FOLLOW_input_in_definition575);
			input72=input();
			state._fsp--;

			stream_input.add(input72.getTree());dbg.location(72,15);
			char_literal73=(Token)match(input,22,FOLLOW_22_in_definition577);  
			stream_22.add(char_literal73);
			dbg.location(72,19);
			pushFollow(FOLLOW_commands_in_definition579);
			commands74=commands();
			state._fsp--;

			stream_commands.add(commands74.getTree());dbg.location(72,28);
			char_literal75=(Token)match(input,22,FOLLOW_22_in_definition581);  
			stream_22.add(char_literal75);
			dbg.location(72,32);
			string_literal76=(Token)match(input,48,FOLLOW_48_in_definition583);  
			stream_48.add(string_literal76);
			dbg.location(72,40);
			pushFollow(FOLLOW_output_in_definition585);
			output77=output();
			state._fsp--;

			stream_output.add(output77.getTree());
			// AST REWRITE
			// elements: commands, output, input
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 72:47: -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
			{
				dbg.location(72,50);
				// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:72:50: ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(72,52);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				dbg.location(72,63);
				adaptor.addChild(root_1, stream_input.nextTree());dbg.location(72,69);
				// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:72:69: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(72,71);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				dbg.location(72,80);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(72,90);
				// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:72:90: ^( OUTPUT output )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(72,92);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
				dbg.location(72,99);
				adaptor.addChild(root_2, stream_output.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(72, 106);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "definition"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:74:1: function : 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) ;
	public final WhileParser.function_return function() throws RecognitionException {
		WhileParser.function_return retval = new WhileParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal78=null;
		Token SYMBOL79=null;
		Token char_literal80=null;
		ParserRuleReturnScope definition81 =null;

		Object string_literal78_tree=null;
		Object SYMBOL79_tree=null;
		Object char_literal80_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:74:10: ( 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:75:2: 'function' SYMBOL ':' definition
			{
			dbg.location(75,2);
			string_literal78=(Token)match(input,36,FOLLOW_36_in_function615);  
			stream_36.add(string_literal78);
			dbg.location(75,13);
			SYMBOL79=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function617);  
			stream_SYMBOL.add(SYMBOL79);
			dbg.location(75,20);
			char_literal80=(Token)match(input,26,FOLLOW_26_in_function619);  
			stream_26.add(char_literal80);
			dbg.location(75,24);
			pushFollow(FOLLOW_definition_in_function621);
			definition81=definition();
			state._fsp--;

			stream_definition.add(definition81.getTree());
			// AST REWRITE
			// elements: definition, SYMBOL
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 75:35: -> ^( FUNCTION SYMBOL definition )
			{
				dbg.location(75,38);
				// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:75:38: ^( FUNCTION SYMBOL definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(75,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				dbg.location(75,49);
				adaptor.addChild(root_1, stream_SYMBOL.nextNode());dbg.location(75,56);
				adaptor.addChild(root_1, stream_definition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 66);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "function"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:77:1: program : function ( program )? ;
	public final WhileParser.program_return program() throws RecognitionException {
		WhileParser.program_return retval = new WhileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function82 =null;
		ParserRuleReturnScope program83 =null;


		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:77:9: ( function ( program )? )
			dbg.enterAlt(1);

			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:78:2: function ( program )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(78,2);
			pushFollow(FOLLOW_function_in_program641);
			function82=function();
			state._fsp--;

			adaptor.addChild(root_0, function82.getTree());
			dbg.location(78,11);
			// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:78:11: ( program )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==36) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// /home/emeraud/Documents/Cours/Compilateur-while/grammaire/While.g:78:11: program
					{
					dbg.location(78,11);
					pushFollow(FOLLOW_program_in_program643);
					program83=program();
					state._fsp--;

					adaptor.addChild(root_0, program83.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(78, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program"

	// Delegated rules



	public static final BitSet FOLLOW_set_in_exprBase160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_exprBase175 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_exprBase177 = new BitSet(new long[]{0x0000020001920000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase179 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_exprBase181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_exprBase194 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprBase196 = new BitSet(new long[]{0x0000020001920000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase198 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_exprBase200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_exprBase213 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_exprBase215 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase217 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_exprBase219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_exprBase232 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_exprBase234 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase236 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_exprBase238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_exprBase251 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_SYMBOL_in_exprBase253 = new BitSet(new long[]{0x0000020001920000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase255 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_exprBase257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr276 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression289 = new BitSet(new long[]{0x0000000020000002L});
	public static final BitSet FOLLOW_29_in_expression292 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_exprBase_in_expression294 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars316 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_vars319 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_vars_in_vars322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs333 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_exprs336 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_exprs_in_exprs339 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output351 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_output354 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_output_in_output357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_inputSub369 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_inputSub372 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands405 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_commands408 = new BitSet(new long[]{0x0000844C00100000L});
	public static final BitSet FOLLOW_commands_in_commands411 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_command425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command432 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_command434 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_exprs_in_command436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_command453 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_expression_in_command455 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_command457 = new BitSet(new long[]{0x0000844C00100000L});
	public static final BitSet FOLLOW_commands_in_command459 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_32_in_command462 = new BitSet(new long[]{0x0000844C00100000L});
	public static final BitSet FOLLOW_commands_in_command464 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_command488 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_expression_in_command490 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_command492 = new BitSet(new long[]{0x0000844C00100000L});
	public static final BitSet FOLLOW_commands_in_command494 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command496 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_command513 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_expression_in_command515 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_command517 = new BitSet(new long[]{0x0000844C00100000L});
	public static final BitSet FOLLOW_commands_in_command519 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command521 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_command538 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_VARIABLE_in_command540 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_command542 = new BitSet(new long[]{0x0000020000920000L});
	public static final BitSet FOLLOW_expression_in_command544 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_command546 = new BitSet(new long[]{0x0000844C00100000L});
	public static final BitSet FOLLOW_commands_in_command548 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_command550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_definition573 = new BitSet(new long[]{0x0000000000500000L});
	public static final BitSet FOLLOW_input_in_definition575 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_definition577 = new BitSet(new long[]{0x0000844C00100000L});
	public static final BitSet FOLLOW_commands_in_definition579 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_22_in_definition581 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_definition583 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_output_in_definition585 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_function615 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_SYMBOL_in_function617 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_function619 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_definition_in_function621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program641 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_program_in_program643 = new BitSet(new long[]{0x0000000000000002L});
}
