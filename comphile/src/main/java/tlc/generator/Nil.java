package tlc.generator;

import tlc.util.Quadruplet;

public class Nil extends Instruction{

    public Nil(Quadruplet quad) {
        super(quad);
    }
    
    public String toString() {
        String s = "Node " + quad.res +"; //NIL";
        return s;
      }
}
