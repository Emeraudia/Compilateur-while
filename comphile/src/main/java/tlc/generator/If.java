package tlc.generator;

import java.util.ArrayList;
import java.util.List;

import tlc.util.Quadruplet;

public class If extends Block {

    private String test;
    private boolean inElse;
    private List<Instruction> elseInstructions;

    public If(Quadruplet quad) {
        super(quad);
        inElse = false;
        this.elseInstructions = new ArrayList<>();

    }

    @Override
    public void addInstruction(Instruction instruction) {
        if(!inElse){
            super.addInstruction(instruction);
        }else{
            this.elseInstructions.add(instruction);
        }
    }

    public void setTestVariable(String test) {
        this.test = test;
    }

    public void setInElse(boolean b){
        this.inElse = b;
    }

    public String toString() {
        String s = "if(Node::asBoolean(" + this.test + "))\n{\n";
        for (Instruction ins : instructions) {
            s += "\t" + ins + "\n";
        }
        s += "}";
        if(this.elseInstructions.size() > 0){
            s += "else {\n";
            for (Instruction ins : elseInstructions) {
                s += "\t" + ins + "\n";
            }
            s += "}";
        }
        return s;
    }

}
