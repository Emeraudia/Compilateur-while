#pragma once

#include <memory>
#include <string>

namespace whilelib
{
    class Node
    {
    private:
        std::string mSymbol;
        std::shared_ptr<Node> mLeftChild, mRightChild;

    public:
        Node(std::string symbol);
        Node();

        bool isLeaf() const;

        void setLeftChild(Node &node);
        void setRightChild(Node &node);

        static const int asInteger(const Node &node);
        static const bool asBoolean(const Node &node);
        static const std::string asString(const Node &node);
    };
}