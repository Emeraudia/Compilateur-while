package tlc.generator;

import tlc.util.Quadruplet;

public class Tl extends Instruction{

    public Tl(Quadruplet quad) {
        super(quad);
    }
    
    public String toString() {
        String s = "Node " + quad.res +" = "+quad.arg1+".getRightChild();";
        return s;
    }
}
