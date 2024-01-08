package tlc.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import tlc.util.FunctionStack;
import tlc.util.Quadruplet;

public class Generator {
  private List<Quadruplet> m_3adress;
  List<FunctionStack> functionsStacks;

  public Generator(List<Quadruplet> m_3adress, List<FunctionStack> functionsStacks) {
    this.m_3adress = m_3adress;
    this.functionsStacks = functionsStacks;
  }

  public void generate() {
    List<Function> functions = new ArrayList<>();
    Stack<Block> blocks = new Stack<>();
    Map<String, String> variables = new HashMap<>();

    If currentIf = null;
    Call currentCall = null;
    For currentFor = null;

    for (int i = 0; i < m_3adress.size(); i++) {
      Quadruplet currentInstruction = m_3adress.get(i);
      boolean arg1isVar = false;
      boolean arg2isVar = false;


      if(variables.containsKey(currentInstruction.arg1)){
        currentInstruction.arg1 = variables.get(currentInstruction.arg1);
        arg1isVar = true;
      }
      if(variables.containsKey(currentInstruction.arg2)){
        currentInstruction.arg2 = variables.get(currentInstruction.arg2);
        arg2isVar = true;
      }
      System.out
          .println(currentInstruction.op + ": " + currentInstruction.arg1 + ", " + currentInstruction.arg2 + " -> "
              + currentInstruction.res);
      if (currentInstruction.op.equals("FUNC_BEGIN")) {
        Function func = new Function(currentInstruction);
        for(int j=0; j<functionsStacks.size(); j++){
          if(functionsStacks.get(j).getFunctionName().equals(currentInstruction.arg1)){
            FunctionStack currentStack = functionsStacks.get(j);
            System.out.println(currentStack.getFunctionName());
            
            System.out.println(currentStack.getSymbols().size());
            for(String var: currentStack.getSymbols().keySet()){
              System.out.println(var);

              Variable v = new Variable(new Quadruplet(null, null, var, null));
              func.addInstruction(v);
            }
            break;
          }
        }
      
        functions.add(func);
        blocks.add(func);
      }
      if(currentInstruction.op.equals("VARIABLE")){
        variables.put(currentInstruction.res, currentInstruction.arg1);
        if(currentCall != null){
          currentCall.addParameter(currentInstruction.arg1);
        }
      }
      if(currentInstruction.op.equals("NIL")){
        Nil nil = new Nil(currentInstruction);
        blocks.peek().addInstruction(nil);
      }
      if(currentInstruction.op.equals("CONS")){
        Cons cons = new Cons(currentInstruction);
        blocks.peek().addInstruction(cons);
      }
      if(currentInstruction.op.equals("EXPR")){
        if(currentIf != null){
          currentIf.setTestVariable(currentInstruction.arg1);
        } else if(currentFor != null){
          currentFor.setIterationsVariables(currentInstruction.arg1);
        } else {
          Expr expr = new Expr(currentInstruction);
          blocks.peek().addInstruction(expr);
        }
      }
      if(currentInstruction.op.equals("ASSIGN")){
        Assign assign = new Assign(currentInstruction, arg1isVar);
        blocks.peek().addInstruction(assign);
      }
      if(currentInstruction.op.equals("OUTPUT")){
        Output output = new Output(currentInstruction);
        blocks.peek().addInstruction(output);
      }
      if(currentInstruction.op.equals("INPUT")){
        ((Function) blocks.peek()).addInput(currentInstruction.arg1);;
      }
      if(currentInstruction.op.equals("IF")){
        If instr_if = new If(currentInstruction);
        currentIf = instr_if;
      }
      if(currentInstruction.op.equals("DO")){
        if(currentIf != null){
          blocks.peek().addInstruction(currentIf);
          blocks.add(currentIf);
          currentIf = null;
        }
        if(currentFor != null){
          blocks.peek().addInstruction(currentFor);
          blocks.add(currentFor);
          currentFor = null;
        }
      }
      if(currentInstruction.op.equals("ELSE")){
        ((If) blocks.peek()).setInElse(true);
      }
      if(currentInstruction.op.equals("END_IF")){
        blocks.pop();
      }
      if(currentInstruction.op.equals("START_CALL")){
        currentCall = new Call(currentInstruction);
      }

      if(currentInstruction.op.equals("END_CALL")){
        if(currentCall != null){
          currentCall.setEndInstruction(currentInstruction.res);
          blocks.peek().addInstruction(currentCall);
          currentCall = null;
        }
      }
      if(currentInstruction.op.equals("FOR")){
        For instr_for = new For(currentInstruction);
        currentFor = instr_for;
      }
      if(currentInstruction.op.equals("END_FOR")){
        blocks.pop();
      }
    }
    for (Instruction func : functions) {
      System.out.println(func);
    }
  }
}
