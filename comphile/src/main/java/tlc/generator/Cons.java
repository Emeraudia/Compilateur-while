package tlc.generator;

import tlc.util.Quadruplet;

public class Cons extends Instruction{

    public Cons(Quadruplet quad) {
        super(quad);
    }
    
    public String toString() {
        String s = "// CONS\n";
        s+= "\t" + "Node " + quad.res +";\n";
        s+= "\t" + quad.res + ".setLeftChild("+quad.arg1+");\n";
        s+= "\t" + quad.res + ".setRightChild("+quad.arg2+");";
        return s;
    }
}
