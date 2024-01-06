package tlc.code3adress;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import tlc.antlr.WhileLexer;

public class Parser3A {

    public static int op_inc = 0;

    public class Quadruplet {
        String op;
        String res;
        String arg1;
        String arg2;

        public Quadruplet(String op, String res, String arg1, String arg2) {
            this.op = op;
            this.res = res;
            this.arg1 = arg1;
            this.arg2 = arg2;
        }
    }

    List<Quadruplet> m_3adress;
    CommonTree AST;

    public Parser3A(CommonTree AST) {
        m_3adress = new ArrayList<>();
        this.AST = AST;
    }

    public void build() {
        m_3adress = recurBuild(AST);
    }

    public List<Quadruplet> recurBuild(Tree tree) {
        List<Quadruplet> nlist = new ArrayList<>();
        List<Quadruplet> c1;
        List<Quadruplet> c2;
        List<Quadruplet> c3;
        switch (tree.getType()) {
            case WhileLexer.ASSIGN:
                c1 = recurBuild(tree.getChild(0));
                c2 = recurBuild(tree.getChild(1));
                nlist.addAll(c1);
                nlist.addAll(c2);
                nlist.add(new Quadruplet("ASSIGN", "op" + (op_inc++), c1.get(c1.size() - 1).res,
                        c2.get(c2.size() - 1).res));

                break;

            case WhileLexer.EXPR:
                c1 = recurBuild(tree.getChild(0));
                nlist.addAll(c1);
                nlist.add(new Quadruplet("EXPR", "op" + (op_inc++), c1.get(c1.size() - 1).res, null));

                break;

            case WhileLexer.CONS:
                c1 = recurBuild(tree.getChild(0));
                c2 = recurBuild(tree.getChild(1));
                nlist.addAll(c1);
                nlist.addAll(c2);
                nlist.add(new Quadruplet("CONS", "op" + (op_inc++), c1.get(c1.size() - 1).res,
                        c2.get(c2.size() - 1).res));
                break;

            case WhileLexer.NIL:
                nlist.add(new Quadruplet("NIL", "op" + (op_inc++), null, null));
                break;

            case WhileLexer.INPUT:
                for (int i = 0; i < tree.getChildCount(); i++) {
                    c1 = recurBuild(tree.getChild(i));
                    nlist.addAll(c1);
                    nlist.add(new Quadruplet("INPUT", "op" + (op_inc++), c1.get(c1.size() - 1).res, null));

                }
                break;

            case WhileLexer.OUTPUT:
                for (int i = 0; i < tree.getChildCount(); i++) {
                    c1 = recurBuild(tree.getChild(i));
                    nlist.addAll(c1);
                    nlist.add(new Quadruplet("OUTPUT", "op" + (op_inc++),c1.get(c1.size() - 1).res,null));

                }
                break;

            case WhileLexer.COMMANDS:
                for (int i = tree.getChildCount()-1; i >= 0 ; i--) {
                    c1 = recurBuild(tree.getChild(i));
                    nlist.addAll(c1);
                    nlist.add(new Quadruplet("COMMAND", "op" + (op_inc++), c1.get(c1.size() - 1).res, null));

                }
                break;

            case WhileLexer.DEFINITION:
                for (int i = 0; i < tree.getChildCount(); i++) {
                    nlist.addAll(recurBuild(tree.getChild(i)));
                }
                break;

            case WhileLexer.FUNCTION:
                nlist.add(new Quadruplet("FUNC_BEGIN", "op" + (op_inc++), tree.getChild(0).getText(), null));
                c1 = recurBuild(tree.getChild(1));
                nlist.addAll(c1);
                nlist.add(new Quadruplet("FUNC_END", "op" + (op_inc++), null,null));
                break;

            case WhileLexer.VARIABLE:
                nlist.add(new Quadruplet("VARIABLE", "op" + (op_inc++), tree.getText(), null));
                break;

            case WhileLexer.VAR:
                nlist.addAll(recurBuild(tree.getChild(0)));
                break;

            case WhileLexer.IF:
                c1 = recurBuild(tree.getChild(0));
                c2 = recurBuild(tree.getChild(1));
                nlist.addAll(c1);
                nlist.addAll(c2);
                Quadruplet tmp = new Quadruplet("IF", "op" + (op_inc++), c1.get(c1.size() - 1).res,
                        c2.get(c2.size() - 1).res);
                nlist.add(tmp);
                if (tree.getChildCount() == 3) { // verif existence du else
                    c3 = recurBuild(tree.getChild(2));
                    nlist.addAll(c3);
                    nlist.add(new Quadruplet("ELSE", "op" + (op_inc++), tmp.res, c3.get(c3.size() - 1).res));
                }
                break;

            case WhileLexer.FOR:
                c1 = recurBuild(tree.getChild(0));
                c2 = recurBuild(tree.getChild(1));
                nlist.addAll(c1);
                nlist.addAll(c2);
                nlist.add(new Quadruplet("FOR", "op" + (op_inc++), c1.get(c1.size() - 1).res,
                        c2.get(c2.size() - 1).res));
                break;
        }

        return nlist;
    }

}
