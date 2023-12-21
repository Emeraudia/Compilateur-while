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
    String s = "Node " + quad.arg1 + "()\n{";
    for (Instruction ins : instructions) {
      s += ins + "\n";
    }
    s += "}\n";
    return s;
  }
}
