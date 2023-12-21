package tlc.code3adress;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import tlc.antlr.WhileLexer;

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
        switch(tree.getType()){
            case WhileLexer.ASSIGN:
                c1 = recurBuild(tree.getChild(0));
                c2 = recurBuild(tree.getChild(1));
                nlist.add(new Quadruplet("ASSIGN", "op"+(op_inc++),c1.get(0).res,c2.get(0).res));
                nlist.addAll(c1);
                nlist.addAll(c2);
            break;

            case WhileLexer.EXPR:
                c1 = recurBuild(tree.getChild(0));
                nlist.add(new Quadruplet("EXPR", "op"+(op_inc++),c1.get(0).res,null));
                nlist.addAll(c1);
            break;

            case WhileLexer.CONS:
                c1 = recurBuild(tree.getChild(0));
                c2 = recurBuild(tree.getChild(1));
                nlist.add(new Quadruplet("CONS", "op"+(op_inc++),c1.get(0).res,c2.get(0).res));
                nlist.addAll(c1);
                nlist.addAll(c2);
            break;

            case WhileLexer.NIL:
                nlist.add(new Quadruplet("NIL", "op"+(op_inc++), null, null));
            break;

            case WhileLexer.INPUT:
                for (int i = 0 ; i < tree.getChildCount() ; i++){
                    c1 = recurBuild(tree.getChild(i));
                    nlist.add(new Quadruplet("INPUT", "op"+(op_inc++), tree.getAncestor(11).getChild(0).getText(), c1.get(0).res));
                    nlist.addAll(c1);
                }
            break;

            case WhileLexer.OUTPUT:
                for (int i = 0 ; i < tree.getChildCount() ; i++){
                    c1 = recurBuild(tree.getChild(i));
                    nlist.add(new Quadruplet("OUTPUT", "op"+(op_inc++), tree.getAncestor(11).getChild(0).getText(), c1.get(0).res));
                    nlist.addAll(c1);
                }
            break;

            case WhileLexer.COMMANDS:
                for (int i = 0 ; i < tree.getChildCount() ; i++){
                    c1 = recurBuild(tree.getChild(i));
                    nlist.add(new Quadruplet("COMMAND", "op"+(op_inc++), tree.getAncestor(11).getChild(0).getText(), c1.get(0).res));
                    nlist.addAll(c1);
                }
            break;

            case WhileLexer.DEFINITION:
                for(int i = 0 ; i < tree.getChildCount() ; i++){
                    nlist.addAll(recurBuild(tree.getChild(i)));
                }
            break;

            case WhileLexer.FUNCTION:
                nlist.add(new Quadruplet("FUNCTION", "op"+(op_inc++), tree.getChild(0).getText(), null));
                nlist.addAll(recurBuild(tree.getChild(1)));
            break;

            case WhileLexer.VARIABLE:
                nlist.add(new Quadruplet("VAR", "op"+(op_inc++), tree.getText(), null));
            break;

        }


        return nlist;
    }

}
