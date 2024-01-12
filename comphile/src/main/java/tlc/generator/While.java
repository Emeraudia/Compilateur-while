package tlc.generator;

import tlc.util.Quadruplet;

public class While extends Block {

    public While(Quadruplet quad) {
        super(quad);
    }

    public String toString(){
        String s = "while(Node::asBoolean(" + this.quad.arg1 + "))\n{\n";
        for (Instruction ins : instructions) {
            s += ins + "\n";
        }
        s += "}";
        return s;
    }
}
