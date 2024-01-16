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
Node op15 = Result.getRightChild();
Node op16 = op15;
Result = op16;
}
Node op22("int");
// CONS
Node op24;
op24.setLeftChild(op22);
op24.setRightChild(Result);
Node op25 = op24;
Result = op25;
Node::pp(Result);
return 0;
}
