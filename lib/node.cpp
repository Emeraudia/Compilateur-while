#include "node.h"

using namespace whilelib;

Node::Node(std::string symbol) : mSymbol(symbol), mLeftChild(nullptr), mRightChild(nullptr)
{
}

Node::Node() : mSymbol(""), mLeftChild(nullptr), mRightChild(nullptr)
{
}

bool Node::isLeaf() const
{
  return mLeftChild == nullptr && mRightChild == nullptr;
}

void Node::setLeftChild(Node &node)
{
  mLeftChild = std::make_shared<Node>(node);
}

void Node::setRightChild(Node &node)
{
  mRightChild = std::make_shared<Node>(node);
}

Node Node::getLeftChild()
{
  if(!this->isLeaf()){
    return *mLeftChild;
  }else{
    return Node();
  }
}

Node Node::getRightChild()
{
  if(!this->isLeaf()){
    return *mRightChild;
  }else{
    return Node();
  }
}

const bool Node::asBoolean(const Node &node)
{
  return !node.isLeaf();
}

const int Node::asInteger(const Node &node)
{
  if (&node == nullptr || node.isLeaf())
  {
    return 0;
  }
  return Node::asInteger(*node.mRightChild) + 1;
}

const std::string Node::asString(const Node &node)
{
  if (&node == nullptr)
  {
    return "";
  }
  if (node.isLeaf())
  {
    return node.mSymbol;
  }
  return Node::asString(*node.mLeftChild) + Node::asString(*node.mRightChild);
}