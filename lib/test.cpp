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
        if(Node::asBoolean(&Op1))
{
        Node op28 = function_false();
        Node op29 = op28;
        Result = op29;
}else {
        Node op34 = function_true();
        Node op35 = op34;
        Result = op35;
}

        return Result;
}

Node function_and(Node Op1, Node Op2)
{
        Node Result;
        if(Node::asBoolean(&op49))
{
        Node op49 = function_not();
        Node op53 = function_false();
        Node op54 = op53;
        Result = op54;
}else {
        if(Node::asBoolean(&op59))
{
        Node op59 = function_not();
        Node op63 = function_false();
        Node op64 = op63;
        Result = op64;
}else {
        Node op69 = function_true();
        Node op70 = op69;
        Result = op70;
}

}

        return Result;
}

int main(int argc, char *argv[])
{
  Node node = function_not(function_false());

  printf("%x\n", Node::asBoolean(&node));
}