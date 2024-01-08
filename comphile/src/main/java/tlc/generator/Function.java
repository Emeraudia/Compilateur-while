package tlc.generator;

import java.util.ArrayList;
import java.util.List;

import tlc.util.Quadruplet;

public class Function extends Block {

  private List<String> inputs;

  public Function(Quadruplet quad) {
    super(quad);
    this.inputs = new ArrayList<>();
  }

  public void addInput(String s) {
    this.inputs.add(s);
  }

  public String toString() {
    String input_strings = "";
    for(int i=0; i<inputs.size(); i++){
      input_strings += "Node " + inputs.get(i);
      if(i < inputs.size() - 1){
        input_strings += ", ";
      }
    }
    String s = "Node function_" + quad.arg1 + "("+input_strings+")\n{\n";
    for (Instruction ins : instructions) {
      s += "\t"+  ins + "\n";
    }
    s += "}\n";
    return s;
  }
}
