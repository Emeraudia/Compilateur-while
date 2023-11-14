// $ANTLR 3.5.1 /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g 2023-11-14 16:52:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class WhileParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "SYMBOL", "VARIABLE", "'%'", "'('", 
		"')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'", 
		"'fi'", "'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'", 
		"'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
	};
	public static final int EOF=-1;
	public static final int T__6=6;
	public static final int T__7=7;
	public static final int T__8=8;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
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
	public static final int SYMBOL=4;
	public static final int VARIABLE=5;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "exprBase", "exprs", "program", "input", "vars", "definition", 
		"function", "command", "lExpr", "output", "commands", "inputSub", "expression"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false
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
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public WhileParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return WhileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g"; }



	// $ANTLR start "exprBase"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:7:1: exprBase : ( ( 'nil' | VARIABLE | SYMBOL ) | ( ( '(' 'cons' lExpr ')' ) | ( '(' 'list' lExpr ')' ) ) | ( ( '(' 'hd' exprBase ')' ) | ( '(' 'tl' exprBase ')' ) ) | ( '(' SYMBOL lExpr ')' ) );
	public final void exprBase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(7, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:7:10: ( ( 'nil' | VARIABLE | SYMBOL ) | ( ( '(' 'cons' lExpr ')' ) | ( '(' 'list' lExpr ')' ) ) | ( ( '(' 'hd' exprBase ')' ) | ( '(' 'tl' exprBase ')' ) ) | ( '(' SYMBOL lExpr ')' ) )
			int alt3=4;
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( ((LA3_0 >= SYMBOL && LA3_0 <= VARIABLE)||LA3_0==25) ) {
				alt3=1;
			}
			else if ( (LA3_0==7) ) {
				switch ( input.LA(2) ) {
				case 14:
				case 24:
					{
					alt3=2;
					}
					break;
				case 21:
				case 30:
					{
					alt3=3;
					}
					break;
				case SYMBOL:
					{
					alt3=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:8:2: ( 'nil' | VARIABLE | SYMBOL )
					{
					dbg.location(8,2);
					if ( (input.LA(1) >= SYMBOL && input.LA(1) <= VARIABLE)||input.LA(1)==25 ) {
						input.consume();
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

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:4: ( ( '(' 'cons' lExpr ')' ) | ( '(' 'list' lExpr ')' ) )
					{
					dbg.location(9,4);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:4: ( ( '(' 'cons' lExpr ')' ) | ( '(' 'list' lExpr ')' ) )
					int alt1=2;
					try { dbg.enterSubRule(1);
					try { dbg.enterDecision(1, decisionCanBacktrack[1]);

					int LA1_0 = input.LA(1);
					if ( (LA1_0==7) ) {
						int LA1_1 = input.LA(2);
						if ( (LA1_1==14) ) {
							alt1=1;
						}
						else if ( (LA1_1==24) ) {
							alt1=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 1, 1, input);
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

							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:6: ( '(' 'cons' lExpr ')' )
							{
							dbg.location(9,6);
							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:6: ( '(' 'cons' lExpr ')' )
							dbg.enterAlt(1);

							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:7: '(' 'cons' lExpr ')'
							{
							dbg.location(9,7);
							match(input,7,FOLLOW_7_in_exprBase96); dbg.location(9,11);
							match(input,14,FOLLOW_14_in_exprBase98); dbg.location(9,18);
							pushFollow(FOLLOW_lExpr_in_exprBase100);
							lExpr();
							state._fsp--;
							dbg.location(9,24);
							match(input,8,FOLLOW_8_in_exprBase102); 
							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:31: ( '(' 'list' lExpr ')' )
							{
							dbg.location(9,31);
							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:31: ( '(' 'list' lExpr ')' )
							dbg.enterAlt(1);

							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:32: '(' 'list' lExpr ')'
							{
							dbg.location(9,32);
							match(input,7,FOLLOW_7_in_exprBase108); dbg.location(9,36);
							match(input,24,FOLLOW_24_in_exprBase110); dbg.location(9,43);
							pushFollow(FOLLOW_lExpr_in_exprBase112);
							lExpr();
							state._fsp--;
							dbg.location(9,49);
							match(input,8,FOLLOW_8_in_exprBase114); 
							}

							}
							break;

					}
					} finally {dbg.exitSubRule(1);}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:4: ( ( '(' 'hd' exprBase ')' ) | ( '(' 'tl' exprBase ')' ) )
					{
					dbg.location(10,4);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:4: ( ( '(' 'hd' exprBase ')' ) | ( '(' 'tl' exprBase ')' ) )
					int alt2=2;
					try { dbg.enterSubRule(2);
					try { dbg.enterDecision(2, decisionCanBacktrack[2]);

					int LA2_0 = input.LA(1);
					if ( (LA2_0==7) ) {
						int LA2_1 = input.LA(2);
						if ( (LA2_1==21) ) {
							alt2=1;
						}
						else if ( (LA2_1==30) ) {
							alt2=2;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 2, 1, input);
								dbg.recognitionException(nvae);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(2);}

					switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:6: ( '(' 'hd' exprBase ')' )
							{
							dbg.location(10,6);
							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:6: ( '(' 'hd' exprBase ')' )
							dbg.enterAlt(1);

							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:7: '(' 'hd' exprBase ')'
							{
							dbg.location(10,7);
							match(input,7,FOLLOW_7_in_exprBase124); dbg.location(10,11);
							match(input,21,FOLLOW_21_in_exprBase126); dbg.location(10,16);
							pushFollow(FOLLOW_exprBase_in_exprBase128);
							exprBase();
							state._fsp--;
							dbg.location(10,25);
							match(input,8,FOLLOW_8_in_exprBase130); 
							}

							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:32: ( '(' 'tl' exprBase ')' )
							{
							dbg.location(10,32);
							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:32: ( '(' 'tl' exprBase ')' )
							dbg.enterAlt(1);

							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:33: '(' 'tl' exprBase ')'
							{
							dbg.location(10,33);
							match(input,7,FOLLOW_7_in_exprBase136); dbg.location(10,37);
							match(input,30,FOLLOW_30_in_exprBase138); dbg.location(10,42);
							pushFollow(FOLLOW_exprBase_in_exprBase140);
							exprBase();
							state._fsp--;
							dbg.location(10,51);
							match(input,8,FOLLOW_8_in_exprBase142); 
							}

							}
							break;

					}
					} finally {dbg.exitSubRule(2);}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:11:4: ( '(' SYMBOL lExpr ')' )
					{
					dbg.location(11,4);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:11:4: ( '(' SYMBOL lExpr ')' )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:11:6: '(' SYMBOL lExpr ')'
					{
					dbg.location(11,6);
					match(input,7,FOLLOW_7_in_exprBase151); dbg.location(11,10);
					match(input,SYMBOL,FOLLOW_SYMBOL_in_exprBase153); dbg.location(11,17);
					pushFollow(FOLLOW_lExpr_in_exprBase155);
					lExpr();
					state._fsp--;
					dbg.location(11,23);
					match(input,8,FOLLOW_8_in_exprBase157); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(11, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprBase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprBase"



	// $ANTLR start "lExpr"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:13:1: lExpr : ( exprBase lExpr )? ;
	public final void lExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(13, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:13:7: ( ( exprBase lExpr )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:14:2: ( exprBase lExpr )?
			{
			dbg.location(14,2);
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:14:2: ( exprBase lExpr )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( ((LA4_0 >= SYMBOL && LA4_0 <= VARIABLE)||LA4_0==7||LA4_0==25) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:14:3: exprBase lExpr
					{
					dbg.location(14,3);
					pushFollow(FOLLOW_exprBase_in_lExpr169);
					exprBase();
					state._fsp--;
					dbg.location(14,12);
					pushFollow(FOLLOW_lExpr_in_lExpr171);
					lExpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(14, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lExpr"



	// $ANTLR start "expression"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:16:1: expression : exprBase ( '=?' exprBase )? ;
	public final void expression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:16:12: ( exprBase ( '=?' exprBase )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:17:2: exprBase ( '=?' exprBase )?
			{
			dbg.location(17,2);
			pushFollow(FOLLOW_exprBase_in_expression182);
			exprBase();
			state._fsp--;
			dbg.location(17,11);
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:17:11: ( '=?' exprBase )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==13) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:17:12: '=?' exprBase
					{
					dbg.location(17,12);
					match(input,13,FOLLOW_13_in_expression185); dbg.location(17,17);
					pushFollow(FOLLOW_exprBase_in_expression187);
					exprBase();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "vars"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:19:1: vars : VARIABLE ( ',' vars )? ;
	public final void vars() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:19:6: ( VARIABLE ( ',' vars )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:20:2: VARIABLE ( ',' vars )?
			{
			dbg.location(20,2);
			match(input,VARIABLE,FOLLOW_VARIABLE_in_vars198); dbg.location(20,11);
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:20:11: ( ',' vars )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==9) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:20:12: ',' vars
					{
					dbg.location(20,12);
					match(input,9,FOLLOW_9_in_vars201); dbg.location(20,16);
					pushFollow(FOLLOW_vars_in_vars203);
					vars();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(6);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 21);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "vars"



	// $ANTLR start "exprs"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:22:1: exprs : expression ( ',' exprs )? ;
	public final void exprs() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:22:7: ( expression ( ',' exprs )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:23:2: expression ( ',' exprs )?
			{
			dbg.location(23,2);
			pushFollow(FOLLOW_expression_in_exprs214);
			expression();
			state._fsp--;
			dbg.location(23,13);
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:23:13: ( ',' exprs )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==9) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:23:14: ',' exprs
					{
					dbg.location(23,14);
					match(input,9,FOLLOW_9_in_exprs217); dbg.location(23,18);
					pushFollow(FOLLOW_exprs_in_exprs219);
					exprs();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(23, 24);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprs"



	// $ANTLR start "output"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:25:1: output : VARIABLE ( ',' output )? ;
	public final void output() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(25, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:25:8: ( VARIABLE ( ',' output )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:26:2: VARIABLE ( ',' output )?
			{
			dbg.location(26,2);
			match(input,VARIABLE,FOLLOW_VARIABLE_in_output231); dbg.location(26,11);
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:26:11: ( ',' output )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==9) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:26:12: ',' output
					{
					dbg.location(26,12);
					match(input,9,FOLLOW_9_in_output234); dbg.location(26,16);
					pushFollow(FOLLOW_output_in_output236);
					output();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(26, 23);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "output");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "output"



	// $ANTLR start "inputSub"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:28:1: inputSub : VARIABLE ( ',' inputSub )? ;
	public final void inputSub() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:28:10: ( VARIABLE ( ',' inputSub )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:29:2: VARIABLE ( ',' inputSub )?
			{
			dbg.location(29,2);
			match(input,VARIABLE,FOLLOW_VARIABLE_in_inputSub248); dbg.location(29,11);
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:29:11: ( ',' inputSub )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==9) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:29:12: ',' inputSub
					{
					dbg.location(29,12);
					match(input,9,FOLLOW_9_in_inputSub251); dbg.location(29,16);
					pushFollow(FOLLOW_inputSub_in_inputSub253);
					inputSub();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 25);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inputSub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "inputSub"



	// $ANTLR start "input"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:31:1: input : ( inputSub )? ;
	public final void input() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:31:7: ( ( inputSub )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:32:2: ( inputSub )?
			{
			dbg.location(32,2);
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:32:2: ( inputSub )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==VARIABLE) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:32:2: inputSub
					{
					dbg.location(32,2);
					pushFollow(FOLLOW_inputSub_in_input264);
					inputSub();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(32, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "input"



	// $ANTLR start "commands"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:34:1: commands : command ( ';' commands )? ;
	public final void commands() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:34:10: ( command ( ';' commands )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:35:2: command ( ';' commands )?
			{
			dbg.location(35,2);
			pushFollow(FOLLOW_command_in_commands274);
			command();
			state._fsp--;
			dbg.location(35,10);
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:35:10: ( ';' commands )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==12) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:35:11: ';' commands
					{
					dbg.location(35,11);
					match(input,12,FOLLOW_12_in_commands277); dbg.location(35,15);
					pushFollow(FOLLOW_commands_in_commands279);
					commands();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(35, 25);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "commands"



	// $ANTLR start "command"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:37:1: command : ( ( 'nop' ) | ( vars ':=' exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) | ( 'while' expression 'do' commands 'od' ) | ( 'for' expression 'do' commands 'od' ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) );
	public final void command() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:37:9: ( ( 'nop' ) | ( vars ':=' exprs ) | ( 'if' expression 'then' commands ( 'else' commands )? 'fi' ) | ( 'while' expression 'do' commands 'od' ) | ( 'for' expression 'do' commands 'od' ) | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) )
			int alt13=6;
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			switch ( input.LA(1) ) {
			case 26:
				{
				alt13=1;
				}
				break;
			case VARIABLE:
				{
				alt13=2;
				}
				break;
			case 22:
				{
				alt13=3;
				}
				break;
			case 31:
				{
				alt13=4;
				}
				break;
			case 18:
				{
				alt13=5;
				}
				break;
			case 19:
				{
				alt13=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:38:2: ( 'nop' )
					{
					dbg.location(38,2);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:38:2: ( 'nop' )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:38:3: 'nop'
					{
					dbg.location(38,3);
					match(input,26,FOLLOW_26_in_command293); 
					}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:39:4: ( vars ':=' exprs )
					{
					dbg.location(39,4);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:39:4: ( vars ':=' exprs )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:39:5: vars ':=' exprs
					{
					dbg.location(39,5);
					pushFollow(FOLLOW_vars_in_command300);
					vars();
					state._fsp--;
					dbg.location(39,10);
					match(input,11,FOLLOW_11_in_command302); dbg.location(39,15);
					pushFollow(FOLLOW_exprs_in_command304);
					exprs();
					state._fsp--;

					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:40:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
					{
					dbg.location(40,4);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:40:4: ( 'if' expression 'then' commands ( 'else' commands )? 'fi' )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:40:5: 'if' expression 'then' commands ( 'else' commands )? 'fi'
					{
					dbg.location(40,5);
					match(input,22,FOLLOW_22_in_command311); dbg.location(40,10);
					pushFollow(FOLLOW_expression_in_command313);
					expression();
					state._fsp--;
					dbg.location(40,21);
					match(input,29,FOLLOW_29_in_command315); dbg.location(40,28);
					pushFollow(FOLLOW_commands_in_command317);
					commands();
					state._fsp--;
					dbg.location(40,37);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:40:37: ( 'else' commands )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==16) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:40:38: 'else' commands
							{
							dbg.location(40,38);
							match(input,16,FOLLOW_16_in_command320); dbg.location(40,45);
							pushFollow(FOLLOW_commands_in_command322);
							commands();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(40,56);
					match(input,17,FOLLOW_17_in_command326); 
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:41:4: ( 'while' expression 'do' commands 'od' )
					{
					dbg.location(41,4);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:41:4: ( 'while' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:41:5: 'while' expression 'do' commands 'od'
					{
					dbg.location(41,5);
					match(input,31,FOLLOW_31_in_command333); dbg.location(41,13);
					pushFollow(FOLLOW_expression_in_command335);
					expression();
					state._fsp--;
					dbg.location(41,24);
					match(input,15,FOLLOW_15_in_command337); dbg.location(41,29);
					pushFollow(FOLLOW_commands_in_command339);
					commands();
					state._fsp--;
					dbg.location(41,38);
					match(input,27,FOLLOW_27_in_command341); 
					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:42:4: ( 'for' expression 'do' commands 'od' )
					{
					dbg.location(42,4);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:42:4: ( 'for' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:42:5: 'for' expression 'do' commands 'od'
					{
					dbg.location(42,5);
					match(input,18,FOLLOW_18_in_command348); dbg.location(42,11);
					pushFollow(FOLLOW_expression_in_command350);
					expression();
					state._fsp--;
					dbg.location(42,22);
					match(input,15,FOLLOW_15_in_command352); dbg.location(42,27);
					pushFollow(FOLLOW_commands_in_command354);
					commands();
					state._fsp--;
					dbg.location(42,36);
					match(input,27,FOLLOW_27_in_command356); 
					}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:43:4: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					{
					dbg.location(43,4);
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:43:4: ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:43:5: 'foreach' VARIABLE 'in' expression 'do' commands 'od'
					{
					dbg.location(43,5);
					match(input,19,FOLLOW_19_in_command363); dbg.location(43,15);
					match(input,VARIABLE,FOLLOW_VARIABLE_in_command365); dbg.location(43,24);
					match(input,23,FOLLOW_23_in_command367); dbg.location(43,29);
					pushFollow(FOLLOW_expression_in_command369);
					expression();
					state._fsp--;
					dbg.location(43,40);
					match(input,15,FOLLOW_15_in_command371); dbg.location(43,45);
					pushFollow(FOLLOW_commands_in_command373);
					commands();
					state._fsp--;
					dbg.location(43,54);
					match(input,27,FOLLOW_27_in_command375); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(43, 58);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "command"



	// $ANTLR start "definition"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:45:1: definition : 'read' input '%' commands '%' 'write' output ;
	public final void definition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:45:12: ( 'read' input '%' commands '%' 'write' output )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:46:2: 'read' input '%' commands '%' 'write' output
			{
			dbg.location(46,2);
			match(input,28,FOLLOW_28_in_definition385); dbg.location(46,9);
			pushFollow(FOLLOW_input_in_definition387);
			input();
			state._fsp--;
			dbg.location(46,15);
			match(input,6,FOLLOW_6_in_definition389); dbg.location(46,19);
			pushFollow(FOLLOW_commands_in_definition391);
			commands();
			state._fsp--;
			dbg.location(46,28);
			match(input,6,FOLLOW_6_in_definition393); dbg.location(46,32);
			match(input,32,FOLLOW_32_in_definition395); dbg.location(46,40);
			pushFollow(FOLLOW_output_in_definition397);
			output();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(46, 45);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "definition"



	// $ANTLR start "function"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:48:1: function : 'function' SYMBOL ':' definition ;
	public final void function() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(48, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:48:10: ( 'function' SYMBOL ':' definition )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:49:2: 'function' SYMBOL ':' definition
			{
			dbg.location(49,2);
			match(input,20,FOLLOW_20_in_function407); dbg.location(49,13);
			match(input,SYMBOL,FOLLOW_SYMBOL_in_function409); dbg.location(49,20);
			match(input,10,FOLLOW_10_in_function411); dbg.location(49,24);
			pushFollow(FOLLOW_definition_in_function413);
			definition();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(49, 33);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function"



	// $ANTLR start "program"
	// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:51:1: program : function ( program )? ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(51, 0);

		try {
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:51:9: ( function ( program )? )
			dbg.enterAlt(1);

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:52:2: function ( program )?
			{
			dbg.location(52,2);
			pushFollow(FOLLOW_function_in_program423);
			function();
			state._fsp--;
			dbg.location(52,11);
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:52:11: ( program )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==20) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:52:11: program
					{
					dbg.location(52,11);
					pushFollow(FOLLOW_program_in_program425);
					program();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"

	// Delegated rules



	public static final BitSet FOLLOW_set_in_exprBase78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_exprBase96 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_exprBase98 = new BitSet(new long[]{0x00000000020001B0L});
	public static final BitSet FOLLOW_lExpr_in_exprBase100 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_exprBase102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_exprBase108 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_exprBase110 = new BitSet(new long[]{0x00000000020001B0L});
	public static final BitSet FOLLOW_lExpr_in_exprBase112 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_exprBase114 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_exprBase124 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_exprBase126 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_exprBase_in_exprBase128 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_exprBase130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_exprBase136 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_exprBase138 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_exprBase_in_exprBase140 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_exprBase142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_7_in_exprBase151 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_SYMBOL_in_exprBase153 = new BitSet(new long[]{0x00000000020001B0L});
	public static final BitSet FOLLOW_lExpr_in_exprBase155 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_8_in_exprBase157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr169 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_lExpr_in_lExpr171 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression182 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_expression185 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_exprBase_in_expression187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_vars198 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_vars201 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_vars_in_vars203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs214 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_exprs217 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_exprs_in_exprs219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_output231 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_output234 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_output_in_output236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_inputSub248 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_9_in_inputSub251 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_inputSub_in_inputSub253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands274 = new BitSet(new long[]{0x0000000000001002L});
	public static final BitSet FOLLOW_12_in_commands277 = new BitSet(new long[]{0x00000000844C0020L});
	public static final BitSet FOLLOW_commands_in_commands279 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_command293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command300 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_command302 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_exprs_in_command304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_command311 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_expression_in_command313 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_command315 = new BitSet(new long[]{0x00000000844C0020L});
	public static final BitSet FOLLOW_commands_in_command317 = new BitSet(new long[]{0x0000000000030000L});
	public static final BitSet FOLLOW_16_in_command320 = new BitSet(new long[]{0x00000000844C0020L});
	public static final BitSet FOLLOW_commands_in_command322 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_command326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_command333 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_expression_in_command335 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_command337 = new BitSet(new long[]{0x00000000844C0020L});
	public static final BitSet FOLLOW_commands_in_command339 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_command341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_command348 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_expression_in_command350 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_command352 = new BitSet(new long[]{0x00000000844C0020L});
	public static final BitSet FOLLOW_commands_in_command354 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_command356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_command363 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_VARIABLE_in_command365 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_command367 = new BitSet(new long[]{0x00000000020000B0L});
	public static final BitSet FOLLOW_expression_in_command369 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_command371 = new BitSet(new long[]{0x00000000844C0020L});
	public static final BitSet FOLLOW_commands_in_command373 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_command375 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_definition385 = new BitSet(new long[]{0x0000000000000060L});
	public static final BitSet FOLLOW_input_in_definition387 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_definition389 = new BitSet(new long[]{0x00000000844C0020L});
	public static final BitSet FOLLOW_commands_in_definition391 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_6_in_definition393 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_definition395 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_output_in_definition397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_function407 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_SYMBOL_in_function409 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_function411 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_definition_in_function413 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program423 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_program_in_program425 = new BitSet(new long[]{0x0000000000000002L});
}
