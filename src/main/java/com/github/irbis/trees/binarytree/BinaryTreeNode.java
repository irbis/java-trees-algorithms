package com.github.irbis.trees.binarytree;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public interface BinaryTreeNode<E> {

    BinaryTreeNode<E> attachLeftNode(BinaryTreeNode<E> leftNode);

    BinaryTreeNode<E> attachRightNode(BinaryTreeNode<E> rightNode);

    BinaryTreeNode<E> detachLeftNode();

    BinaryTreeNode<E> detachRightNode();

    E get();

    BinaryTreeNode<E> getLeft();

    BinaryTreeNode<E> getRight();

    boolean hasLeft();

    boolean hasRight();

    boolean isNode();
    
}
