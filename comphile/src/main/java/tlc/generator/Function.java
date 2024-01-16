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
      for (Instruction ins : instructions) {
        if(ins.quad.op != null && ins.quad.op.equals("OUTPUT")) s += "Node::pp("+ins.quad.arg1+")\n";
        else s += ins + "\n";
      }
    }
    else
    {
      s = "Node function_" + quad.arg1 + "("+input_strings+")\n{\n";
      for (Instruction ins : instructions) {
        s += ins + "\n";
      }
    }
    s+="return 0;\n";
    s += "}\n";
    return s;
  }
}
