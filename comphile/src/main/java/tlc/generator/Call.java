package tlc.generator;

import tlc.util.Quadruplet;

public class Call extends Instruction{

    public Call(Quadruplet quad) {
        super(quad);
    }

    public String toString() {
        String s = "Node " + quad.res +" = function_"+quad.arg1+"();";
        return s;
    }
   
}