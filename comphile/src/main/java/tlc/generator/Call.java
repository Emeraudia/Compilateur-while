package tlc.generator;

import java.util.ArrayList;
import java.util.List;

import tlc.util.Quadruplet;

public class Call extends Instruction{

    private List<String> parameters;

    private String endInstruction;

    public Call(Quadruplet quad) {
        super(quad);
        this.parameters = new ArrayList<>();
        this.endInstruction = quad.res;
    }

    public String toString() {
        String s = "Node " + this.endInstruction +" = function_"+quad.arg1+"(";
        for(int i=0; i<parameters.size(); i++){
            s += parameters.get(i);
            if(i < parameters.size() - 1){
                s += ", ";
            }
        }
        s += ");";
        return s;
    }

    public void addParameter(String s){
        this.parameters.add(s);
    }

    public void setEndInstruction(String endInstruction) {
        this.endInstruction = endInstruction;
    }
   
}