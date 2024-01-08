package tlc.generator;

import tlc.util.Quadruplet;

public class Assign extends Instruction{

    private boolean isVariableAssignment;

    public Assign(Quadruplet quad) {
        super(quad);
        this.isVariableAssignment = false;
    }

    public Assign(Quadruplet quad, boolean isVariableAssignment){
        this(quad);
        this.isVariableAssignment = isVariableAssignment;
    }

    public String toString() {
        String s = "";
        if(!this.isVariableAssignment){
            s += "Node ";
        }
        s += quad.arg1 +" = "+quad.arg2+";";
        return s;
    }
    
}
