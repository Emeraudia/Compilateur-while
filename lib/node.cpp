#include "node.h"
#include <iostream>
using namespace whilelib;



Node::Node(std::string symbol) : mSymbol(symbol), mLeftChild(nullptr), mRightChild(nullptr)
{
}

Node::Node() : mSymbol(""), mLeftChild(nullptr), mRightChild(nullptr)
{
}

Node::Node(const Node &copy) : mSymbol(copy.mSymbol), mLeftChild(nullptr), mRightChild(nullptr)
{
  if(copy.mLeftChild == nullptr) 
  {
    mLeftChild = nullptr;
  }
  else 
  {
    mLeftChild = std::make_shared<Node>(*copy.mLeftChild);
  }
  if(copy.mRightChild == nullptr) 
  {
    mRightChild = nullptr;
  }
  else 
  {
    mRightChild = std::make_shared<Node>(*copy.mRightChild);
  }
}

bool Node::isLeaf() const
{
  return mLeftChild == nullptr && mRightChild == nullptr;
}

void Node::setLeftChild(Node node)
{
  mLeftChild = std::make_shared<Node>(node);
}

void Node::setRightChild(Node node)
{
  mRightChild = std::make_shared<Node>(node);
}

Node Node::getLeftChild() const
{
  if(!this->isLeaf()){
    return *mLeftChild;
  }else{
    return Node();
  }
}

Node Node::getRightChild() const
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

std::string Node::toString() const
{
  std::string result = "(cons ";
  if(isLeaf())
  {
    return "nil";
  }
  else{
    if(mLeftChild == nullptr)
    {
      result += "nil";
    }
    else{
      result += getLeftChild().toString();
    }
    result += " ";
    if(mRightChild == nullptr)
    {
      result += "nil";
    }
    else{
      result += getRightChild().toString();
    }
    result += ")";
  }

  return result;
}

const Node Node::fromInt(const int &param)
{
  Node Result;
  for(int i = 0 ; i < param ; i++)
  {
    Result.setRightChild(Result);
  }
  return Result;
}