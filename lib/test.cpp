#include <cstdio>
#include "node.h"

using namespace whilelib;

int main(int argc, char *argv[])
{
  Node node;
  Node nil1("bonjour ");
  Node nil2("stevan");

  node.setLeftChild(nil1);
  node.setRightChild(nil2);

  printf("%s\n", Node::asString(&node).c_str());
}