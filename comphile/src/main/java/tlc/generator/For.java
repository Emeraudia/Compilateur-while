package tlc.generator;

import java.util.List;

import tlc.util.Quadruplet;

public class For extends Block {


    public For(Quadruplet quad) {
        super(quad);
    }

    public String toString() {
        String i = this.quad.res;
        String s = "for(int " +i+"=0; "+i+"<Node::asInteger(" + this.quad.arg1 + "); "+i+"++)\n{\n";
        for (Instruction ins : instructions) {
            s += ins + "\n";
        }
        s += "}";
        return s;
    }

}
