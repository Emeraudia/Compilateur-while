#include "node.h"
#include <iostream>
#include <stack>
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
  return Node::asString(*node.mLeftChild) + " " +  Node::asString(*node.mRightChild);
}

std::string Node::toString() const
{
  std::string result = "(cons ";
  if(isLeaf())
  {
    if (mSymbol == "") return "nil";

    return mSymbol;
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

const std::string Node::ppString(Node &node){

    if (node.isLeaf()){

    return node.toString();
    
  }
  else if (node.getLeftChild().toString() == "int"){

    return std::to_string(asInteger(node.getRightChild()));
  }
  else if (node.getLeftChild().toString() == "bool"){

    if (asBoolean(node.getRightChild())) return "True";
    else return "False";
    
  }
  else if (node.getLeftChild().toString() == "string"){
    return asString(node.getRightChild());
  }
  else{

    Node leftChild = node.getLeftChild();
    Node rightChild = node.getRightChild();

    return ppString(leftChild) + " " + ppString(rightChild);
  }
}

const void Node::pp(Node &node){

  std::cout << ppString(node) << std::endl;
}
const Node Node::fromString(const std::string &param)
{
  std::stack<std::string> pile;
  std::string tmp;
  for(auto it=param.begin(); it!=param.end() ;++it)
  {
    if(*it == '(')
    {
      if(tmp.size() > 0)
      {
        pile.push(tmp);
        tmp = "";
      }
      pile.push("new node");
    }
    else if(*it == ')')
    {
      if(tmp.size() > 0)
      {
        pile.push(tmp);
        tmp = "";
      }
      pile.push("end node");
    }
    else if(*it == ' ')
    {
      if(tmp.size() > 0)
      {
        pile.push(tmp);
        tmp = "";
      }
    }
    else
    {
      tmp += *it;
    }
  }
  if(tmp.size() > 0)
  {
    pile.push(tmp);
    tmp = "";
  }
  std::stack<std::string> Revertpile;
  while (!pile.empty())
  {
     Revertpile.push(pile.top());
     pile.pop();
  }
  return recurFromString(Revertpile);
}

const Node Node::recurFromString(std::stack<std::string> pile)
{
  if(pile.top() != "new node")
  {
    auto returnNode = std::make_shared<Node>();
    returnNode->mSymbol = pile.top();
    return *returnNode;
  }
  pile.pop();
  auto returnNode = std::make_shared<Node>();
  int nbChild = 0;
  while(pile.top() != "end node")
  {
    Node nextChild;
    bool hasChild = false;
    if(pile.top() =="cons");
    else if(pile.top() == "new node")
    {
      nextChild = recurFromString(pile);
      hasChild = true;
    }
    else if(pile.top() == "nil")
    {
      nextChild = Node();
      hasChild = true;
    }
    else
    {
      nextChild = Node(pile.top());
      hasChild = true;
    }
    if(hasChild)
    {
      if(nbChild == 0) returnNode->setLeftChild(nextChild);
      else if(nbChild == 1) returnNode->setRightChild(nextChild);
      nbChild++;
    }
    pile.pop();
  }
  return *returnNode;
}

const Node Node::castInput(const std::string &arg)
{
  bool digit = true;
  int val_arg = 0;
  for(auto it = arg.begin() ; it != arg.end() && digit ; ++it)
  {
    if(!std::isdigit(static_cast<unsigned char>(*it))) digit = false;
    else 
    {
      val_arg = val_arg*10 + (int)(*it-'0');
    }
  }
  if(digit) return fromInt(val_arg);
  else return fromString(arg);
}