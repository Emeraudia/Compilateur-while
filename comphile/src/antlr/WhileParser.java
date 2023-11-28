package antlr;
// $ANTLR 3.5.1 /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g 2023-11-20 17:37:01

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
      "LIST", "OUTPUT", "SYMBOL", "TEST", "TL", "VARIABLE", "WHILE", "'%'",
      "'('", "')'", "','", "':'", "':='", "';'", "'=?'", "'cons'", "'do'", "'else'",
      "'fi'", "'for'", "'foreach'", "'function'", "'hd'", "'if'", "'in'", "'list'",
      "'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl'", "'while'", "'write'"
  };
  public static final int EOF = -1;
  public static final int T__22 = 22;
  public static final int T__23 = 23;
  public static final int T__24 = 24;
  public static final int T__25 = 25;
  public static final int T__26 = 26;
  public static final int T__27 = 27;
  public static final int T__28 = 28;
  public static final int T__29 = 29;
  public static final int T__30 = 30;
  public static final int T__31 = 31;
  public static final int T__32 = 32;
  public static final int T__33 = 33;
  public static final int T__34 = 34;
  public static final int T__35 = 35;
  public static final int T__36 = 36;
  public static final int T__37 = 37;
  public static final int T__38 = 38;
  public static final int T__39 = 39;
  public static final int T__40 = 40;
  public static final int T__41 = 41;
  public static final int T__42 = 42;
  public static final int T__43 = 43;
  public static final int T__44 = 44;
  public static final int T__45 = 45;
  public static final int T__46 = 46;
  public static final int T__47 = 47;
  public static final int T__48 = 48;
  public static final int ASSIGN = 4;
  public static final int COMMANDS = 5;
  public static final int CONS = 6;
  public static final int DEFINITION = 7;
  public static final int EXPR = 8;
  public static final int FOR = 9;
  public static final int FOREACH = 10;
  public static final int FUNCTION = 11;
  public static final int HD = 12;
  public static final int IF = 13;
  public static final int INPUT = 14;
  public static final int LIST = 15;
  public static final int OUTPUT = 16;
  public static final int SYMBOL = 17;
  public static final int TEST = 18;
  public static final int TL = 19;
  public static final int VARIABLE = 20;
  public static final int WHILE = 21;

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

  @Override
  public String[] getTokenNames() {
    return WhileParser.tokenNames;
  }

  @Override
  public String getGrammarFileName() {
    return "/home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g";
  }

  public static class program_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "program"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:27:1: program
  // : function ( program )? ;
  public final WhileParser.program_return program() throws RecognitionException {
    WhileParser.program_return retval = new WhileParser.program_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    ParserRuleReturnScope function1 = null;
    ParserRuleReturnScope program2 = null;

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:27:9: (
      // function ( program )? )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:28:2:
      // function ( program )?
      {
        root_0 = (Object) adaptor.nil();

        pushFollow(FOLLOW_function_in_program93);
        function1 = function();
        state._fsp--;

        adaptor.addChild(root_0, function1.getTree());

        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:28:11: (
        // program )?
        int alt1 = 2;
        int LA1_0 = input.LA(1);
        if ((LA1_0 == 36)) {
          alt1 = 1;
        }
        switch (alt1) {
          case 1:
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:28:11:
          // program
          {
            pushFollow(FOLLOW_program_in_program95);
            program2 = program();
            state._fsp--;

            adaptor.addChild(root_0, program2.getTree());

          }
            break;

        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "program"

  public static class exprBase_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "exprBase"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:34:1:
  // exprBase : ( ( 'nil' | VARIABLE | SYMBOL ) | '(' 'cons' lExpr ')' -> ^( CONS
  // lExpr ) | '(' 'list' lExpr ')' -> ^( LIST lExpr ) | '(' 'hd' exprBase ')' ->
  // ^( HD exprBase ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL
  // lExpr ')' -> ^( SYMBOL lExpr ) );
  public final WhileParser.exprBase_return exprBase() throws RecognitionException {
    WhileParser.exprBase_return retval = new WhileParser.exprBase_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token set3 = null;
    Token char_literal4 = null;
    Token string_literal5 = null;
    Token char_literal7 = null;
    Token char_literal8 = null;
    Token string_literal9 = null;
    Token char_literal11 = null;
    Token char_literal12 = null;
    Token string_literal13 = null;
    Token char_literal15 = null;
    Token char_literal16 = null;
    Token string_literal17 = null;
    Token char_literal19 = null;
    Token char_literal20 = null;
    Token SYMBOL21 = null;
    Token char_literal23 = null;
    ParserRuleReturnScope lExpr6 = null;
    ParserRuleReturnScope lExpr10 = null;
    ParserRuleReturnScope exprBase14 = null;
    ParserRuleReturnScope exprBase18 = null;
    ParserRuleReturnScope lExpr22 = null;

    Object set3_tree = null;
    Object char_literal4_tree = null;
    Object string_literal5_tree = null;
    Object char_literal7_tree = null;
    Object char_literal8_tree = null;
    Object string_literal9_tree = null;
    Object char_literal11_tree = null;
    Object char_literal12_tree = null;
    Object string_literal13_tree = null;
    Object char_literal15_tree = null;
    Object char_literal16_tree = null;
    Object string_literal17_tree = null;
    Object char_literal19_tree = null;
    Object char_literal20_tree = null;
    Object SYMBOL21_tree = null;
    Object char_literal23_tree = null;
    RewriteRuleTokenStream stream_23 = new RewriteRuleTokenStream(adaptor, "token 23");
    RewriteRuleTokenStream stream_24 = new RewriteRuleTokenStream(adaptor, "token 24");
    RewriteRuleTokenStream stream_46 = new RewriteRuleTokenStream(adaptor, "token 46");
    RewriteRuleTokenStream stream_37 = new RewriteRuleTokenStream(adaptor, "token 37");
    RewriteRuleTokenStream stream_SYMBOL = new RewriteRuleTokenStream(adaptor, "token SYMBOL");
    RewriteRuleTokenStream stream_40 = new RewriteRuleTokenStream(adaptor, "token 40");
    RewriteRuleTokenStream stream_30 = new RewriteRuleTokenStream(adaptor, "token 30");
    RewriteRuleSubtreeStream stream_exprBase = new RewriteRuleSubtreeStream(adaptor, "rule exprBase");
    RewriteRuleSubtreeStream stream_lExpr = new RewriteRuleSubtreeStream(adaptor, "rule lExpr");

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:34:10: ( (
      // 'nil' | VARIABLE | SYMBOL ) | '(' 'cons' lExpr ')' -> ^( CONS lExpr ) | '('
      // 'list' lExpr ')' -> ^( LIST lExpr ) | '(' 'hd' exprBase ')' -> ^( HD exprBase
      // ) | '(' 'tl' exprBase ')' -> ^( TL exprBase ) | '(' SYMBOL lExpr ')' -> ^(
      // SYMBOL lExpr ) )
      int alt2 = 6;
      int LA2_0 = input.LA(1);
      if ((LA2_0 == SYMBOL || LA2_0 == VARIABLE || LA2_0 == 41)) {
        alt2 = 1;
      } else if ((LA2_0 == 23)) {
        switch (input.LA(2)) {
          case 30: {
            alt2 = 2;
          }
            break;
          case 40: {
            alt2 = 3;
          }
            break;
          case 37: {
            alt2 = 4;
          }
            break;
          case 46: {
            alt2 = 5;
          }
            break;
          case SYMBOL: {
            alt2 = 6;
          }
            break;
          default:
            int nvaeMark = input.mark();
            try {
              input.consume();
              NoViableAltException nvae = new NoViableAltException("", 2, 2, input);
              throw nvae;
            } finally {
              input.rewind(nvaeMark);
            }
        }
      }

      else {
        NoViableAltException nvae = new NoViableAltException("", 2, 0, input);
        throw nvae;
      }

      switch (alt2) {
        case 1:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:35:2: ( 'nil'
        // | VARIABLE | SYMBOL )
        {
          root_0 = (Object) adaptor.nil();

          set3 = input.LT(1);
          if (input.LA(1) == SYMBOL || input.LA(1) == VARIABLE || input.LA(1) == 41) {
            input.consume();
            adaptor.addChild(root_0, (Object) adaptor.create(set3));
            state.errorRecovery = false;
          } else {
            MismatchedSetException mse = new MismatchedSetException(null, input);
            throw mse;
          }
        }
          break;
        case 2:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:36:4: '('
        // 'cons' lExpr ')'
        {
          char_literal4 = (Token) match(input, 23, FOLLOW_23_in_exprBase187);
          stream_23.add(char_literal4);

          string_literal5 = (Token) match(input, 30, FOLLOW_30_in_exprBase189);
          stream_30.add(string_literal5);

          pushFollow(FOLLOW_lExpr_in_exprBase191);
          lExpr6 = lExpr();
          state._fsp--;

          stream_lExpr.add(lExpr6.getTree());
          char_literal7 = (Token) match(input, 24, FOLLOW_24_in_exprBase193);
          stream_24.add(char_literal7);

          // AST REWRITE
          // elements: lExpr
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 36:25: -> ^( CONS lExpr )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:36:28: ^(
            // CONS lExpr )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(CONS, "CONS"), root_1);
              adaptor.addChild(root_1, stream_lExpr.nextTree());
              adaptor.addChild(root_0, root_1);
            }

          }

          retval.tree = root_0;

        }
          break;
        case 3:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:37:4: '('
        // 'list' lExpr ')'
        {
          char_literal8 = (Token) match(input, 23, FOLLOW_23_in_exprBase206);
          stream_23.add(char_literal8);

          string_literal9 = (Token) match(input, 40, FOLLOW_40_in_exprBase208);
          stream_40.add(string_literal9);

          pushFollow(FOLLOW_lExpr_in_exprBase210);
          lExpr10 = lExpr();
          state._fsp--;

          stream_lExpr.add(lExpr10.getTree());
          char_literal11 = (Token) match(input, 24, FOLLOW_24_in_exprBase212);
          stream_24.add(char_literal11);

          // AST REWRITE
          // elements: lExpr
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 37:25: -> ^( LIST lExpr )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:37:28: ^(
            // LIST lExpr )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(LIST, "LIST"), root_1);
              adaptor.addChild(root_1, stream_lExpr.nextTree());
              adaptor.addChild(root_0, root_1);
            }

          }

          retval.tree = root_0;

        }
          break;
        case 4:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:38:4: '('
        // 'hd' exprBase ')'
        {
          char_literal12 = (Token) match(input, 23, FOLLOW_23_in_exprBase225);
          stream_23.add(char_literal12);

          string_literal13 = (Token) match(input, 37, FOLLOW_37_in_exprBase227);
          stream_37.add(string_literal13);

          pushFollow(FOLLOW_exprBase_in_exprBase229);
          exprBase14 = exprBase();
          state._fsp--;

          stream_exprBase.add(exprBase14.getTree());
          char_literal15 = (Token) match(input, 24, FOLLOW_24_in_exprBase231);
          stream_24.add(char_literal15);

          // AST REWRITE
          // elements: exprBase
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 38:26: -> ^( HD exprBase )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:38:29: ^( HD
            // exprBase )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(HD, "HD"), root_1);
              adaptor.addChild(root_1, stream_exprBase.nextTree());
              adaptor.addChild(root_0, root_1);
            }

          }

          retval.tree = root_0;

        }
          break;
        case 5:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:39:4: '('
        // 'tl' exprBase ')'
        {
          char_literal16 = (Token) match(input, 23, FOLLOW_23_in_exprBase244);
          stream_23.add(char_literal16);

          string_literal17 = (Token) match(input, 46, FOLLOW_46_in_exprBase246);
          stream_46.add(string_literal17);

          pushFollow(FOLLOW_exprBase_in_exprBase248);
          exprBase18 = exprBase();
          state._fsp--;

          stream_exprBase.add(exprBase18.getTree());
          char_literal19 = (Token) match(input, 24, FOLLOW_24_in_exprBase250);
          stream_24.add(char_literal19);

          // AST REWRITE
          // elements: exprBase
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 39:26: -> ^( TL exprBase )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:39:29: ^( TL
            // exprBase )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(TL, "TL"), root_1);
              adaptor.addChild(root_1, stream_exprBase.nextTree());
              adaptor.addChild(root_0, root_1);
            }

          }

          retval.tree = root_0;

        }
          break;
        case 6:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:40:4: '('
        // SYMBOL lExpr ')'
        {
          char_literal20 = (Token) match(input, 23, FOLLOW_23_in_exprBase263);
          stream_23.add(char_literal20);

          SYMBOL21 = (Token) match(input, SYMBOL, FOLLOW_SYMBOL_in_exprBase265);
          stream_SYMBOL.add(SYMBOL21);

          pushFollow(FOLLOW_lExpr_in_exprBase267);
          lExpr22 = lExpr();
          state._fsp--;

          stream_lExpr.add(lExpr22.getTree());
          char_literal23 = (Token) match(input, 24, FOLLOW_24_in_exprBase269);
          stream_24.add(char_literal23);

          // AST REWRITE
          // elements: lExpr, SYMBOL
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 40:25: -> ^( SYMBOL lExpr )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:40:28: ^(
            // SYMBOL lExpr )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot(stream_SYMBOL.nextNode(), root_1);
              adaptor.addChild(root_1, stream_lExpr.nextTree());
              adaptor.addChild(root_0, root_1);
            }

          }

          retval.tree = root_0;

        }
          break;

      }
      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "exprBase"

  public static class lExpr_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "lExpr"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:42:1: lExpr :
  // ( exprBase lExpr )? ;
  public final WhileParser.lExpr_return lExpr() throws RecognitionException {
    WhileParser.lExpr_return retval = new WhileParser.lExpr_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    ParserRuleReturnScope exprBase24 = null;
    ParserRuleReturnScope lExpr25 = null;

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:42:7: ( (
      // exprBase lExpr )? )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:43:2: (
      // exprBase lExpr )?
      {
        root_0 = (Object) adaptor.nil();

        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:43:2: (
        // exprBase lExpr )?
        int alt3 = 2;
        int LA3_0 = input.LA(1);
        if ((LA3_0 == SYMBOL || LA3_0 == VARIABLE || LA3_0 == 23 || LA3_0 == 41)) {
          alt3 = 1;
        }
        switch (alt3) {
          case 1:
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:43:3:
          // exprBase lExpr
          {
            pushFollow(FOLLOW_exprBase_in_lExpr288);
            exprBase24 = exprBase();
            state._fsp--;

            adaptor.addChild(root_0, exprBase24.getTree());

            pushFollow(FOLLOW_lExpr_in_lExpr290);
            lExpr25 = lExpr();
            state._fsp--;

            adaptor.addChild(root_0, lExpr25.getTree());

          }
            break;

        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "lExpr"

  public static class expression_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "expression"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:45:1:
  // expression : exprBase ( '=?' exprBase )? -> ^( EXPR exprBase ( exprBase )? )
  // ;
  public final WhileParser.expression_return expression() throws RecognitionException {
    WhileParser.expression_return retval = new WhileParser.expression_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token string_literal27 = null;
    ParserRuleReturnScope exprBase26 = null;
    ParserRuleReturnScope exprBase28 = null;

    Object string_literal27_tree = null;
    RewriteRuleTokenStream stream_29 = new RewriteRuleTokenStream(adaptor, "token 29");
    RewriteRuleSubtreeStream stream_exprBase = new RewriteRuleSubtreeStream(adaptor, "rule exprBase");

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:45:12: (
      // exprBase ( '=?' exprBase )? -> ^( EXPR exprBase ( exprBase )? ) )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:46:2:
      // exprBase ( '=?' exprBase )?
      {
        pushFollow(FOLLOW_exprBase_in_expression301);
        exprBase26 = exprBase();
        state._fsp--;

        stream_exprBase.add(exprBase26.getTree());
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:46:11: ( '=?'
        // exprBase )?
        int alt4 = 2;
        int LA4_0 = input.LA(1);
        if ((LA4_0 == 29)) {
          alt4 = 1;
        }
        switch (alt4) {
          case 1:
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:46:12: '=?'
          // exprBase
          {
            string_literal27 = (Token) match(input, 29, FOLLOW_29_in_expression304);
            stream_29.add(string_literal27);

            pushFollow(FOLLOW_exprBase_in_expression306);
            exprBase28 = exprBase();
            state._fsp--;

            stream_exprBase.add(exprBase28.getTree());
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
        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
            retval != null ? retval.getTree() : null);

        root_0 = (Object) adaptor.nil();
        // 46:28: -> ^( EXPR exprBase ( exprBase )? )
        {
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:46:31: ^(
          // EXPR exprBase ( exprBase )? )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(EXPR, "EXPR"), root_1);
            adaptor.addChild(root_1, stream_exprBase.nextTree());
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:46:47: (
            // exprBase )?
            if (stream_exprBase.hasNext()) {
              adaptor.addChild(root_1, stream_exprBase.nextTree());
            }
            stream_exprBase.reset();

            adaptor.addChild(root_0, root_1);
          }

        }

        retval.tree = root_0;

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "expression"

  public static class vars_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "vars"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:48:1: vars :
  // VARIABLE ( ',' ! vars )? ;
  public final WhileParser.vars_return vars() throws RecognitionException {
    WhileParser.vars_return retval = new WhileParser.vars_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token VARIABLE29 = null;
    Token char_literal30 = null;
    ParserRuleReturnScope vars31 = null;

    Object VARIABLE29_tree = null;
    Object char_literal30_tree = null;

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:48:6: (
      // VARIABLE ( ',' ! vars )? )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:49:2:
      // VARIABLE ( ',' ! vars )?
      {
        root_0 = (Object) adaptor.nil();

        VARIABLE29 = (Token) match(input, VARIABLE, FOLLOW_VARIABLE_in_vars328);
        VARIABLE29_tree = (Object) adaptor.create(VARIABLE29);
        adaptor.addChild(root_0, VARIABLE29_tree);

        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:49:11: ( ','
        // ! vars )?
        int alt5 = 2;
        int LA5_0 = input.LA(1);
        if ((LA5_0 == 25)) {
          alt5 = 1;
        }
        switch (alt5) {
          case 1:
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:49:12: ',' !
          // vars
          {
            char_literal30 = (Token) match(input, 25, FOLLOW_25_in_vars331);
            pushFollow(FOLLOW_vars_in_vars334);
            vars31 = vars();
            state._fsp--;

            adaptor.addChild(root_0, vars31.getTree());

          }
            break;

        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "vars"

  public static class exprs_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "exprs"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:51:1: exprs :
  // expression ( ',' ! exprs )? ;
  public final WhileParser.exprs_return exprs() throws RecognitionException {
    WhileParser.exprs_return retval = new WhileParser.exprs_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token char_literal33 = null;
    ParserRuleReturnScope expression32 = null;
    ParserRuleReturnScope exprs34 = null;

    Object char_literal33_tree = null;

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:51:7: (
      // expression ( ',' ! exprs )? )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:52:2:
      // expression ( ',' ! exprs )?
      {
        root_0 = (Object) adaptor.nil();

        pushFollow(FOLLOW_expression_in_exprs345);
        expression32 = expression();
        state._fsp--;

        adaptor.addChild(root_0, expression32.getTree());

        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:52:13: ( ','
        // ! exprs )?
        int alt6 = 2;
        int LA6_0 = input.LA(1);
        if ((LA6_0 == 25)) {
          alt6 = 1;
        }
        switch (alt6) {
          case 1:
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:52:14: ',' !
          // exprs
          {
            char_literal33 = (Token) match(input, 25, FOLLOW_25_in_exprs348);
            pushFollow(FOLLOW_exprs_in_exprs351);
            exprs34 = exprs();
            state._fsp--;

            adaptor.addChild(root_0, exprs34.getTree());

          }
            break;

        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "exprs"

  public static class output_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "output"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:54:1: output
  // : VARIABLE ( ',' ! output )? ;
  public final WhileParser.output_return output() throws RecognitionException {
    WhileParser.output_return retval = new WhileParser.output_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token VARIABLE35 = null;
    Token char_literal36 = null;
    ParserRuleReturnScope output37 = null;

    Object VARIABLE35_tree = null;
    Object char_literal36_tree = null;

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:54:8: (
      // VARIABLE ( ',' ! output )? )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:55:2:
      // VARIABLE ( ',' ! output )?
      {
        root_0 = (Object) adaptor.nil();

        VARIABLE35 = (Token) match(input, VARIABLE, FOLLOW_VARIABLE_in_output363);
        VARIABLE35_tree = (Object) adaptor.create(VARIABLE35);
        adaptor.addChild(root_0, VARIABLE35_tree);

        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:55:11: ( ','
        // ! output )?
        int alt7 = 2;
        int LA7_0 = input.LA(1);
        if ((LA7_0 == 25)) {
          alt7 = 1;
        }
        switch (alt7) {
          case 1:
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:55:12: ',' !
          // output
          {
            char_literal36 = (Token) match(input, 25, FOLLOW_25_in_output366);
            pushFollow(FOLLOW_output_in_output369);
            output37 = output();
            state._fsp--;

            adaptor.addChild(root_0, output37.getTree());

          }
            break;

        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "output"

  public static class inputSub_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "inputSub"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:57:1:
  // inputSub : VARIABLE ( ',' ! inputSub )? ;
  public final WhileParser.inputSub_return inputSub() throws RecognitionException {
    WhileParser.inputSub_return retval = new WhileParser.inputSub_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token VARIABLE38 = null;
    Token char_literal39 = null;
    ParserRuleReturnScope inputSub40 = null;

    Object VARIABLE38_tree = null;
    Object char_literal39_tree = null;

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:57:10: (
      // VARIABLE ( ',' ! inputSub )? )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:58:2:
      // VARIABLE ( ',' ! inputSub )?
      {
        root_0 = (Object) adaptor.nil();

        VARIABLE38 = (Token) match(input, VARIABLE, FOLLOW_VARIABLE_in_inputSub381);
        VARIABLE38_tree = (Object) adaptor.create(VARIABLE38);
        adaptor.addChild(root_0, VARIABLE38_tree);

        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:58:11: ( ','
        // ! inputSub )?
        int alt8 = 2;
        int LA8_0 = input.LA(1);
        if ((LA8_0 == 25)) {
          alt8 = 1;
        }
        switch (alt8) {
          case 1:
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:58:12: ',' !
          // inputSub
          {
            char_literal39 = (Token) match(input, 25, FOLLOW_25_in_inputSub384);
            pushFollow(FOLLOW_inputSub_in_inputSub387);
            inputSub40 = inputSub();
            state._fsp--;

            adaptor.addChild(root_0, inputSub40.getTree());

          }
            break;

        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "inputSub"

  public static class input_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "input"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:60:1: input :
  // ( inputSub )? -> ^( INPUT ( inputSub )? ) ;
  public final WhileParser.input_return input() throws RecognitionException {
    WhileParser.input_return retval = new WhileParser.input_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    ParserRuleReturnScope inputSub41 = null;

    RewriteRuleSubtreeStream stream_inputSub = new RewriteRuleSubtreeStream(adaptor, "rule inputSub");

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:60:7: ( (
      // inputSub )? -> ^( INPUT ( inputSub )? ) )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:61:2: (
      // inputSub )?
      {
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:61:2: (
        // inputSub )?
        int alt9 = 2;
        int LA9_0 = input.LA(1);
        if ((LA9_0 == VARIABLE)) {
          alt9 = 1;
        }
        switch (alt9) {
          case 1:
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:61:2:
          // inputSub
          {
            pushFollow(FOLLOW_inputSub_in_input398);
            inputSub41 = inputSub();
            state._fsp--;

            stream_inputSub.add(inputSub41.getTree());
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
        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
            retval != null ? retval.getTree() : null);

        root_0 = (Object) adaptor.nil();
        // 61:12: -> ^( INPUT ( inputSub )? )
        {
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:61:15: ^(
          // INPUT ( inputSub )? )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(INPUT, "INPUT"), root_1);
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:61:23: (
            // inputSub )?
            if (stream_inputSub.hasNext()) {
              adaptor.addChild(root_1, stream_inputSub.nextTree());
            }
            stream_inputSub.reset();

            adaptor.addChild(root_0, root_1);
          }

        }

        retval.tree = root_0;

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "input"

  public static class commands_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "commands"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:63:1:
  // commands : command ( ';' ! commands )? ;
  public final WhileParser.commands_return commands() throws RecognitionException {
    WhileParser.commands_return retval = new WhileParser.commands_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token char_literal43 = null;
    ParserRuleReturnScope command42 = null;
    ParserRuleReturnScope commands44 = null;

    Object char_literal43_tree = null;

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:63:10: (
      // command ( ';' ! commands )? )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:64:2: command
      // ( ';' ! commands )?
      {
        root_0 = (Object) adaptor.nil();

        pushFollow(FOLLOW_command_in_commands417);
        command42 = command();
        state._fsp--;

        adaptor.addChild(root_0, command42.getTree());

        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:64:10: ( ';'
        // ! commands )?
        int alt10 = 2;
        int LA10_0 = input.LA(1);
        if ((LA10_0 == 28)) {
          alt10 = 1;
        }
        switch (alt10) {
          case 1:
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:64:11: ';' !
          // commands
          {
            char_literal43 = (Token) match(input, 28, FOLLOW_28_in_commands420);
            pushFollow(FOLLOW_commands_in_commands423);
            commands44 = commands();
            state._fsp--;

            adaptor.addChild(root_0, commands44.getTree());

          }
            break;

        }

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "commands"

  public static class command_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "command"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:66:1: command
  // : ( ( 'nop' ) | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if'
  // expression 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF expression ^(
  // COMMANDS commands ) ( ^( COMMANDS commands ) )? ) | ( 'while' expression 'do'
  // commands 'od' ) -> ^( WHILE expression ^( COMMANDS commands ) ) | ( 'for'
  // expression 'do' commands 'od' ) -> ^( FOR expression ^( COMMANDS commands ) )
  // | ( 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH
  // VARIABLE expression ^( COMMANDS commands ) ) );
  public final WhileParser.command_return command() throws RecognitionException {
    WhileParser.command_return retval = new WhileParser.command_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token string_literal45 = null;
    Token string_literal47 = null;
    Token string_literal49 = null;
    Token string_literal51 = null;
    Token string_literal53 = null;
    Token string_literal55 = null;
    Token string_literal56 = null;
    Token string_literal58 = null;
    Token string_literal60 = null;
    Token string_literal61 = null;
    Token string_literal63 = null;
    Token string_literal65 = null;
    Token string_literal66 = null;
    Token VARIABLE67 = null;
    Token string_literal68 = null;
    Token string_literal70 = null;
    Token string_literal72 = null;
    ParserRuleReturnScope vars46 = null;
    ParserRuleReturnScope exprs48 = null;
    ParserRuleReturnScope expression50 = null;
    ParserRuleReturnScope commands52 = null;
    ParserRuleReturnScope commands54 = null;
    ParserRuleReturnScope expression57 = null;
    ParserRuleReturnScope commands59 = null;
    ParserRuleReturnScope expression62 = null;
    ParserRuleReturnScope commands64 = null;
    ParserRuleReturnScope expression69 = null;
    ParserRuleReturnScope commands71 = null;

    Object string_literal45_tree = null;
    Object string_literal47_tree = null;
    Object string_literal49_tree = null;
    Object string_literal51_tree = null;
    Object string_literal53_tree = null;
    Object string_literal55_tree = null;
    Object string_literal56_tree = null;
    Object string_literal58_tree = null;
    Object string_literal60_tree = null;
    Object string_literal61_tree = null;
    Object string_literal63_tree = null;
    Object string_literal65_tree = null;
    Object string_literal66_tree = null;
    Object VARIABLE67_tree = null;
    Object string_literal68_tree = null;
    Object string_literal70_tree = null;
    Object string_literal72_tree = null;
    RewriteRuleTokenStream stream_33 = new RewriteRuleTokenStream(adaptor, "token 33");
    RewriteRuleTokenStream stream_45 = new RewriteRuleTokenStream(adaptor, "token 45");
    RewriteRuleTokenStream stream_34 = new RewriteRuleTokenStream(adaptor, "token 34");
    RewriteRuleTokenStream stream_35 = new RewriteRuleTokenStream(adaptor, "token 35");
    RewriteRuleTokenStream stream_47 = new RewriteRuleTokenStream(adaptor, "token 47");
    RewriteRuleTokenStream stream_27 = new RewriteRuleTokenStream(adaptor, "token 27");
    RewriteRuleTokenStream stream_38 = new RewriteRuleTokenStream(adaptor, "token 38");
    RewriteRuleTokenStream stream_VARIABLE = new RewriteRuleTokenStream(adaptor, "token VARIABLE");
    RewriteRuleTokenStream stream_39 = new RewriteRuleTokenStream(adaptor, "token 39");
    RewriteRuleTokenStream stream_31 = new RewriteRuleTokenStream(adaptor, "token 31");
    RewriteRuleTokenStream stream_32 = new RewriteRuleTokenStream(adaptor, "token 32");
    RewriteRuleTokenStream stream_43 = new RewriteRuleTokenStream(adaptor, "token 43");
    RewriteRuleSubtreeStream stream_expression = new RewriteRuleSubtreeStream(adaptor, "rule expression");
    RewriteRuleSubtreeStream stream_exprs = new RewriteRuleSubtreeStream(adaptor, "rule exprs");
    RewriteRuleSubtreeStream stream_vars = new RewriteRuleSubtreeStream(adaptor, "rule vars");
    RewriteRuleSubtreeStream stream_commands = new RewriteRuleSubtreeStream(adaptor, "rule commands");

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:66:9: ( (
      // 'nop' ) | ( vars ':=' exprs ) -> ^( ASSIGN vars exprs ) | ( 'if' expression
      // 'then' commands ( 'else' commands )? 'fi' ) -> ^( IF expression ^( COMMANDS
      // commands ) ( ^( COMMANDS commands ) )? ) | ( 'while' expression 'do' commands
      // 'od' ) -> ^( WHILE expression ^( COMMANDS commands ) ) | ( 'for' expression
      // 'do' commands 'od' ) -> ^( FOR expression ^( COMMANDS commands ) ) | (
      // 'foreach' VARIABLE 'in' expression 'do' commands 'od' ) -> ^( FOREACH
      // VARIABLE expression ^( COMMANDS commands ) ) )
      int alt12 = 6;
      switch (input.LA(1)) {
        case 42: {
          alt12 = 1;
        }
          break;
        case VARIABLE: {
          alt12 = 2;
        }
          break;
        case 38: {
          alt12 = 3;
        }
          break;
        case 47: {
          alt12 = 4;
        }
          break;
        case 34: {
          alt12 = 5;
        }
          break;
        case 35: {
          alt12 = 6;
        }
          break;
        default:
          NoViableAltException nvae = new NoViableAltException("", 12, 0, input);
          throw nvae;
      }
      switch (alt12) {
        case 1:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:67:2: ( 'nop'
        // )
        {
          root_0 = (Object) adaptor.nil();

          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:67:2: ( 'nop'
          // )
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:67:3: 'nop'
          {
            string_literal45 = (Token) match(input, 42, FOLLOW_42_in_command437);
            string_literal45_tree = (Object) adaptor.create(string_literal45);
            adaptor.addChild(root_0, string_literal45_tree);

          }

        }
          break;
        case 2:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:68:4: ( vars
        // ':=' exprs )
        {
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:68:4: ( vars
          // ':=' exprs )
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:68:5: vars
          // ':=' exprs
          {
            pushFollow(FOLLOW_vars_in_command444);
            vars46 = vars();
            state._fsp--;

            stream_vars.add(vars46.getTree());
            string_literal47 = (Token) match(input, 27, FOLLOW_27_in_command446);
            stream_27.add(string_literal47);

            pushFollow(FOLLOW_exprs_in_command448);
            exprs48 = exprs();
            state._fsp--;

            stream_exprs.add(exprs48.getTree());
          }

          // AST REWRITE
          // elements: exprs, vars
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 68:22: -> ^( ASSIGN vars exprs )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:68:25: ^(
            // ASSIGN vars exprs )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(ASSIGN, "ASSIGN"), root_1);
              adaptor.addChild(root_1, stream_vars.nextTree());
              adaptor.addChild(root_1, stream_exprs.nextTree());
              adaptor.addChild(root_0, root_1);
            }

          }

          retval.tree = root_0;

        }
          break;
        case 3:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:69:4: ( 'if'
        // expression 'then' commands ( 'else' commands )? 'fi' )
        {
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:69:4: ( 'if'
          // expression 'then' commands ( 'else' commands )? 'fi' )
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:69:5: 'if'
          // expression 'then' commands ( 'else' commands )? 'fi'
          {
            string_literal49 = (Token) match(input, 38, FOLLOW_38_in_command465);
            stream_38.add(string_literal49);

            pushFollow(FOLLOW_expression_in_command467);
            expression50 = expression();
            state._fsp--;

            stream_expression.add(expression50.getTree());
            string_literal51 = (Token) match(input, 45, FOLLOW_45_in_command469);
            stream_45.add(string_literal51);

            pushFollow(FOLLOW_commands_in_command471);
            commands52 = commands();
            state._fsp--;

            stream_commands.add(commands52.getTree());
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:69:37: (
            // 'else' commands )?
            int alt11 = 2;
            int LA11_0 = input.LA(1);
            if ((LA11_0 == 32)) {
              alt11 = 1;
            }
            switch (alt11) {
              case 1:
              // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:69:38: 'else'
              // commands
              {
                string_literal53 = (Token) match(input, 32, FOLLOW_32_in_command474);
                stream_32.add(string_literal53);

                pushFollow(FOLLOW_commands_in_command476);
                commands54 = commands();
                state._fsp--;

                stream_commands.add(commands54.getTree());
              }
                break;

            }

            string_literal55 = (Token) match(input, 33, FOLLOW_33_in_command480);
            stream_33.add(string_literal55);

          }

          // AST REWRITE
          // elements: expression, commands, commands
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 69:62: -> ^( IF expression ^( COMMANDS commands ) ( ^( COMMANDS commands ) )?
          // )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:69:65: ^( IF
            // expression ^( COMMANDS commands ) ( ^( COMMANDS commands ) )? )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(IF, "IF"), root_1);
              adaptor.addChild(root_1, stream_expression.nextTree());
              // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:69:81: ^(
              // COMMANDS commands )
              {
                Object root_2 = (Object) adaptor.nil();
                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(COMMANDS, "COMMANDS"), root_2);
                adaptor.addChild(root_2, stream_commands.nextTree());
                adaptor.addChild(root_1, root_2);
              }

              // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:69:102: ( ^(
              // COMMANDS commands ) )?
              if (stream_commands.hasNext()) {
                // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:69:102: ^(
                // COMMANDS commands )
                {
                  Object root_2 = (Object) adaptor.nil();
                  root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(COMMANDS, "COMMANDS"), root_2);
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
        case 4:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:70:4: (
        // 'while' expression 'do' commands 'od' )
        {
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:70:4: (
          // 'while' expression 'do' commands 'od' )
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:70:5: 'while'
          // expression 'do' commands 'od'
          {
            string_literal56 = (Token) match(input, 47, FOLLOW_47_in_command508);
            stream_47.add(string_literal56);

            pushFollow(FOLLOW_expression_in_command510);
            expression57 = expression();
            state._fsp--;

            stream_expression.add(expression57.getTree());
            string_literal58 = (Token) match(input, 31, FOLLOW_31_in_command512);
            stream_31.add(string_literal58);

            pushFollow(FOLLOW_commands_in_command514);
            commands59 = commands();
            state._fsp--;

            stream_commands.add(commands59.getTree());
            string_literal60 = (Token) match(input, 43, FOLLOW_43_in_command516);
            stream_43.add(string_literal60);

          }

          // AST REWRITE
          // elements: expression, commands
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 70:44: -> ^( WHILE expression ^( COMMANDS commands ) )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:70:47: ^(
            // WHILE expression ^( COMMANDS commands ) )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(WHILE, "WHILE"), root_1);
              adaptor.addChild(root_1, stream_expression.nextTree());
              // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:70:66: ^(
              // COMMANDS commands )
              {
                Object root_2 = (Object) adaptor.nil();
                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(COMMANDS, "COMMANDS"), root_2);
                adaptor.addChild(root_2, stream_commands.nextTree());
                adaptor.addChild(root_1, root_2);
              }

              adaptor.addChild(root_0, root_1);
            }

          }

          retval.tree = root_0;

        }
          break;
        case 5:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:71:4: ( 'for'
        // expression 'do' commands 'od' )
        {
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:71:4: ( 'for'
          // expression 'do' commands 'od' )
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:71:5: 'for'
          // expression 'do' commands 'od'
          {
            string_literal61 = (Token) match(input, 34, FOLLOW_34_in_command537);
            stream_34.add(string_literal61);

            pushFollow(FOLLOW_expression_in_command539);
            expression62 = expression();
            state._fsp--;

            stream_expression.add(expression62.getTree());
            string_literal63 = (Token) match(input, 31, FOLLOW_31_in_command541);
            stream_31.add(string_literal63);

            pushFollow(FOLLOW_commands_in_command543);
            commands64 = commands();
            state._fsp--;

            stream_commands.add(commands64.getTree());
            string_literal65 = (Token) match(input, 43, FOLLOW_43_in_command545);
            stream_43.add(string_literal65);

          }

          // AST REWRITE
          // elements: expression, commands
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 71:42: -> ^( FOR expression ^( COMMANDS commands ) )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:71:45: ^( FOR
            // expression ^( COMMANDS commands ) )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(FOR, "FOR"), root_1);
              adaptor.addChild(root_1, stream_expression.nextTree());
              // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:71:62: ^(
              // COMMANDS commands )
              {
                Object root_2 = (Object) adaptor.nil();
                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(COMMANDS, "COMMANDS"), root_2);
                adaptor.addChild(root_2, stream_commands.nextTree());
                adaptor.addChild(root_1, root_2);
              }

              adaptor.addChild(root_0, root_1);
            }

          }

          retval.tree = root_0;

        }
          break;
        case 6:
        // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:72:4: (
        // 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
        {
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:72:4: (
          // 'foreach' VARIABLE 'in' expression 'do' commands 'od' )
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:72:5:
          // 'foreach' VARIABLE 'in' expression 'do' commands 'od'
          {
            string_literal66 = (Token) match(input, 35, FOLLOW_35_in_command566);
            stream_35.add(string_literal66);

            VARIABLE67 = (Token) match(input, VARIABLE, FOLLOW_VARIABLE_in_command568);
            stream_VARIABLE.add(VARIABLE67);

            string_literal68 = (Token) match(input, 39, FOLLOW_39_in_command570);
            stream_39.add(string_literal68);

            pushFollow(FOLLOW_expression_in_command572);
            expression69 = expression();
            state._fsp--;

            stream_expression.add(expression69.getTree());
            string_literal70 = (Token) match(input, 31, FOLLOW_31_in_command574);
            stream_31.add(string_literal70);

            pushFollow(FOLLOW_commands_in_command576);
            commands71 = commands();
            state._fsp--;

            stream_commands.add(commands71.getTree());
            string_literal72 = (Token) match(input, 43, FOLLOW_43_in_command578);
            stream_43.add(string_literal72);

          }

          // AST REWRITE
          // elements: commands, VARIABLE, expression
          // token labels:
          // rule labels: retval
          // token list labels:
          // rule list labels:
          // wildcard labels:
          retval.tree = root_0;
          RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
              retval != null ? retval.getTree() : null);

          root_0 = (Object) adaptor.nil();
          // 72:60: -> ^( FOREACH VARIABLE expression ^( COMMANDS commands ) )
          {
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:72:63: ^(
            // FOREACH VARIABLE expression ^( COMMANDS commands ) )
            {
              Object root_1 = (Object) adaptor.nil();
              root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(FOREACH, "FOREACH"), root_1);
              adaptor.addChild(root_1, stream_VARIABLE.nextNode());
              adaptor.addChild(root_1, stream_expression.nextTree());
              // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:72:93: ^(
              // COMMANDS commands )
              {
                Object root_2 = (Object) adaptor.nil();
                root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(COMMANDS, "COMMANDS"), root_2);
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

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "command"

  public static class definition_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "definition"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:74:1:
  // definition : 'read' input '%' commands '%' 'write' output -> ^( DEFINITION
  // input ^( COMMANDS commands ) ^( OUTPUT output ) ) ;
  public final WhileParser.definition_return definition() throws RecognitionException {
    WhileParser.definition_return retval = new WhileParser.definition_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token string_literal73 = null;
    Token char_literal75 = null;
    Token char_literal77 = null;
    Token string_literal78 = null;
    ParserRuleReturnScope input74 = null;
    ParserRuleReturnScope commands76 = null;
    ParserRuleReturnScope output79 = null;

    Object string_literal73_tree = null;
    Object char_literal75_tree = null;
    Object char_literal77_tree = null;
    Object string_literal78_tree = null;
    RewriteRuleTokenStream stream_44 = new RewriteRuleTokenStream(adaptor, "token 44");
    RewriteRuleTokenStream stream_22 = new RewriteRuleTokenStream(adaptor, "token 22");
    RewriteRuleTokenStream stream_48 = new RewriteRuleTokenStream(adaptor, "token 48");
    RewriteRuleSubtreeStream stream_output = new RewriteRuleSubtreeStream(adaptor, "rule output");
    RewriteRuleSubtreeStream stream_input = new RewriteRuleSubtreeStream(adaptor, "rule input");
    RewriteRuleSubtreeStream stream_commands = new RewriteRuleSubtreeStream(adaptor, "rule commands");

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:74:12: (
      // 'read' input '%' commands '%' 'write' output -> ^( DEFINITION input ^(
      // COMMANDS commands ) ^( OUTPUT output ) ) )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:75:2: 'read'
      // input '%' commands '%' 'write' output
      {
        string_literal73 = (Token) match(input, 44, FOLLOW_44_in_definition605);
        stream_44.add(string_literal73);

        pushFollow(FOLLOW_input_in_definition607);
        input74 = input();
        state._fsp--;

        stream_input.add(input74.getTree());
        char_literal75 = (Token) match(input, 22, FOLLOW_22_in_definition609);
        stream_22.add(char_literal75);

        pushFollow(FOLLOW_commands_in_definition611);
        commands76 = commands();
        state._fsp--;

        stream_commands.add(commands76.getTree());
        char_literal77 = (Token) match(input, 22, FOLLOW_22_in_definition613);
        stream_22.add(char_literal77);

        string_literal78 = (Token) match(input, 48, FOLLOW_48_in_definition615);
        stream_48.add(string_literal78);

        pushFollow(FOLLOW_output_in_definition617);
        output79 = output();
        state._fsp--;

        stream_output.add(output79.getTree());
        // AST REWRITE
        // elements: input, commands, output
        // token labels:
        // rule labels: retval
        // token list labels:
        // rule list labels:
        // wildcard labels:
        retval.tree = root_0;
        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
            retval != null ? retval.getTree() : null);

        root_0 = (Object) adaptor.nil();
        // 75:47: -> ^( DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
        {
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:75:50: ^(
          // DEFINITION input ^( COMMANDS commands ) ^( OUTPUT output ) )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(DEFINITION, "DEFINITION"), root_1);
            adaptor.addChild(root_1, stream_input.nextTree());
            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:75:69: ^(
            // COMMANDS commands )
            {
              Object root_2 = (Object) adaptor.nil();
              root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(COMMANDS, "COMMANDS"), root_2);
              adaptor.addChild(root_2, stream_commands.nextTree());
              adaptor.addChild(root_1, root_2);
            }

            // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:75:90: ^(
            // OUTPUT output )
            {
              Object root_2 = (Object) adaptor.nil();
              root_2 = (Object) adaptor.becomeRoot((Object) adaptor.create(OUTPUT, "OUTPUT"), root_2);
              adaptor.addChild(root_2, stream_output.nextTree());
              adaptor.addChild(root_1, root_2);
            }

            adaptor.addChild(root_0, root_1);
          }

        }

        retval.tree = root_0;

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "definition"

  public static class function_return extends ParserRuleReturnScope {
    Object tree;

    @Override
    public Object getTree() {
      return tree;
    }
  };

  // $ANTLR start "function"
  // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:77:1:
  // function : 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition
  // ) ;
  public final WhileParser.function_return function() throws RecognitionException {
    WhileParser.function_return retval = new WhileParser.function_return();
    retval.start = input.LT(1);

    Object root_0 = null;

    Token string_literal80 = null;
    Token SYMBOL81 = null;
    Token char_literal82 = null;
    ParserRuleReturnScope definition83 = null;

    Object string_literal80_tree = null;
    Object SYMBOL81_tree = null;
    Object char_literal82_tree = null;
    RewriteRuleTokenStream stream_36 = new RewriteRuleTokenStream(adaptor, "token 36");
    RewriteRuleTokenStream stream_SYMBOL = new RewriteRuleTokenStream(adaptor, "token SYMBOL");
    RewriteRuleTokenStream stream_26 = new RewriteRuleTokenStream(adaptor, "token 26");
    RewriteRuleSubtreeStream stream_definition = new RewriteRuleSubtreeStream(adaptor, "rule definition");

    try {
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:77:10: (
      // 'function' SYMBOL ':' definition -> ^( FUNCTION SYMBOL definition ) )
      // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:78:2:
      // 'function' SYMBOL ':' definition
      {
        string_literal80 = (Token) match(input, 36, FOLLOW_36_in_function647);
        stream_36.add(string_literal80);

        SYMBOL81 = (Token) match(input, SYMBOL, FOLLOW_SYMBOL_in_function649);
        stream_SYMBOL.add(SYMBOL81);

        char_literal82 = (Token) match(input, 26, FOLLOW_26_in_function651);
        stream_26.add(char_literal82);

        pushFollow(FOLLOW_definition_in_function653);
        definition83 = definition();
        state._fsp--;

        stream_definition.add(definition83.getTree());
        // AST REWRITE
        // elements: definition, SYMBOL
        // token labels:
        // rule labels: retval
        // token list labels:
        // rule list labels:
        // wildcard labels:
        retval.tree = root_0;
        RewriteRuleSubtreeStream stream_retval = new RewriteRuleSubtreeStream(adaptor, "rule retval",
            retval != null ? retval.getTree() : null);

        root_0 = (Object) adaptor.nil();
        // 78:35: -> ^( FUNCTION SYMBOL definition )
        {
          // /home/caeles/Documents/Cours/ESIR2/TLC/Projet/grammaire/While.g:78:38: ^(
          // FUNCTION SYMBOL definition )
          {
            Object root_1 = (Object) adaptor.nil();
            root_1 = (Object) adaptor.becomeRoot((Object) adaptor.create(FUNCTION, "FUNCTION"), root_1);
            adaptor.addChild(root_1, stream_SYMBOL.nextNode());
            adaptor.addChild(root_1, stream_definition.nextTree());
            adaptor.addChild(root_0, root_1);
          }

        }

        retval.tree = root_0;

      }

      retval.stop = input.LT(-1);

      retval.tree = (Object) adaptor.rulePostProcessing(root_0);
      adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

    } catch (RecognitionException re) {
      reportError(re);
      recover(input, re);
      retval.tree = (Object) adaptor.errorNode(input, retval.start, input.LT(-1), re);
    } finally {
      // do for sure before leaving
    }
    return retval;
  }
  // $ANTLR end "function"

  // Delegated rules

  public static final BitSet FOLLOW_function_in_program93 = new BitSet(new long[] { 0x0000001000000002L });
  public static final BitSet FOLLOW_program_in_program95 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_set_in_exprBase172 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_23_in_exprBase187 = new BitSet(new long[] { 0x0000000040000000L });
  public static final BitSet FOLLOW_30_in_exprBase189 = new BitSet(new long[] { 0x0000020001920000L });
  public static final BitSet FOLLOW_lExpr_in_exprBase191 = new BitSet(new long[] { 0x0000000001000000L });
  public static final BitSet FOLLOW_24_in_exprBase193 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_23_in_exprBase206 = new BitSet(new long[] { 0x0000010000000000L });
  public static final BitSet FOLLOW_40_in_exprBase208 = new BitSet(new long[] { 0x0000020001920000L });
  public static final BitSet FOLLOW_lExpr_in_exprBase210 = new BitSet(new long[] { 0x0000000001000000L });
  public static final BitSet FOLLOW_24_in_exprBase212 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_23_in_exprBase225 = new BitSet(new long[] { 0x0000002000000000L });
  public static final BitSet FOLLOW_37_in_exprBase227 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_exprBase_in_exprBase229 = new BitSet(new long[] { 0x0000000001000000L });
  public static final BitSet FOLLOW_24_in_exprBase231 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_23_in_exprBase244 = new BitSet(new long[] { 0x0000400000000000L });
  public static final BitSet FOLLOW_46_in_exprBase246 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_exprBase_in_exprBase248 = new BitSet(new long[] { 0x0000000001000000L });
  public static final BitSet FOLLOW_24_in_exprBase250 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_23_in_exprBase263 = new BitSet(new long[] { 0x0000000000020000L });
  public static final BitSet FOLLOW_SYMBOL_in_exprBase265 = new BitSet(new long[] { 0x0000020001920000L });
  public static final BitSet FOLLOW_lExpr_in_exprBase267 = new BitSet(new long[] { 0x0000000001000000L });
  public static final BitSet FOLLOW_24_in_exprBase269 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_exprBase_in_lExpr288 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_lExpr_in_lExpr290 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_exprBase_in_expression301 = new BitSet(new long[] { 0x0000000020000002L });
  public static final BitSet FOLLOW_29_in_expression304 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_exprBase_in_expression306 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_VARIABLE_in_vars328 = new BitSet(new long[] { 0x0000000002000002L });
  public static final BitSet FOLLOW_25_in_vars331 = new BitSet(new long[] { 0x0000000000100000L });
  public static final BitSet FOLLOW_vars_in_vars334 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_expression_in_exprs345 = new BitSet(new long[] { 0x0000000002000002L });
  public static final BitSet FOLLOW_25_in_exprs348 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_exprs_in_exprs351 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_VARIABLE_in_output363 = new BitSet(new long[] { 0x0000000002000002L });
  public static final BitSet FOLLOW_25_in_output366 = new BitSet(new long[] { 0x0000000000100000L });
  public static final BitSet FOLLOW_output_in_output369 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_VARIABLE_in_inputSub381 = new BitSet(new long[] { 0x0000000002000002L });
  public static final BitSet FOLLOW_25_in_inputSub384 = new BitSet(new long[] { 0x0000000000100000L });
  public static final BitSet FOLLOW_inputSub_in_inputSub387 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_inputSub_in_input398 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_command_in_commands417 = new BitSet(new long[] { 0x0000000010000002L });
  public static final BitSet FOLLOW_28_in_commands420 = new BitSet(new long[] { 0x0000844C00100000L });
  public static final BitSet FOLLOW_commands_in_commands423 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_42_in_command437 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_vars_in_command444 = new BitSet(new long[] { 0x0000000008000000L });
  public static final BitSet FOLLOW_27_in_command446 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_exprs_in_command448 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_38_in_command465 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_expression_in_command467 = new BitSet(new long[] { 0x0000200000000000L });
  public static final BitSet FOLLOW_45_in_command469 = new BitSet(new long[] { 0x0000844C00100000L });
  public static final BitSet FOLLOW_commands_in_command471 = new BitSet(new long[] { 0x0000000300000000L });
  public static final BitSet FOLLOW_32_in_command474 = new BitSet(new long[] { 0x0000844C00100000L });
  public static final BitSet FOLLOW_commands_in_command476 = new BitSet(new long[] { 0x0000000200000000L });
  public static final BitSet FOLLOW_33_in_command480 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_47_in_command508 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_expression_in_command510 = new BitSet(new long[] { 0x0000000080000000L });
  public static final BitSet FOLLOW_31_in_command512 = new BitSet(new long[] { 0x0000844C00100000L });
  public static final BitSet FOLLOW_commands_in_command514 = new BitSet(new long[] { 0x0000080000000000L });
  public static final BitSet FOLLOW_43_in_command516 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_34_in_command537 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_expression_in_command539 = new BitSet(new long[] { 0x0000000080000000L });
  public static final BitSet FOLLOW_31_in_command541 = new BitSet(new long[] { 0x0000844C00100000L });
  public static final BitSet FOLLOW_commands_in_command543 = new BitSet(new long[] { 0x0000080000000000L });
  public static final BitSet FOLLOW_43_in_command545 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_35_in_command566 = new BitSet(new long[] { 0x0000000000100000L });
  public static final BitSet FOLLOW_VARIABLE_in_command568 = new BitSet(new long[] { 0x0000008000000000L });
  public static final BitSet FOLLOW_39_in_command570 = new BitSet(new long[] { 0x0000020000920000L });
  public static final BitSet FOLLOW_expression_in_command572 = new BitSet(new long[] { 0x0000000080000000L });
  public static final BitSet FOLLOW_31_in_command574 = new BitSet(new long[] { 0x0000844C00100000L });
  public static final BitSet FOLLOW_commands_in_command576 = new BitSet(new long[] { 0x0000080000000000L });
  public static final BitSet FOLLOW_43_in_command578 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_44_in_definition605 = new BitSet(new long[] { 0x0000000000500000L });
  public static final BitSet FOLLOW_input_in_definition607 = new BitSet(new long[] { 0x0000000000400000L });
  public static final BitSet FOLLOW_22_in_definition609 = new BitSet(new long[] { 0x0000844C00100000L });
  public static final BitSet FOLLOW_commands_in_definition611 = new BitSet(new long[] { 0x0000000000400000L });
  public static final BitSet FOLLOW_22_in_definition613 = new BitSet(new long[] { 0x0001000000000000L });
  public static final BitSet FOLLOW_48_in_definition615 = new BitSet(new long[] { 0x0000000000100000L });
  public static final BitSet FOLLOW_output_in_definition617 = new BitSet(new long[] { 0x0000000000000002L });
  public static final BitSet FOLLOW_36_in_function647 = new BitSet(new long[] { 0x0000000000020000L });
  public static final BitSet FOLLOW_SYMBOL_in_function649 = new BitSet(new long[] { 0x0000000004000000L });
  public static final BitSet FOLLOW_26_in_function651 = new BitSet(new long[] { 0x0000100000000000L });
  public static final BitSet FOLLOW_definition_in_function653 = new BitSet(new long[] { 0x0000000000000002L });
}
