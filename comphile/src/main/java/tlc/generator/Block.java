package tlc.generator;

import java.util.ArrayList;
import java.util.List;

import tlc.util.Quadruplet;

public class Block extends Instruction{

    protected List<Instruction> instructions;

    public Block(Quadruplet quad) {
        super(quad);
        this.instructions = new ArrayList<>();
    }

    public void addInstruction(Instruction instruction) {
        this.instructions.add(instruction);
    }
    
}
