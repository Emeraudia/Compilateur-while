#pragma once

#include <memory>
#include <string>
#include <stack>

namespace whilelib
{
    class Node
    {
    private:
        std::string mSymbol;
        std::shared_ptr<Node> mLeftChild, mRightChild;
        static const Node recurFromString(std::stack<std::string> pile);

    public:
        Node(std::string symbol);
        Node();
        Node(const Node &copy);

        bool isLeaf() const;

        void setLeftChild(Node node);
        void setRightChild(Node node);

        Node getLeftChild() const;
        Node getRightChild() const;

        static const int asInteger(const Node &node);
        static const bool asBoolean(const Node &node);
        static const std::string asString(const Node &node);

        static const Node fromInt(const int &param);
        static const Node fromString(const std::string &param); 

        std::string toString() const;

        static const std::string ppString(Node &node);
        static const void pp(Node &node);
    };
}