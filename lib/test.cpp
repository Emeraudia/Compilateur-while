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
Node op28 = function_false();
Node op29 = op28;
Result = op29;
}else{
Node op35 = function_true();
Node op36 = op35;
Result = op36;
}
return Result;
}

Node function_and(Node Op1, Node Op2)
{
Node Result;
Node op51 = function_not(Op1);
Node op52 = op51;
if(Node::asBoolean(op52))
{
Node op56 = function_false();
Node op57 = op56;
Result = op57;
}else{
Node op63 = function_not(Op2);
Node op64 = op63;
if(Node::asBoolean(op64))
{
Node op68 = function_false();
Node op69 = op68;
Result = op69;
}else{
Node op75 = function_true();
Node op76 = op75;
Result = op76;
}
}
return Result;
}

Node function_add(Node Op1, Node Op2)
{
Node Result;
Result = Op1;
for(int op98=0; op98<Node::asInteger(Op2); op98++)
{
Node op100; //NIL
// CONS
Node op102;
op102.setLeftChild(op100);
op102.setRightChild(Result);
Node op103 = op102;
Result = op103;
}
return Result;
}

Node function_sub(Node Op1, Node Op2)
{
Node Result;
Result = Op1;
for(int op123=0; op123<Node::asInteger(Op2); op123++)
{
Node op126 = Result.getRightChild();
Node op127 = op126;
Result = op127;
}
return Result;
}

Node function_mul(Node Op1, Node Op2)
{
Node Result;
for(int op142=0; op142<Node::asInteger(Op1); op142++)
{
Node op147 = function_add(Result, Op2);
Node op148 = op147;
Result = op148;
}
return Result;
}

Node function_divide(Node Dividend, Node Divisor)
{
Node Result;
Node op162; //NIL
Node op163 = op162;
Result = op163;
if(Node::asBoolean(Divisor))
{
while(Node::asBoolean(Dividend))
{
Node op173; //NIL
// CONS
Node op175;
op175.setLeftChild(op173);
op175.setRightChild(Result);
Node op176 = op175;
Result = op176;
Node op183 = function_sub(Dividend, Divisor);
Node op184 = op183;
Dividend = op184;
}
}else{
Node op191; //NIL
Node op192 = op191;
Result = op192;
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
  n.setRightChild(quatre);
  std::cout << n.toString() << " = " << quatre.toString() << std::endl;
  quatre = function_false();
  std::cout << n.toString() << " = " << quatre.toString() << std::endl;

  for(int i = 0 ; i < 10 ; i++)
  {
        std::cout << i << " : " << Node::fromInt(i).toString() << std::endl;
  }
  printf("%i\n", Node::asInteger(function_divide(function_true(), deux)));
}