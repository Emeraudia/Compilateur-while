package tlc.code3adress;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class Parser3A {

    public static int op_inc = 0;
    
    public class Quadruplet{
        String op;
        String res;
        String arg1;
        String arg2;

        public Quadruplet(String op, String res, String arg1, String arg2){
            this.op = op;
            this.res = res;
            this.arg1 = arg1;
            this.arg2 = arg2;
        }
    }

    List<Quadruplet> m_3adress;
    CommonTree AST;

    public Parser3A(CommonTree AST){
        m_3adress = new ArrayList<>();
        this.AST = AST;
    }

    public void build(){
        m_3adress = recurBuild(AST);
    }

    public List<Quadruplet> recurBuild(Tree tree){
        List<Quadruplet> nlist = new ArrayList<>();
        List<Quadruplet> c1;
        List<Quadruplet> c2;
        switch(tree.getText()){
            case "ASSIGN":
                c1 = recurBuild(tree.getChild(0));
                c2 = recurBuild(tree.getChild(1));
                nlist.add(new Quadruplet("=", "op"+(op_inc++),c1.get(0).res,c2.get(0).res));
                nlist.addAll(c1);
                nlist.addAll(c2);
            break;

            case "EXPR":
                nlist.add(new Quadruplet("EXPR", "op"+(op_inc++),null,null));
            break;

            case "INPUT":
                for (int i = 0 ; i < tree.getChildCount() ; i++){
                    c1 = recurBuild(tree.getChild(i));
                    nlist.add(new Quadruplet("INPUT", "op"+(op_inc++), tree.getAncestor(11).getChild(0).getText(), c1.get(0).res));
                    nlist.addAll(c1);
                }
            break;

            case "OUTPUT":
                for (int i = 0 ; i < tree.getChildCount() ; i++){
                    c1 = recurBuild(tree.getChild(i));
                    nlist.add(new Quadruplet("OUTPUT", "op"+(op_inc++), tree.getAncestor(11).getChild(0).getText(), c1.get(0).res));
                    nlist.addAll(c1);
                }
            break;

            case "COMMAND":
                for (int i = 0 ; i < tree.getChildCount() ; i++){
                    c1 = recurBuild(tree.getChild(i));
                    nlist.add(new Quadruplet("COMMAND", "op"+(op_inc++), tree.getAncestor(11).getChild(0).getText(), c1.get(0).res));
                    nlist.addAll(c1);
                }
            break;

            case "DEFINITION":
                for(int i = 0 ; i < tree.getChildCount() ; i++){
                    nlist.addAll(recurBuild(tree.getChild(i)));
                }
            break;

            case "FUNCTION":
                nlist.add(new Quadruplet("FUNCTION", "op"+(op_inc++), tree.getChild(0).getText(), null));
            break;

            case "VARIABLE":
                nlist.add(new Quadruplet("VAR", "op"+(op_inc++), tree.getText(), null));
            break;

        }


        return nlist;
    }

}
