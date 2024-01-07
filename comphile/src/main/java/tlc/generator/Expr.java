package tlc.generator;

import tlc.util.Quadruplet;

public class Expr extends Instruction{

    public Expr(Quadruplet quad) {
        super(quad);
    }
    
    public String toString() {
        String s = "Node " + quad.res +" = "+quad.arg1+";";
        return s;
    }
}
