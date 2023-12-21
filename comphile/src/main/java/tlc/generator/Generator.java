package tlc.generator;

import java.util.ArrayList;
import java.util.List;

import tlc.util.Quadruplet;

public class Generator {
  private List<Quadruplet> m_3adress;

  public Generator(List<Quadruplet> m_3adress) {
    this.m_3adress = m_3adress;
  }

  public void generate() {
    List<Instruction> functions = new ArrayList<>();
    for (int i = 0; i < m_3adress.size(); i++) {
      Quadruplet currentInstruction = m_3adress.get(i);
      System.out
          .println(currentInstruction.op + ": " + currentInstruction.arg1 + ", " + currentInstruction.arg2 + " -> "
              + currentInstruction.res);
      if (currentInstruction.op.equals("FUNCTION")) {
        Function func = new Function(currentInstruction);
        functions.add(func);
      }
    }
    System.out.println("\nLE CODE CPLOUSPLOUS !! \n");
    for (Instruction func : functions) {
      System.out.println(func);
    }
  }
}
