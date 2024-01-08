package tlc.generator;

import tlc.util.Quadruplet;

public class Variable extends Instruction{

    public Variable(Quadruplet quad) {
        super(quad);
    }

    public String toString(){
        String s = "Node "+ quad.arg1+";";
        return s;
    }
    
}
