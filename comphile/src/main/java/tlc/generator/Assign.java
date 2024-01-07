package tlc.generator;

import tlc.util.Quadruplet;

public class Assign extends Instruction{

    public Assign(Quadruplet quad) {
        super(quad);
    }

    public String toString() {
        String s = "Node " + quad.arg1 +" = "+quad.arg2+";";
        return s;
    }
    
}
