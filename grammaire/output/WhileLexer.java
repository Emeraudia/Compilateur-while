// $ANTLR 3.5.1 /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g 2023-11-14 16:52:05

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class WhileLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public WhileLexer() {} 
	public WhileLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public WhileLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g"; }

	// $ANTLR start "T__6"
	public final void mT__6() throws RecognitionException {
		try {
			int _type = T__6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:2:6: ( '%' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:2:8: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__6"

	// $ANTLR start "T__7"
	public final void mT__7() throws RecognitionException {
		try {
			int _type = T__7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:3:6: ( '(' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:3:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__7"

	// $ANTLR start "T__8"
	public final void mT__8() throws RecognitionException {
		try {
			int _type = T__8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:4:6: ( ')' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:4:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__8"

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:5:6: ( ',' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:5:8: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:6:7: ( ':' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:6:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:7:7: ( ':=' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:7:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:8:7: ( ';' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:8:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:7: ( '=?' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:9:9: '=?'
			{
			match("=?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:7: ( 'cons' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:10:9: 'cons'
			{
			match("cons"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:11:7: ( 'do' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:11:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:12:7: ( 'else' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:12:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:13:7: ( 'fi' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:13:9: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:14:7: ( 'for' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:14:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:15:7: ( 'foreach' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:15:9: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:16:7: ( 'function' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:16:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:17:7: ( 'hd' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:17:9: 'hd'
			{
			match("hd"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:18:7: ( 'if' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:18:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:19:7: ( 'in' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:19:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:20:7: ( 'list' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:20:9: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:21:7: ( 'nil' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:21:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:22:7: ( 'nop' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:22:9: 'nop'
			{
			match("nop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:23:7: ( 'od' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:23:9: 'od'
			{
			match("od"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:24:7: ( 'read' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:24:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:25:7: ( 'then' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:25:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:26:7: ( 'tl' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:26:9: 'tl'
			{
			match("tl"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:27:7: ( 'while' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:27:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:28:7: ( 'write' )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:28:9: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:3:10: ( ( 'A' .. 'Z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )? )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:3:13: ( 'A' .. 'Z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )?
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:3:23: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:3:52: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	// $ANTLR start "SYMBOL"
	public final void mSYMBOL() throws RecognitionException {
		try {
			int _type = SYMBOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:5:8: ( ( 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )? )
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:5:11: ( 'a' .. 'z' ) ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )* ( '!' | '?' )?
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:5:21: ( 'A' .. 'Z' | 'a' .. 'z' | '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:5:50: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYMBOL"

	@Override
	public void mTokens() throws RecognitionException {
		// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | VARIABLE | SYMBOL )
		int alt5=29;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:10: T__6
				{
				mT__6(); 

				}
				break;
			case 2 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:15: T__7
				{
				mT__7(); 

				}
				break;
			case 3 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:20: T__8
				{
				mT__8(); 

				}
				break;
			case 4 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:25: T__9
				{
				mT__9(); 

				}
				break;
			case 5 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:30: T__10
				{
				mT__10(); 

				}
				break;
			case 6 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:36: T__11
				{
				mT__11(); 

				}
				break;
			case 7 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:42: T__12
				{
				mT__12(); 

				}
				break;
			case 8 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:48: T__13
				{
				mT__13(); 

				}
				break;
			case 9 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:54: T__14
				{
				mT__14(); 

				}
				break;
			case 10 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:60: T__15
				{
				mT__15(); 

				}
				break;
			case 11 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:66: T__16
				{
				mT__16(); 

				}
				break;
			case 12 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:72: T__17
				{
				mT__17(); 

				}
				break;
			case 13 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:78: T__18
				{
				mT__18(); 

				}
				break;
			case 14 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:84: T__19
				{
				mT__19(); 

				}
				break;
			case 15 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:90: T__20
				{
				mT__20(); 

				}
				break;
			case 16 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:96: T__21
				{
				mT__21(); 

				}
				break;
			case 17 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:102: T__22
				{
				mT__22(); 

				}
				break;
			case 18 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:108: T__23
				{
				mT__23(); 

				}
				break;
			case 19 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:114: T__24
				{
				mT__24(); 

				}
				break;
			case 20 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:120: T__25
				{
				mT__25(); 

				}
				break;
			case 21 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:126: T__26
				{
				mT__26(); 

				}
				break;
			case 22 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:132: T__27
				{
				mT__27(); 

				}
				break;
			case 23 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:138: T__28
				{
				mT__28(); 

				}
				break;
			case 24 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:144: T__29
				{
				mT__29(); 

				}
				break;
			case 25 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:150: T__30
				{
				mT__30(); 

				}
				break;
			case 26 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:156: T__31
				{
				mT__31(); 

				}
				break;
			case 27 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:162: T__32
				{
				mT__32(); 

				}
				break;
			case 28 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:168: VARIABLE
				{
				mVARIABLE(); 

				}
				break;
			case 29 :
				// /mnt/DATA/cours/esir2/TLC/Compilateur-while/grammaire/While.g:1:177: SYMBOL
				{
				mSYMBOL(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\5\uffff\1\27\2\uffff\14\25\4\uffff\1\25\1\53\1\25\1\55\2\25\1\60\1\61"+
		"\1\62\3\25\1\66\2\25\1\71\3\25\1\uffff\1\25\1\uffff\1\77\1\25\3\uffff"+
		"\1\25\1\102\1\103\1\uffff\2\25\1\uffff\2\25\1\110\1\111\1\25\1\uffff\1"+
		"\25\1\114\2\uffff\1\115\1\116\2\25\2\uffff\2\25\3\uffff\1\123\1\124\2"+
		"\25\2\uffff\1\127\1\25\1\uffff\1\131\1\uffff";
	static final String DFA5_eofS =
		"\132\uffff";
	static final String DFA5_minS =
		"\1\45\4\uffff\1\75\2\uffff\2\157\1\154\1\151\1\144\1\146\2\151\1\144\1"+
		"\145\2\150\4\uffff\1\156\1\41\1\163\1\41\1\162\1\156\3\41\1\163\1\154"+
		"\1\160\1\41\1\141\1\145\1\41\2\151\1\163\1\uffff\1\145\1\uffff\1\41\1"+
		"\143\3\uffff\1\164\2\41\1\uffff\1\144\1\156\1\uffff\1\154\1\164\2\41\1"+
		"\141\1\uffff\1\164\1\41\2\uffff\2\41\2\145\2\uffff\1\143\1\151\3\uffff"+
		"\2\41\1\150\1\157\2\uffff\1\41\1\156\1\uffff\1\41\1\uffff";
	static final String DFA5_maxS =
		"\1\172\4\uffff\1\75\2\uffff\2\157\1\154\1\165\1\144\1\156\1\151\1\157"+
		"\1\144\1\145\1\154\1\162\4\uffff\1\156\1\172\1\163\1\172\1\162\1\156\3"+
		"\172\1\163\1\154\1\160\1\172\1\141\1\145\1\172\2\151\1\163\1\uffff\1\145"+
		"\1\uffff\1\172\1\143\3\uffff\1\164\2\172\1\uffff\1\144\1\156\1\uffff\1"+
		"\154\1\164\2\172\1\141\1\uffff\1\164\1\172\2\uffff\2\172\2\145\2\uffff"+
		"\1\143\1\151\3\uffff\2\172\1\150\1\157\2\uffff\1\172\1\156\1\uffff\1\172"+
		"\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\14\uffff\1\34\1\35\1\6\1\5\23"+
		"\uffff\1\12\1\uffff\1\14\2\uffff\1\20\1\21\1\22\3\uffff\1\26\2\uffff\1"+
		"\31\5\uffff\1\15\2\uffff\1\24\1\25\4\uffff\1\11\1\13\2\uffff\1\23\1\27"+
		"\1\30\4\uffff\1\32\1\33\2\uffff\1\16\1\uffff\1\17";
	static final String DFA5_specialS =
		"\132\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\1\2\uffff\1\2\1\3\2\uffff\1\4\15\uffff\1\5\1\6\1\uffff\1\7\3\uffff"+
			"\32\24\6\uffff\2\25\1\10\1\11\1\12\1\13\1\25\1\14\1\15\2\25\1\16\1\25"+
			"\1\17\1\20\2\25\1\21\1\25\1\22\2\25\1\23\3\25",
			"",
			"",
			"",
			"",
			"\1\26",
			"",
			"",
			"\1\30",
			"\1\31",
			"\1\32",
			"\1\33\5\uffff\1\34\5\uffff\1\35",
			"\1\36",
			"\1\37\7\uffff\1\40",
			"\1\41",
			"\1\42\5\uffff\1\43",
			"\1\44",
			"\1\45",
			"\1\46\3\uffff\1\47",
			"\1\50\11\uffff\1\51",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\54",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\56",
			"\1\57",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\63",
			"\1\64",
			"\1\65",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\67",
			"\1\70",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\72",
			"\1\73",
			"\1\74",
			"",
			"\1\75",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\4\25\1\76\25"+
			"\25",
			"\1\100",
			"",
			"",
			"",
			"\1\101",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"",
			"\1\104",
			"\1\105",
			"",
			"\1\106",
			"\1\107",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\112",
			"",
			"\1\113",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\117",
			"\1\120",
			"",
			"",
			"\1\121",
			"\1\122",
			"",
			"",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\125",
			"\1\126",
			"",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			"\1\130",
			"",
			"\1\25\16\uffff\12\25\5\uffff\1\25\1\uffff\32\25\6\uffff\32\25",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | VARIABLE | SYMBOL );";
		}
	}

}
