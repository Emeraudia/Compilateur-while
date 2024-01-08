#include <cstdio>
#include "node.h"

using namespace whilelib;

Node function_true()
{
Node Result;
Node op2; //NIL
Node op3; //NIL
// CONS
Node op4;
op4.setLeftChild(op2);
op4.setRightChild(op3);
Node op5 = op4;
Result = op5;
return Result;
}

Node function_false()
{
Node Result;
Node op13; //NIL
Node op14 = op13;
Result = op14;
return Result;
}

Node function_not(Node Op1)
{
Node Result;
if(Node::asBoolean(Op1))
{
        Node op29 = function_false();
        Node op30 = op29;
        Result = op30;
}else {
        Node op36 = function_true();
        Node op37 = op36;
        Result = op37;
}
return Result;
}

Node function_and(Node Op1, Node Op2)
{
Node Result;
Node op53 = function_not(Op1);
if(Node::asBoolean(op53))
{
        Node op58 = function_false();
        Node op59 = op58;
        Result = op59;
}else {
        Node op66 = function_not(Op2);
        if(Node::asBoolean(op66))
{
        Node op71 = function_false();
        Node op72 = op71;
        Result = op72;
}else {
        Node op78 = function_true();
        Node op79 = op78;
        Result = op79;
}
}
return Result;
}

Node function_add(Node Op1, Node Op2)
{
Node Result;
Node op96 = Op1;
Result = op96;
for(int op99=0; op99<Node::asInteger(Op2); op99++)
{
Node op104; //NIL
// CONS
Node op106;
op106.setLeftChild(op104);
op106.setRightChild(Result);
Node op107 = op106;
Result = op107;
}
return Result;
}

Node function_mul(Node Op1, Node Op2)
{
Node Result;
for(int op120=0; op120<Node::asInteger(Op1); op120++)
{
Node op128 = function_add(Result, Op2);
Node op129 = op128;
Result = op129;
}
return Result;
}

int main(int argc, char *argv[])
{
  Node deux = function_add(function_true(), function_true());
  Node trois = function_add(deux, function_true());
  Node quatre = function_add(deux, deux);
  Node cinq = function_add(deux, trois);

  printf("%i\n", Node::asInteger(function_mul(trois, cinq)));
}