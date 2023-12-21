#include "node.h"
#include <string>

using namespace whilelib;

Node::Node(std::string symbol) : mSymbol(symbol), mLeftChild(nullptr), mRightChild(nullptr)
{
}

Node::Node() : mSymbol(""), mLeftChild(nullptr), mRightChild(nullptr)
{
}

bool Node::isLeaf() const
{
  return this->mLeftChild == nullptr && this->mRightChild == nullptr;
}

void Node::setLeftChild(Node &node)
{
  this->mLeftChild = &node;
}

void Node::setRightChild(Node &node)
{
  this->mRightChild = &node;
}

const bool Node::asBoolean(const Node *node)
{
  if (node == nullptr || node->isLeaf())
  {
    return false;
  }
  return true;
}

const int Node::asInteger(const Node *node)
{
  if (node == nullptr || node->isLeaf())
  {
    return 0;
  }
  return Node::asInteger(node->mRightChild) + 1;
}

const std::string Node::asString(const Node *node)
{
  if (node == nullptr)
  {
    return "";
  }
  if (node->isLeaf())
  {
    return node->mSymbol;
  }
  return Node::asString(node->mLeftChild) + Node::asString(node->mRightChild);
}