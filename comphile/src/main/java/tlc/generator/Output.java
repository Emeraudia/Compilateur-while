package tlc.generator;

import tlc.util.Quadruplet;

public class Output extends Instruction{

    public Output(Quadruplet quad) {
        super(quad);
    }
    
    public String toString() {
        String s = "return " + quad.arg1 + ";";
        return s;
    }
}
