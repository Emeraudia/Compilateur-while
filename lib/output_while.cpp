#include "node.h"
#include <iostream>
using namespace whilelib;
int main(int argc, char *argv[])
{
if(argc-1 != 2) return 0;
Node Op1 = Node::castInput(argv[1]);
Node Op2 = Node::castInput(argv[2]);
Node Result;
Result = Op1;
for(int op12=0; op12<Node::asInteger(Op2); op12++)
{
Node op14; //NIL
// CONS
Node op16;
op16.setLeftChild(op14);
op16.setRightChild(Result);
Node op17 = op16;
Result = op17;
}
Node op23("int");
// CONS
Node op25;
op25.setLeftChild(op23);
op25.setRightChild(Result);
Node op26 = op25;
Result = op26;
Node::pp(Result);
return 0;
}
