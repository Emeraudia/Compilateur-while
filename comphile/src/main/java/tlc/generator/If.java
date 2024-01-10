package tlc.generator;

import java.util.ArrayList;
import java.util.List;

import tlc.util.Quadruplet;

public class If extends Block {

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

    public void setInElse(boolean b){
        this.inElse = b;
    }

    public String toString() {
        String s = "if(Node::asBoolean(" + this.quad.arg1 + "))\n{\n";
        for (Instruction ins : instructions) {
            s += ins + "\n";
        }
        s += "}";
        if(this.elseInstructions.size() > 0){
            s += "else{\n";
            for (Instruction ins : elseInstructions) {
                s += ins + "\n";
            }
            s += "}";
        }
        return s;
    }

}
