// $ANTLR 3.5.1 /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g 2023-12-21 08:46:36
package tlc.antlr;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class WhileParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "COMMANDS", "CONS", 
		"DEFINITION", "EXPR", "FOR", "FOREACH", "FUNCTION", "HD", "IF", "INPUT", 
		"LIST", "NIL", "OUTPUT", "SYM", "SYMBOL", "TEST", "TL", "VAR", "VARIABLE", 
		"WHILE", "'%'", "'('", "')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", 
		"'do'", "'else'", "'fi'", "'for'", "'foreach'", "'function'", "'hd'", 
		"'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", "'read'", "'then'", 
		"'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
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
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
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
	public static final int NIL=16;
	public static final int OUTPUT=17;
	public static final int SYM=18;
	public static final int SYMBOL=19;
	public static final int TEST=20;
	public static final int TL=21;
	public static final int VAR=22;
	public static final int VARIABLE=23;
	public static final int WHILE=24;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public WhileParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public WhileParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return WhileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g"; }


	    public java.util.List<Exception> exceptions = new java.util.ArrayList<Exception>();
	    
	    @Override    
	    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
	    	exceptions.add(e);
	    }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:56:1: program : function ( program )? ;
	public final WhileParser.program_return program() throws RecognitionException {
		WhileParser.program_return retval = new WhileParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;
		ParserRuleReturnScope program2 =null;


		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:56:9: ( function ( program )? )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:57:2: function ( program )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_function_in_program130);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());

			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:57:11: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==39) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:57:11: program
					{
					pushFollow(FOLLOW_program_in_program132);
					program2=program();
					state._fsp--;

					adaptor.addChild(root_0, program2.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:63:1: exprBase : ( 'nil' -> NIL | VARIABLE -> ^( VAR VARIABLE ) | SYMBOL -> ^( SYM SYMBOL ) | '(' 'cons' lExpr ')' -> ^( CONS lExpr ) | '(' 'list' lExpr ')' -> ^( LIST lExpr ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL lExpr ')' -> ^( SYMBOL lExpr ) );
	public final WhileParser.exprBase_return exprBase() throws RecognitionException {
		WhileParser.exprBase_return retval = new WhileParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal3=null;
		Token VARIABLE4=null;
		Token SYMBOL5=null;
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
		Token string_literal19=null;
		Token char_literal21=null;
		Token char_literal22=null;
		Token SYMBOL23=null;
		Token char_literal25=null;
		ParserRuleReturnScope lExpr8 =null;
		ParserRuleReturnScope lExpr12 =null;
		ParserRuleReturnScope exprBase16 =null;
		ParserRuleReturnScope exprBase20 =null;
		ParserRuleReturnScope lExpr24 =null;

		Object string_literal3_tree=null;
		Object VARIABLE4_tree=null;
		Object SYMBOL5_tree=null;
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
		Object string_literal19_tree=null;
		Object char_literal21_tree=null;
		Object char_literal22_tree=null;
		Object SYMBOL23_tree=null;
		Object char_literal25_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:63:10: ( 'nil' -> NIL | VARIABLE -> ^( VAR VARIABLE ) | SYMBOL -> ^( SYM SYMBOL ) | '(' 'cons' lExpr ')' -> ^( CONS lExpr ) | '(' 'list' lExpr ')' -> ^( LIST lExpr ) | '(' 'hd' exprBase ')' -> ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL lExpr ')' -> ^( SYMBOL lExpr ) )
			int alt2=8;
			switch ( input.LA(1) ) {
			case 44:
				{
				alt2=1;
				}
				break;
			case VARIABLE:
				{
				alt2=2;
				}
				break;
			case SYMBOL:
				{
				alt2=3;
				}
				break;
			case 26:
				{
				switch ( input.LA(2) ) {
				case 33:
					{
					alt2=4;
					}
					break;
				case 43:
					{
					alt2=5;
					}
					break;
				case 40:
					{
					alt2=6;
					}
					break;
				case 49:
					{
					alt2=7;
					}
					break;
				case SYMBOL:
					{
					alt2=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:64:2: 'nil'
					{
					string_literal3=(Token)match(input,44,FOLLOW_44_in_exprBase209);  
					stream_44.add(string_literal3);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 64:8: -> NIL
					{
						adaptor.addChild(root_0, (Object)adaptor.create(NIL, "NIL"));
					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:65:4: VARIABLE
					{
					VARIABLE4=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_exprBase218);  
					stream_VARIABLE.add(VARIABLE4);

					// AST REWRITE
					// elements: VARIABLE
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 65:13: -> ^( VAR VARIABLE )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:65:16: ^( VAR VARIABLE )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VAR, "VAR"), root_1);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:66:4: SYMBOL
					{
					SYMBOL5=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprBase231);  
					stream_SYMBOL.add(SYMBOL5);

					// AST REWRITE
					// elements: SYMBOL
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 66:11: -> ^( SYM SYMBOL )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:66:14: ^( SYM SYMBOL )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SYM, "SYM"), root_1);
						adaptor.addChild(root_1, stream_SYMBOL.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:67:4: '(' 'cons' lExpr ')'
					{
					char_literal6=(Token)match(input,26,FOLLOW_26_in_exprBase244);  
					stream_26.add(char_literal6);

					string_literal7=(Token)match(input,33,FOLLOW_33_in_exprBase246);  
					stream_33.add(string_literal7);

					pushFollow(FOLLOW_lExpr_in_exprBase248);
					lExpr8=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr8.getTree());
					char_literal9=(Token)match(input,27,FOLLOW_27_in_exprBase250);  
					stream_27.add(char_literal9);

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
					// 67:25: -> ^( CONS lExpr )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:67:28: ^( CONS lExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
						adaptor.addChild(root_1, stream_lExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:68:4: '(' 'list' lExpr ')'
					{
					char_literal10=(Token)match(input,26,FOLLOW_26_in_exprBase263);  
					stream_26.add(char_literal10);

					string_literal11=(Token)match(input,43,FOLLOW_43_in_exprBase265);  
					stream_43.add(string_literal11);

					pushFollow(FOLLOW_lExpr_in_exprBase267);
					lExpr12=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr12.getTree());
					char_literal13=(Token)match(input,27,FOLLOW_27_in_exprBase269);  
					stream_27.add(char_literal13);

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
					// 68:25: -> ^( LIST lExpr )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:68:28: ^( LIST lExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
						adaptor.addChild(root_1, stream_lExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:69:4: '(' 'hd' exprBase ')'
					{
					char_literal14=(Token)match(input,26,FOLLOW_26_in_exprBase282);  
					stream_26.add(char_literal14);

					string_literal15=(Token)match(input,40,FOLLOW_40_in_exprBase284);  
					stream_40.add(string_literal15);

					pushFollow(FOLLOW_exprBase_in_exprBase286);
					exprBase16=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase16.getTree());
					char_literal17=(Token)match(input,27,FOLLOW_27_in_exprBase288);  
					stream_27.add(char_literal17);

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
					// 69:26: -> ^( HD exprBase )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:69:29: ^( HD exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 7 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:70:4: '(' 'tl' exprBase ')'
					{
					char_literal18=(Token)match(input,26,FOLLOW_26_in_exprBase301);  
					stream_26.add(char_literal18);

					string_literal19=(Token)match(input,49,FOLLOW_49_in_exprBase303);  
					stream_49.add(string_literal19);

					pushFollow(FOLLOW_exprBase_in_exprBase305);
					exprBase20=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase20.getTree());
					char_literal21=(Token)match(input,27,FOLLOW_27_in_exprBase307);  
					stream_27.add(char_literal21);

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
					// 70:26: -> ^( TL exprBase )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:70:29: ^( TL exprBase )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
						adaptor.addChild(root_1, stream_exprBase.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 8 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:71:4: '(' SYMBOL lExpr ')'
					{
					char_literal22=(Token)match(input,26,FOLLOW_26_in_exprBase320);  
					stream_26.add(char_literal22);

					SYMBOL23=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_exprBase322);  
					stream_SYMBOL.add(SYMBOL23);

					pushFollow(FOLLOW_lExpr_in_exprBase324);
					lExpr24=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr24.getTree());
					char_literal25=(Token)match(input,27,FOLLOW_27_in_exprBase326);  
					stream_27.add(char_literal25);

					// AST REWRITE
					// elements: SYMBOL, lExpr
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 71:25: -> ^( SYMBOL lExpr )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:71:28: ^( SYMBOL lExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot(stream_SYMBOL.nextNode(), root_1);
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

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:73:1: lExpr : ( exprBase lExpr )? ;
	public final WhileParser.lExpr_return lExpr() throws RecognitionException {
		WhileParser.lExpr_return retval = new WhileParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope exprBase26 =null;
		ParserRuleReturnScope lExpr27 =null;


		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:73:7: ( ( exprBase lExpr )? )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:74:2: ( exprBase lExpr )?
			{
			root_0 = (Object)adaptor.nil();


			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:74:2: ( exprBase lExpr )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==SYMBOL||LA3_0==VARIABLE||LA3_0==26||LA3_0==44) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:74:3: exprBase lExpr
					{
					pushFollow(FOLLOW_exprBase_in_lExpr345);
					exprBase26=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase26.getTree());

					pushFollow(FOLLOW_lExpr_in_lExpr347);
					lExpr27=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr27.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:76:1: expression : exprBase ( '=?' exprBase )? -> ^( EXPR exprBase ( exprBase )? ) ;
	public final WhileParser.expression_return expression() throws RecognitionException {
		WhileParser.expression_return retval = new WhileParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal29=null;
		ParserRuleReturnScope exprBase28 =null;
		ParserRuleReturnScope exprBase30 =null;

		Object string_literal29_tree=null;
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:76:12: ( exprBase ( '=?' exprBase )? -> ^( EXPR exprBase ( exprBase )? ) )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:77:2: exprBase ( '=?' exprBase )?
			{
			pushFollow(FOLLOW_exprBase_in_expression358);
			exprBase28=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase28.getTree());
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:77:11: ( '=?' exprBase )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==32) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:77:12: '=?' exprBase
					{
					string_literal29=(Token)match(input,32,FOLLOW_32_in_expression361);  
					stream_32.add(string_literal29);

					pushFollow(FOLLOW_exprBase_in_expression363);
					exprBase30=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase30.getTree());
					}
					break;

			}

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
			// 77:28: -> ^( EXPR exprBase ( exprBase )? )
			{
				// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:77:31: ^( EXPR exprBase ( exprBase )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_exprBase.nextTree());
				// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:77:47: ( exprBase )?
				if ( stream_exprBase.hasNext() ) {
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

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:79:1: vars : VARIABLE ( ',' ! vars )? ;
	public final WhileParser.vars_return vars() throws RecognitionException {
		WhileParser.vars_return retval = new WhileParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE31=null;
		Token char_literal32=null;
		ParserRuleReturnScope vars33 =null;

		Object VARIABLE31_tree=null;
		Object char_literal32_tree=null;

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:79:6: ( VARIABLE ( ',' ! vars )? )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:80:2: VARIABLE ( ',' ! vars )?
			{
			root_0 = (Object)adaptor.nil();


			VARIABLE31=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_vars385); 
			VARIABLE31_tree = (Object)adaptor.create(VARIABLE31);
			adaptor.addChild(root_0, VARIABLE31_tree);

			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:80:11: ( ',' ! vars )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==28) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:80:12: ',' ! vars
					{
					char_literal32=(Token)match(input,28,FOLLOW_28_in_vars388); 
					pushFollow(FOLLOW_vars_in_vars391);
					vars33=vars();
					state._fsp--;

					adaptor.addChild(root_0, vars33.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:82:1: exprs : expression ( ',' ! exprs )? ;
	public final WhileParser.exprs_return exprs() throws RecognitionException {
		WhileParser.exprs_return retval = new WhileParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal35=null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope exprs36 =null;

		Object char_literal35_tree=null;

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:82:7: ( expression ( ',' ! exprs )? )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:83:2: expression ( ',' ! exprs )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_exprs402);
			expression34=expression();
			state._fsp--;

			adaptor.addChild(root_0, expression34.getTree());

			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:83:13: ( ',' ! exprs )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==28) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:83:14: ',' ! exprs
					{
					char_literal35=(Token)match(input,28,FOLLOW_28_in_exprs405); 
					pushFollow(FOLLOW_exprs_in_exprs408);
					exprs36=exprs();
					state._fsp--;

					adaptor.addChild(root_0, exprs36.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:85:1: output : VARIABLE ( ',' ! output )? ;
	public final WhileParser.output_return output() throws RecognitionException {
		WhileParser.output_return retval = new WhileParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE37=null;
		Token char_literal38=null;
		ParserRuleReturnScope output39 =null;

		Object VARIABLE37_tree=null;
		Object char_literal38_tree=null;

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:85:8: ( VARIABLE ( ',' ! output )? )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:86:2: VARIABLE ( ',' ! output )?
			{
			root_0 = (Object)adaptor.nil();


			VARIABLE37=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_output420); 
			VARIABLE37_tree = (Object)adaptor.create(VARIABLE37);
			adaptor.addChild(root_0, VARIABLE37_tree);

			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:86:11: ( ',' ! output )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==28) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:86:12: ',' ! output
					{
					char_literal38=(Token)match(input,28,FOLLOW_28_in_output423); 
					pushFollow(FOLLOW_output_in_output426);
					output39=output();
					state._fsp--;

					adaptor.addChild(root_0, output39.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:88:1: inputSub : VARIABLE ( ',' ! inputSub )? ;
	public final WhileParser.inputSub_return inputSub() throws RecognitionException {
		WhileParser.inputSub_return retval = new WhileParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE40=null;
		Token char_literal41=null;
		ParserRuleReturnScope inputSub42 =null;

		Object VARIABLE40_tree=null;
		Object char_literal41_tree=null;

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:88:10: ( VARIABLE ( ',' ! inputSub )? )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:89:2: VARIABLE ( ',' ! inputSub )?
			{
			root_0 = (Object)adaptor.nil();


			VARIABLE40=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_inputSub438); 
			VARIABLE40_tree = (Object)adaptor.create(VARIABLE40);
			adaptor.addChild(root_0, VARIABLE40_tree);

			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:89:11: ( ',' ! inputSub )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==28) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:89:12: ',' ! inputSub
					{
					char_literal41=(Token)match(input,28,FOLLOW_28_in_inputSub441); 
					pushFollow(FOLLOW_inputSub_in_inputSub444);
					inputSub42=inputSub();
					state._fsp--;

					adaptor.addChild(root_0, inputSub42.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:91:1: input : ( inputSub )? -> ^( INPUT ( inputSub )? ) ;
	public final WhileParser.input_return input() throws RecognitionException {
		WhileParser.input_return retval = new WhileParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub43 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:91:7: ( ( inputSub )? -> ^( INPUT ( inputSub )? ) )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:92:2: ( inputSub )?
			{
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:92:2: ( inputSub )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==VARIABLE) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:92:2: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input455);
					inputSub43=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub43.getTree());
					}
					break;

			}

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
			// 92:12: -> ^( INPUT ( inputSub )? )
			{
				// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:92:15: ^( INPUT ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUT, "INPUT"), root_1);
				// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:92:23: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
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

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:94:1: commands : command ( ';' ! commands )? ;
	public final WhileParser.commands_return commands() throws RecognitionException {
		WhileParser.commands_return retval = new WhileParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal45=null;
		ParserRuleReturnScope command44 =null;
		ParserRuleReturnScope commands46 =null;

		Object char_literal45_tree=null;

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:94:10: ( command ( ';' ! commands )? )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:95:2: command ( ';' ! commands )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_command_in_commands474);
			command44=command();
			state._fsp--;

			adaptor.addChild(root_0, command44.getTree());

			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:95:10: ( ';' ! commands )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==31) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:95:11: ';' ! commands
					{
					char_literal45=(Token)match(input,31,FOLLOW_31_in_commands477); 
					pushFollow(FOLLOW_commands_in_commands480);
					commands46=commands();
					state._fsp--;

					adaptor.addChild(root_0, commands46.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:97:1: command : ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF expression ^( COMMANDS commands ) ( ^( COMMANDS commands ) )? ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE expression ^( COMMANDS commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR expression ^( COMMANDS commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE expression ^( COMMANDS commands ) ) );
	public final WhileParser.command_return command() throws RecognitionException {
		WhileParser.command_return retval = new WhileParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal47=null;
		Token string_literal49=null;
		Token string_literal51=null;
		Token string_literal53=null;
		Token string_literal55=null;
		Token string_literal57=null;
		Token string_literal58=null;
		Token string_literal60=null;
		Token string_literal62=null;
		Token string_literal63=null;
		Token string_literal65=null;
		Token string_literal67=null;
		Token string_literal68=null;
		Token VARIABLE69=null;
		Token string_literal70=null;
		Token string_literal72=null;
		Token string_literal74=null;
		ParserRuleReturnScope vars48 =null;
		ParserRuleReturnScope exprs50 =null;
		ParserRuleReturnScope expression52 =null;
		ParserRuleReturnScope commands54 =null;
		ParserRuleReturnScope commands56 =null;
		ParserRuleReturnScope expression59 =null;
		ParserRuleReturnScope commands61 =null;
		ParserRuleReturnScope expression64 =null;
		ParserRuleReturnScope commands66 =null;
		ParserRuleReturnScope expression71 =null;
		ParserRuleReturnScope commands73 =null;

		Object string_literal47_tree=null;
		Object string_literal49_tree=null;
		Object string_literal51_tree=null;
		Object string_literal53_tree=null;
		Object string_literal55_tree=null;
		Object string_literal57_tree=null;
		Object string_literal58_tree=null;
		Object string_literal60_tree=null;
		Object string_literal62_tree=null;
		Object string_literal63_tree=null;
		Object string_literal65_tree=null;
		Object string_literal67_tree=null;
		Object string_literal68_tree=null;
		Object VARIABLE69_tree=null;
		Object string_literal70_tree=null;
		Object string_literal72_tree=null;
		Object string_literal74_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_VARIABLE=new RewriteRuleTokenStream(adaptor,"token VARIABLE");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:97:9: ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF expression ^( COMMANDS commands ) ( ^( COMMANDS commands ) )? ) | ( 'while' expression 'do' commands 'od' ) -> ^( WHILE expression ^( COMMANDS commands ) ) | ( 'for' expression 'do' commands 'od' ) -> ^( FOR expression ^( COMMANDS commands ) ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH VARIABLE expression ^( COMMANDS commands ) ) )
			int alt12=6;
			switch ( input.LA(1) ) {
			case 45:
				{
				alt12=1;
				}
				break;
			case VARIABLE:
				{
				alt12=2;
				}
				break;
			case 41:
				{
				alt12=3;
				}
				break;
			case 50:
				{
				alt12=4;
				}
				break;
			case 37:
				{
				alt12=5;
				}
				break;
			case 38:
				{
				alt12=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}
			switch (alt12) {
				case 1 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:98:2: ( 'nop' )
					{
					root_0 = (Object)adaptor.nil();


					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:98:2: ( 'nop' )
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:98:3: 'nop'
					{
					string_literal47=(Token)match(input,45,FOLLOW_45_in_command494); 
					string_literal47_tree = (Object)adaptor.create(string_literal47);
					adaptor.addChild(root_0, string_literal47_tree);

					}

					}
					break;
				case 2 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:99:4: ( vars ':=' exprs )
					{
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:99:4: ( vars ':=' exprs )
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:99:5: vars ':=' exprs
					{
					pushFollow(FOLLOW_vars_in_command501);
					vars48=vars();
					state._fsp--;

					stream_vars.add(vars48.getTree());
					string_literal49=(Token)match(input,30,FOLLOW_30_in_command503);  
					stream_30.add(string_literal49);

					pushFollow(FOLLOW_exprs_in_command505);
					exprs50=exprs();
					state._fsp--;

					stream_exprs.add(exprs50.getTree());
					}

					// AST REWRITE
					// elements: vars, exprs
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 99:22: -> ^( ASSIGN vars exprs )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:99:25: ^( ASSIGN vars exprs )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGN, "ASSIGN"), root_1);
						adaptor.addChild(root_1, stream_vars.nextTree());
						adaptor.addChild(root_1, stream_exprs.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:100:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
					{
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:100:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:100:5: 'if' expression 'then' commands ( 'else' commands )? 'fi'
					{
					string_literal51=(Token)match(input,41,FOLLOW_41_in_command522);  
					stream_41.add(string_literal51);

					pushFollow(FOLLOW_expression_in_command524);
					expression52=expression();
					state._fsp--;

					stream_expression.add(expression52.getTree());
					string_literal53=(Token)match(input,48,FOLLOW_48_in_command526);  
					stream_48.add(string_literal53);

					pushFollow(FOLLOW_commands_in_command528);
					commands54=commands();
					state._fsp--;

					stream_commands.add(commands54.getTree());
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:100:37: ( 'else' commands )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==35) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:100:38: 'else' commands
							{
							string_literal55=(Token)match(input,35,FOLLOW_35_in_command531);  
							stream_35.add(string_literal55);

							pushFollow(FOLLOW_commands_in_command533);
							commands56=commands();
							state._fsp--;

							stream_commands.add(commands56.getTree());
							}
							break;

					}

					string_literal57=(Token)match(input,36,FOLLOW_36_in_command537);  
					stream_36.add(string_literal57);

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
					// 100:62: -> ^( IF expression ^( COMMANDS commands ) ( ^( COMMANDS commands ) )? )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:100:65: ^( IF expression ^( COMMANDS commands ) ( ^( COMMANDS commands ) )? )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:100:81: ^( COMMANDS commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:100:102: ( ^( COMMANDS commands ) )?
						if ( stream_commands.hasNext() ) {
							// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:100:102: ^( COMMANDS commands )
							{
							Object root_2 = (Object)adaptor.nil();
							root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
							adaptor.addChild(root_2, stream_commands.nextTree());
							adaptor.addChild(root_1, root_2);
							}

						}
						stream_commands.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:101:4: ( 'while' expression 'do' commands 'od' )
					{
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:101:4: ( 'while' expression 'do' commands 'od' )
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:101:5: 'while' expression 'do' commands 'od'
					{
					string_literal58=(Token)match(input,50,FOLLOW_50_in_command565);  
					stream_50.add(string_literal58);

					pushFollow(FOLLOW_expression_in_command567);
					expression59=expression();
					state._fsp--;

					stream_expression.add(expression59.getTree());
					string_literal60=(Token)match(input,34,FOLLOW_34_in_command569);  
					stream_34.add(string_literal60);

					pushFollow(FOLLOW_commands_in_command571);
					commands61=commands();
					state._fsp--;

					stream_commands.add(commands61.getTree());
					string_literal62=(Token)match(input,46,FOLLOW_46_in_command573);  
					stream_46.add(string_literal62);

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
					// 101:44: -> ^( WHILE expression ^( COMMANDS commands ) )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:101:47: ^( WHILE expression ^( COMMANDS commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:101:66: ^( COMMANDS commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 5 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:102:4: ( 'for' expression 'do' commands 'od' )
					{
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:102:4: ( 'for' expression 'do' commands 'od' )
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:102:5: 'for' expression 'do' commands 'od'
					{
					string_literal63=(Token)match(input,37,FOLLOW_37_in_command594);  
					stream_37.add(string_literal63);

					pushFollow(FOLLOW_expression_in_command596);
					expression64=expression();
					state._fsp--;

					stream_expression.add(expression64.getTree());
					string_literal65=(Token)match(input,34,FOLLOW_34_in_command598);  
					stream_34.add(string_literal65);

					pushFollow(FOLLOW_commands_in_command600);
					commands66=commands();
					state._fsp--;

					stream_commands.add(commands66.getTree());
					string_literal67=(Token)match(input,46,FOLLOW_46_in_command602);  
					stream_46.add(string_literal67);

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
					// 102:42: -> ^( FOR expression ^( COMMANDS commands ) )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:102:45: ^( FOR expression ^( COMMANDS commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:102:62: ^( COMMANDS commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 6 :
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:103:4: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					{
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:103:4: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:103:5: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
					{
					string_literal68=(Token)match(input,38,FOLLOW_38_in_command623);  
					stream_38.add(string_literal68);

					VARIABLE69=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_command625);  
					stream_VARIABLE.add(VARIABLE69);

					string_literal70=(Token)match(input,42,FOLLOW_42_in_command627);  
					stream_42.add(string_literal70);

					pushFollow(FOLLOW_expression_in_command629);
					expression71=expression();
					state._fsp--;

					stream_expression.add(expression71.getTree());
					string_literal72=(Token)match(input,34,FOLLOW_34_in_command631);  
					stream_34.add(string_literal72);

					pushFollow(FOLLOW_commands_in_command633);
					commands73=commands();
					state._fsp--;

					stream_commands.add(commands73.getTree());
					string_literal74=(Token)match(input,46,FOLLOW_46_in_command635);  
					stream_46.add(string_literal74);

					}

					// AST REWRITE
					// elements: VARIABLE, commands, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (Object)adaptor.nil();
					// 103:60: -> ^( FOREACH VARIABLE expression ^( COMMANDS commands ) )
					{
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:103:63: ^( FOREACH VARIABLE expression ^( COMMANDS commands ) )
						{
						Object root_1 = (Object)adaptor.nil();
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
						adaptor.addChild(root_1, stream_VARIABLE.nextNode());
						adaptor.addChild(root_1, stream_expression.nextTree());
						// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:103:93: ^( COMMANDS commands )
						{
						Object root_2 = (Object)adaptor.nil();
						root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
						adaptor.addChild(root_2, stream_commands.nextTree());
						adaptor.addChild(root_1, root_2);
						}

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

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:105:1: definition : 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) ;
	public final WhileParser.definition_return definition() throws RecognitionException {
		WhileParser.definition_return retval = new WhileParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal75=null;
		Token char_literal77=null;
		Token char_literal79=null;
		Token string_literal80=null;
		ParserRuleReturnScope input76 =null;
		ParserRuleReturnScope commands78 =null;
		ParserRuleReturnScope output81 =null;

		Object string_literal75_tree=null;
		Object char_literal77_tree=null;
		Object char_literal79_tree=null;
		Object string_literal80_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:105:12: ( 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) ) )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:106:2: 'read' input '%' commands '%' 'write' output
			{
			string_literal75=(Token)match(input,47,FOLLOW_47_in_definition662);  
			stream_47.add(string_literal75);

			pushFollow(FOLLOW_input_in_definition664);
			input76=input();
			state._fsp--;

			stream_input.add(input76.getTree());
			char_literal77=(Token)match(input,25,FOLLOW_25_in_definition666);  
			stream_25.add(char_literal77);

			pushFollow(FOLLOW_commands_in_definition668);
			commands78=commands();
			state._fsp--;

			stream_commands.add(commands78.getTree());
			char_literal79=(Token)match(input,25,FOLLOW_25_in_definition670);  
			stream_25.add(char_literal79);

			string_literal80=(Token)match(input,51,FOLLOW_51_in_definition672);  
			stream_51.add(string_literal80);

			pushFollow(FOLLOW_output_in_definition674);
			output81=output();
			state._fsp--;

			stream_output.add(output81.getTree());
			// AST REWRITE
			// elements: input, output, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 106:47: -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
			{
				// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:106:50: ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFINITION, "DEFINITION"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:106:69: ^( COMMANDS commands )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMANDS, "COMMANDS"), root_2);
				adaptor.addChild(root_2, stream_commands.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:106:90: ^( OUTPUT output )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_2);
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

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
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
	// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:108:1: function : 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) ;
	public final WhileParser.function_return function() throws RecognitionException {
		WhileParser.function_return retval = new WhileParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal82=null;
		Token SYMBOL83=null;
		Token char_literal84=null;
		ParserRuleReturnScope definition85 =null;

		Object string_literal82_tree=null;
		Object SYMBOL83_tree=null;
		Object char_literal84_tree=null;
		RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:108:10: ( 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) )
			// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:109:2: 'function' SYMBOL ':' definition
			{
			string_literal82=(Token)match(input,39,FOLLOW_39_in_function704);  
			stream_39.add(string_literal82);

			SYMBOL83=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_function706);  
			stream_SYMBOL.add(SYMBOL83);

			char_literal84=(Token)match(input,29,FOLLOW_29_in_function708);  
			stream_29.add(char_literal84);

			pushFollow(FOLLOW_definition_in_function710);
			definition85=definition();
			state._fsp--;

			stream_definition.add(definition85.getTree());
			// AST REWRITE
			// elements: SYMBOL, definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 109:35: -> ^( FUNCTION SYMBOL definition )
			{
				// /home/pandadorable/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:109:38: ^( FUNCTION SYMBOL definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_SYMBOL.nextNode());
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

		    catch (Exception e)
		    {
		        exceptions.add(e);
		    }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program130 = new BitSet(new long[]{0x0000008000000002L});
	public static final BitSet FOLLOW_program_in_program132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_exprBase209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_exprBase218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYMBOL_in_exprBase231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase244 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_exprBase246 = new BitSet(new long[]{0x000010000C880000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase248 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase263 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_exprBase265 = new BitSet(new long[]{0x000010000C880000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase267 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase282 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_exprBase284 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase286 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase301 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_exprBase303 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase305 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_exprBase320 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_SYMBOL_in_exprBase322 = new BitSet(new long[]{0x000010000C880000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase324 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr345 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr347 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression358 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_32_in_expression361 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_exprBase_in_expression363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars385 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_vars388 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_vars_in_vars391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs402 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_exprs405 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_exprs_in_exprs408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output420 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_output423 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_output_in_output426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_inputSub438 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_inputSub441 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands474 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_31_in_commands477 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_commands480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_command494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command501 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_command503 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_exprs_in_command505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_command522 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_expression_in_command524 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_48_in_command526 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command528 = new BitSet(new long[]{0x0000001800000000L});
	public static final BitSet FOLLOW_35_in_command531 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command533 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_command537 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_command565 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_expression_in_command567 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command569 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command571 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command573 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_command594 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_expression_in_command596 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command598 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command600 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_command623 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_VARIABLE_in_command625 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_command627 = new BitSet(new long[]{0x0000100004880000L});
	public static final BitSet FOLLOW_expression_in_command629 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_command631 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_command633 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_46_in_command635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_definition662 = new BitSet(new long[]{0x0000000002800000L});
	public static final BitSet FOLLOW_input_in_definition664 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_definition666 = new BitSet(new long[]{0x0004226000800000L});
	public static final BitSet FOLLOW_commands_in_definition668 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_definition670 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_definition672 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_output_in_definition674 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_function704 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_SYMBOL_in_function706 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_function708 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_definition_in_function710 = new BitSet(new long[]{0x0000000000000002L});
}
