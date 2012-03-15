package com.github.irbis.trees.binarytree;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public interface BinaryTreeNode<K, V> {

    BinaryTreeNodeImpl<K, V> attachLeftNode(BinaryTreeNodeImpl<K, V> leftNode);

    BinaryTreeNodeImpl<K, V> attachRightNode(BinaryTreeNodeImpl<K, V> rightNode);

    BinaryTreeNodeImpl<K, V> detachLeftNode();

    BinaryTreeNodeImpl<K, V> detachRightNode();

    K getKey();

    BinaryTreeNodeImpl getLeft();

    BinaryTreeNodeImpl getRight();

    V getValue();

    boolean hasLeft();

    boolean hasRight();

    boolean isNode();
    
}
