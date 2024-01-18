package tlc.projet;

import static org.junit.Assert.assertEquals;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.MissingTokenException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.UnwantedTokenException;
import org.antlr.runtime.tree.CommonTree;
import org.junit.Test;

import tlc.antlr.WhileLexer;
import tlc.antlr.WhileParser;
import tlc.code3adress.*;

public class code3AdressTest {
    @Test
    public void recurBuild_empyMain() throws RecognitionException {
        String Data = """
                function main :
                read
                %
                    Result := nil
                %
                write Result
                    """;
        String wanted3A = "[FUNC_BEGIN|op0|main|null]"+
                            "[VARIABLE|op1|Result|null]"+
                            "[NIL|op2|null|null]"+
                            "[EXPR|op3|op2|null]"+
                            "[ASSIGN|op4|op1|op3]"+
                            "[COMMAND|op5|op4|null]"+
                            "[VARIABLE|op6|Result|null]"+
                            "[OUTPUT|op7|op6|null]"+
                            "[FUNC_END|op8|null|null]";
        String code3A = parse(Data);
        assertEquals(wanted3A, code3A);
    }

    @Test
    public void recurBuild_empyMultiInput() throws RecognitionException {
        String Data = """
                function main :
                read Op1, Op2
                %
                    Op1 := (cons Op1 Op2)
                %
                write Op1
                    """;
        String wanted3A = "[FUNC_BEGIN|op0|main|null]"+
                            "[VARIABLE|op1|Op1|null]"+
                            "[INPUT|op2|op1|null]"+
                            "[VARIABLE|op3|Op2|null]"+
                            "[INPUT|op4|op3|null]"+
                            "[VARIABLE|op5|Op1|null]"+
                            "[VARIABLE|op6|Op1|null]"+
                            "[VARIABLE|op7|Op2|null]"+
                            "[CONS|op8|op6|op7]"+
                            "[EXPR|op9|op8|null]"+
                            "[ASSIGN|op10|op5|op9]"+
                            "[COMMAND|op11|op10|null]"+
                            "[VARIABLE|op12|Op1|null]"+
                            "[OUTPUT|op13|op12|null]"+
                            "[FUNC_END|op14|null|null]";
        String code3A = parse(Data);
        assertEquals(wanted3A, code3A);
    }

    @Test
    public void recurBuild_IF() throws RecognitionException {
        String Data = """
        function main:
        read R1, R2
        %
            if R1 then
                Test:=(cons R1 est vrai)
            fi
        %
        write Test
            """;
        String wanted3A = "[FUNC_BEGIN|op0|main|null]"+
                            "[VARIABLE|op1|R1|null]"+
                            "[INPUT|op2|op1|null]"+
                            "[VARIABLE|op3|R2|null]"+
                            "[INPUT|op4|op3|null]"+
                            "[VARIABLE|op5|R1|null]"+
                            "[EXPR|op6|op5|null]"+
                            "[IF|op7|op6|null]"+
                            "[VARIABLE|op8|Test|null]"+
                            "[VARIABLE|op9|R1|null]"+
                            "[STRING|op10|est|null]"+
                            "[CONS|op11|op9|op10]"+
                            "[EXPR|op12|op11|null]"+
                            "[ASSIGN|op13|op8|op12]"+
                            "[COMMAND|op14|op13|null]"+
                            "[END_IF|op15|null|null]"+
                            "[COMMAND|op16|op15|null]"+
                            "[VARIABLE|op17|Test|null]"+
                            "[OUTPUT|op18|op17|null]"+
                            "[FUNC_END|op19|null|null]";
        String code3A = parse(Data);
        assertEquals(wanted3A, code3A);
    }

    @Test
    public void recurBuild_FOR() throws RecognitionException {
        String Data = """
        function main :
        read MAX
        %
            ADD := nil;
        
            for MAX do
                ADD := (increment ADD)
            od
        
        %
        write ADD
                
        function increment :
        read OP
        %
            RESULT := (cons nil OP)
        %
        write RESULT
            """;
        String wanted3A = "[FUNC_BEGIN|op0|main|null]"+
                            "[VARIABLE|op1|MAX|null]"+
                            "[INPUT|op2|op1|null]"+
                            "[VARIABLE|op3|ADD|null]"+
                            "[NIL|op4|null|null]"+
                            "[EXPR|op5|op4|null]"+
                            "[ASSIGN|op6|op3|op5]"+
                            "[COMMAND|op7|op6|null]"+
                            "[VARIABLE|op8|MAX|null]"+
                            "[EXPR|op9|op8|null]"+
                            "[FOR|op10|op9|null]"+
                            "[VARIABLE|op11|ADD|null]"+
                            "[START_CALL|op12|increment|null]"+
                            "[VARIABLE|op13|ADD|null]"+
                            "[END_CALL|op14|increment|null]"+
                            "[EXPR|op15|op14|null]"+
                            "[ASSIGN|op16|op11|op15]"+
                            "[COMMAND|op17|op16|null]"+
                            "[END_FOR|op18|null|null]"+
                            "[COMMAND|op19|op18|null]"+
                            "[VARIABLE|op20|ADD|null]"+
                            "[OUTPUT|op21|op20|null]"+
                            "[FUNC_END|op22|null|null]"+
                            "[FUNC_BEGIN|op23|increment|null]"+
                            "[VARIABLE|op24|OP|null]"+
                            "[INPUT|op25|op24|null]"+
                            "[VARIABLE|op26|RESULT|null]"+
                            "[NIL|op27|null|null]"+
                            "[VARIABLE|op28|OP|null]"+
                            "[CONS|op29|op27|op28]"+
                            "[EXPR|op30|op29|null]"+
                            "[ASSIGN|op31|op26|op30]"+
                            "[COMMAND|op32|op31|null]"+
                            "[VARIABLE|op33|RESULT|null]"+
                            "[OUTPUT|op34|op33|null]"+
                            "[FUNC_END|op35|null|null]";
        String code3A = parse(Data);
        assertEquals(wanted3A, code3A);
    }

    @Test
    public void recurBuild_WHILE() throws RecognitionException {
        String Data = """

        function test:
        read R1, R2
        %
            while R1 do
                if R2 then
                    Test:=(increment nil)
                fi
            od
        %
        write Test

        function increment :
        read OP
        %
            RESULT := (cons nil OP)
        %
        write RESULT
                
        """;
        String wanted3A = "[FUNC_BEGIN|op0|test|null]"+
                            "[VARIABLE|op1|R1|null]"+
                            "[INPUT|op2|op1|null]"+
                            "[VARIABLE|op3|R2|null]"+
                            "[INPUT|op4|op3|null]"+
                            "[VARIABLE|op5|R1|null]"+
                            "[EXPR|op6|op5|null]"+
                            "[WHILE|op7|op6|null]"+
                            "[VARIABLE|op8|R2|null]"+
                            "[EXPR|op9|op8|null]"+
                            "[IF|op10|op9|null]"+
                            "[VARIABLE|op11|Test|null]"+
                            "[START_CALL|op12|increment|null]"+
                            "[NIL|op13|null|null]"+
                            "[END_CALL|op14|increment|null]"+
                            "[EXPR|op15|op14|null]"+
                            "[ASSIGN|op16|op11|op15]"+
                            "[COMMAND|op17|op16|null]"+
                            "[END_IF|op18|null|null]"+
                            "[COMMAND|op19|op18|null]"+
                            "[END_WHILE|op20|null|null]"+
                            "[COMMAND|op21|op20|null]"+
                            "[VARIABLE|op22|Test|null]"+
                            "[OUTPUT|op23|op22|null]"+
                            "[FUNC_END|op24|null|null]"+
                            "[FUNC_BEGIN|op25|increment|null]"+
                            "[VARIABLE|op26|OP|null]"+
                            "[INPUT|op27|op26|null]"+
                            "[VARIABLE|op28|RESULT|null]"+
                            "[NIL|op29|null|null]"+
                            "[VARIABLE|op30|OP|null]"+
                            "[CONS|op31|op29|op30]"+
                            "[EXPR|op32|op31|null]"+
                            "[ASSIGN|op33|op28|op32]"+
                            "[COMMAND|op34|op33|null]"+
                            "[VARIABLE|op35|RESULT|null]"+
                            "[OUTPUT|op36|op35|null]"+
                            "[FUNC_END|op37|null|null]";
        String code3A = parse(Data);
        assertEquals(wanted3A, code3A);
    }

    private String parse(String data) throws RecognitionException {

        CharStream stream = new ANTLRStringStream(data);
        WhileLexer lexer = new WhileLexer(stream);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        WhileParser parser = new WhileParser(tokens);

        WhileParser.program_return program = parser.program();

        if (parser.exceptions.size() == 0) {

            CommonTree tree = (CommonTree) program.getTree();

            Parser3A code3Adrresse = new Parser3A(tree);
            code3Adrresse.build();
            return code3Adrresse.toString();

        } else {
            for (Exception e : parser.exceptions) {
                System.out.println(e);
                if (e instanceof MismatchedTokenException) {
                    MismatchedTokenException exception = (MismatchedTokenException) e;
                    App.logger
                            .error("Mismatched token at line " + exception.line + " - unexpected: "
                                    + exception.token.getText());
                }
                if (e instanceof UnwantedTokenException) {
                    UnwantedTokenException exception = (UnwantedTokenException) e;
                    App.logger.error(
                            "Unwanted token at line " + exception.line + " - unwanted: " + exception.token.getText());
                }
                if (e instanceof MissingTokenException) {
                    MissingTokenException exception = (MissingTokenException) e;
                    App.logger
                            .error("Missing token at line " + exception.line + " - missing: "
                                    + WhileParser.tokenNames[exception.getMissingType()]);
                }
            }
        }
        return null;
    }
}
