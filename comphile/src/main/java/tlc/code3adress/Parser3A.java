package tlc.code3adress;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

import tlc.antlr.WhileLexer;
import tlc.util.Quadruplet;

public class Parser3A {

    public static int op_inc = 0;

    List<Quadruplet> m_3adress;
    CommonTree AST;

    public Parser3A(CommonTree AST) {
        m_3adress = new ArrayList<>();
        this.AST = AST;
        op_inc = 0;
    }

    public void build() {
        if (AST.getType() == 0) {
            int count = AST.getChildCount();
            for (int i = 0; i < count; i++) {
                m_3adress.addAll(recurBuild(AST.getChild(i)));
            }
        } else {
            m_3adress = recurBuild(AST);
        }
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
            
            case WhileLexer.FUNC:
                nlist.add(new Quadruplet("START_CALL", "op" + (op_inc++), tree.getChild(0).toString(), null));
                if(tree.getChildCount() > 1){
                    for(int i=1; i<tree.getChildCount(); i++){
                        c1 = recurBuild(tree.getChild(i));
                        nlist.addAll(c1);
                    }
                }
                nlist.add(new Quadruplet("END_CALL", "op" + (op_inc++), tree.getChild(0).toString(), null));
                break;

            case WhileLexer.CONS:
                c1 = recurBuild(tree.getChild(0));
                nlist.addAll(c1);
                String resC1 = c1.get(c1.size() - 1).res;
                String resC2 = null;
                if(tree.getChildCount() > 1){
                    c2 = recurBuild(tree.getChild(1));
                    nlist.addAll(c2);
                    resC2 = c2.get(c2.size() - 1).res;
                }
                nlist.add(new Quadruplet("CONS", "op" + (op_inc++), resC1, resC2));
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
                for (int i = 0; i < tree.getChildCount() ; i++) {
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

            case WhileLexer.SYM:
                nlist.add(new Quadruplet("STRING", "op" + (op_inc++), tree.getChild(0).getText(), null));
                break;

            case WhileLexer.VAR:
                nlist.addAll(recurBuild(tree.getChild(0)));
                break;

            case WhileLexer.IF:
                // nlist.add(new Quadruplet("IF", "op" + (op_inc++), null, null));
                c1 = recurBuild(tree.getChild(0));
                nlist.addAll(c1);
                nlist.add(new Quadruplet("IF", "op" + (op_inc++), c1.get(c1.size() - 1).res, null));
                c2 = recurBuild(tree.getChild(1)); 
                nlist.addAll(c2);
                if (tree.getChildCount() == 3) { // verif existence du else
                    nlist.add(new Quadruplet("ELSE", "op" + (op_inc++), null, null));
                    c3 = recurBuild(tree.getChild(2));
                    nlist.addAll(c3);
                }
                nlist.add(new Quadruplet("END_IF", "op" + (op_inc++), null, null));
                break;

            case WhileLexer.FOR:
                //nlist.add(new Quadruplet("FOR", "op" + (op_inc++), null, null));
                c1 = recurBuild(tree.getChild(0));
                nlist.addAll(c1);
                nlist.add(new Quadruplet("FOR", "op" + (op_inc++), c1.get(c1.size() - 1).res, null));
                c2 = recurBuild(tree.getChild(1));
                nlist.addAll(c2);
                nlist.add(new Quadruplet("END_FOR", "op" + (op_inc++), null, null));
                break;

            case WhileLexer.WHILE:
                c1 = recurBuild(tree.getChild(0));
                nlist.addAll(c1);
                nlist.add(new Quadruplet("WHILE", "op" + (op_inc++), c1.get(c1.size() - 1).res, null));
                c2 = recurBuild(tree.getChild(1));
                nlist.addAll(c2);
                nlist.add(new Quadruplet("END_WHILE", "op" + (op_inc++), null, null));
                break;

            case WhileLexer.FOREACH:
                c1 = recurBuild(tree.getChild(0));
                nlist.addAll(c1);
                c2 = recurBuild(tree.getChild(1));
                nlist.addAll(c2);
                nlist.add(new Quadruplet("FOREACH", "op" + (op_inc++), c1.get(c1.size() - 1).res, c2.get(c1.size() - 1).res));
                c3 = recurBuild(tree.getChild(2));
                nlist.addAll(c3);
                nlist.add(new Quadruplet("END_FOREACH", "op" + (op_inc++), null, null));
                break;
            
            case WhileLexer.TL:
                c1 = recurBuild(tree.getChild(0));
                nlist.addAll(c1);
                nlist.add(new Quadruplet("TL", "op" + (op_inc++), c1.get(c1.size() - 1).res,
                       null));
                break;
        }

        return nlist;
    }

    public List<Quadruplet> get3adress() {
        return m_3adress;
    }

    public String toString() {
        String s = "";
        for(int i = 0 ; i < m_3adress.size() ; i++) {
            s+= '['+m_3adress.get(i).op +'|'+m_3adress.get(i).res+'|'+m_3adress.get(i).arg1+'|'+m_3adress.get(i).arg2+']';
        }
        return s;
    }
}
