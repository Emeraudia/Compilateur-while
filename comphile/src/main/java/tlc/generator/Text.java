package tlc.generator;

import tlc.util.Quadruplet;

public class Text extends Instruction{

    public Text(Quadruplet quad) {
        super(quad);
    }

    public String toString(){
        String s = "Node "+quad.res+"(\""+quad.arg1+"\");";
        return s;
    }
    
}
