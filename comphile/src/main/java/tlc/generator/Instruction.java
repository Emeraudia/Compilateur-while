package tlc.generator;

import tlc.util.Quadruplet;

public abstract class Instruction {
  protected Quadruplet quad;

  public Instruction(Quadruplet quad) {
    this.quad = quad;
  }

  public String toString() {
    return "nop";
  }
}
