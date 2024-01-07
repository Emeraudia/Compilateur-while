package tlc.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tlc.util.Quadruplet;

public class Generator {
  private List<Quadruplet> m_3adress;

  public Generator(List<Quadruplet> m_3adress) {
    this.m_3adress = m_3adress;
  }

  public void generate() {
    List<Function> functions = new ArrayList<>();
    Map<String, String> variables = new HashMap<>();

    for (int i = 0; i < m_3adress.size(); i++) {
      Quadruplet currentInstruction = m_3adress.get(i);
      if(variables.containsKey(currentInstruction.arg1)){
        currentInstruction.arg1 = variables.get(currentInstruction.arg1);
      }
      if(variables.containsKey(currentInstruction.arg2)){
        currentInstruction.arg2 = variables.get(currentInstruction.arg2);
      }
      System.out
          .println(currentInstruction.op + ": " + currentInstruction.arg1 + ", " + currentInstruction.arg2 + " -> "
              + currentInstruction.res);
      if (currentInstruction.op.equals("FUNC_BEGIN")) {
        Function func = new Function(currentInstruction);
        functions.add(func);
      }
      if(currentInstruction.op.equals("VARIABLE")){
        variables.put(currentInstruction.res, currentInstruction.arg1);  
      }
      if(currentInstruction.op.equals("NIL")){
        Nil nil = new Nil(currentInstruction);
        functions.get(functions.size() - 1).addInstruction(nil);
      }
      if(currentInstruction.op.equals("CONS")){
        Cons cons = new Cons(currentInstruction);
        functions.get(functions.size() - 1).addInstruction(cons);
      }
      if(currentInstruction.op.equals("EXPR")){
        Expr expr = new Expr(currentInstruction);
        functions.get(functions.size() - 1).addInstruction(expr);
      }
      if(currentInstruction.op.equals("ASSIGN")){
        Assign assign = new Assign(currentInstruction);
        functions.get(functions.size() - 1).addInstruction(assign);
      }
      if(currentInstruction.op.equals("OUTPUT")){
        Output output = new Output(currentInstruction);
        functions.get(functions.size() - 1).addInstruction(output);
      }
    }
    for (Instruction func : functions) {
      System.out.println(func);
    }
  }
}
