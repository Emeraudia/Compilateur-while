#include <cstdio>
#include <iostream>
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
Node op52 = Op1;
Result = op52;
for(int op55=0; op55<Node::asInteger(Op2); op55++)
{
Node op60; //NIL
// CONS
Node op62;
op62.setLeftChild(op60);
op62.setRightChild(Result);
Node op63 = op62;
Result = op63;
}
return Result;
}

Node function_add(Node Op1, Node Op2)
{
Node Result;
Node op78 = Op1;
Result = op78;
for(int op81=0; op81<Node::asInteger(Op2); op81++)
{
Node op86; //NIL
// CONS
Node op88;
op88.setLeftChild(op86);
op88.setRightChild(Result);
Node op89 = op88;
Result = op89;
}
return Result;
}

Node function_mul(Node Op1, Node Op2)
{
Node Result;
for(int op102=0; op102<Node::asInteger(Op1); op102++)
{
Node op110 = function_add(Result, Op2);
Node op111 = op110;
Result = op111;
}
return Result;
}

Node function_sub(Node Op1, Node Op2)
{
Node Result;
Node op126 = Op1;
Result = op126;
for(int op129=0; op129<Node::asInteger(Op2); op129++)
{
Node op135 = Result.getRightChild();
Node op136 = op135;
Result = op136;
}
return Result;
}

int main(int argc, char *argv[])
{
  Node deux = function_add(function_true(), function_true());
  Node trois = function_add(deux, function_true());
  Node quatre = function_add(deux, deux);
  Node cinq = function_add(deux, trois);

  printf("%i\n", Node::asInteger(function_sub(cinq, trois)));

  Node copy = Node(cinq);
  std::cout << copy.toString() << " = " << cinq.toString() << std::endl;
  cinq = function_false();
  std::cout << copy.toString() << " =/= " << cinq.toString() << std::endl;

  Node n;
  n.setLeftChild(function_false());
  std::cout << n.toString() << " = " << copy.toString() << std::endl;
  copy = function_false();
  std::cout << n.toString() << " = " << copy.toString() << std::endl;
}