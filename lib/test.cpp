#include <cstdio>
#include "node.h"

using namespace whilelib;

Node function_false()
{
        Node op2; //NIL
        Node op3 = op2;
        Node Result = op3;
        return Result;
}

int main(int argc, char *argv[])
{
  Node node = function_false();

  printf("%x\n", Node::asBoolean(&node));
}