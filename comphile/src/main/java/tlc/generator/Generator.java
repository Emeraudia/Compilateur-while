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

    Stack<Call> callStack = new Stack<>();

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
      switch(currentInstruction.op){

        case "FUNC_BEGIN":
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
          break;

        case "VARIABLE":
          variables.put(currentInstruction.res, currentInstruction.arg1);
          if(callStack.size() > 0){
            callStack.peek().addParameter(currentInstruction.arg1);
          }
          break;
        
        case "NIL":
          Nil nil = new Nil(currentInstruction);
          blocks.peek().addInstruction(nil);
          break;
        
        case "CONS":
          Cons cons = new Cons(currentInstruction);
          blocks.peek().addInstruction(cons);
          break;
        
        case "TL":
          Tl tl = new Tl(currentInstruction);
          blocks.peek().addInstruction(tl);
          break;
        
        case "EXPR":
          if(arg1isVar){
            variables.put(currentInstruction.res, currentInstruction.arg1);
          }else{
            Expr expr = new Expr(currentInstruction);
            blocks.peek().addInstruction(expr);
          }
          break;
        
        case "ASSIGN":
          Assign assign = new Assign(currentInstruction, arg1isVar);
          blocks.peek().addInstruction(assign);
          break;

        case "OUTPUT":
          Output output = new Output(currentInstruction);
          blocks.peek().addInstruction(output);
          break;

        case "INPUT":
          ((Function) blocks.peek()).addInput(currentInstruction.arg1);
          break;

        case "IF":
          If instr_if = new If(currentInstruction);
          blocks.peek().addInstruction(instr_if);
          blocks.add(instr_if);
          break;

        case "ELSE":
          ((If) blocks.peek()).setInElse(true);
          break;

        case "END_IF":
          blocks.pop();
          break;

        case "START_CALL":
          callStack.add(new Call(currentInstruction));
          break;

        case "END_CALL":
          callStack.peek().setEndInstruction(currentInstruction.res);
          blocks.peek().addInstruction(callStack.peek());
          callStack.pop();
          if(callStack.size() > 0){
            callStack.peek().addParameter(currentInstruction.res);  
          }
          break;

        case "FOR":
          For instr_for = new For(currentInstruction);
          blocks.peek().addInstruction(instr_for);
          blocks.add(instr_for);
          break;

        case "END_FOR":
          blocks.pop();
          break;

        case "WHILE":
          While instr_while = new While(currentInstruction);
          blocks.peek().addInstruction(instr_while);
          blocks.add(instr_while);
          break;

        case "END_WHILE":
          blocks.pop();
          break;

        case "STRING":
          Text text = new Text(currentInstruction);
          blocks.peek().addInstruction(text);
          break;
      }
    }
    System.out.println("#include \"Node.cpp\"");
    for (Instruction func : functions) {
      System.out.println(func);
    }
  }
}
