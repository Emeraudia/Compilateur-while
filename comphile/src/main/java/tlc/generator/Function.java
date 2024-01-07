package tlc.generator;

import java.util.ArrayList;
import java.util.List;

import tlc.util.Quadruplet;

public class Function extends Instruction {

  private List<Instruction> instructions;

  public Function(Quadruplet quad) {
    super(quad);
    this.instructions = new ArrayList<>();
  }

  public void addInstruction(Instruction instruction) {
    this.instructions.add(instruction);
  }

  public String toString() {
    String s = "Node function_" + quad.arg1 + "()\n{\n";
    for (Instruction ins : instructions) {
      s += "\t"+  ins + "\n";
    }
    s += "}\n";
    return s;
  }
}
