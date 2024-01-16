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
    String s;
    if(quad.arg1.equals("main")) {
      s = "int main(int argc, char *argv[])\n{\n";
      s += "if(argc != "+inputs.size()+") return 0;\n";
      for(int i=0; i<inputs.size(); i++){
        s += "Node " + inputs.get(i)+" = Node::castInput(argv["+i+"]);\n";
      }
    }
    else s = "Node function_" + quad.arg1 + "("+input_strings+")\n{\n";
    for (Instruction ins : instructions) {
      s += ins + "\n";
    }
    s += "}\n";
    return s;
  }
}
