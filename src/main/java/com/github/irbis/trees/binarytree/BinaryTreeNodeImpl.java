package com.github.irbis.trees.binarytree;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class BinaryTreeNodeImpl<E> implements BinaryTreeNode<E> {
    protected BinaryTreeNode left = null;
    protected BinaryTreeNode right = null;
    
    protected final E element;

    public BinaryTreeNodeImpl(E element) {
        this.element = element;
    }

    @Override
    public E get() {
        return element;
    }

    @Override
    public BinaryTreeNode<E> getLeft() {
        return left;
    }

    @Override
    public BinaryTreeNode<E> getRight() {
        return right;
    }

    @Override
    public boolean hasLeft() {
        return left != null;
    }
    
    @Override
    public boolean hasRight() {
        return right != null;
    }
    
    @Override
    public boolean isNode() {
        return left == null && right == null;
    }
    
    @Override
    public BinaryTreeNode<E> attachLeftNode(BinaryTreeNode<E> leftNode) {
        BinaryTreeNode<E> oldLeft = left;
        this.left = leftNode;
        
        return oldLeft;
    }

    @Override
    public BinaryTreeNode<E> detachLeftNode() {
        BinaryTreeNode<E> oldLeft = this.left;
        this.left = null;
        
        return oldLeft;
    }
    
    @Override
    public BinaryTreeNode<E> attachRightNode(BinaryTreeNode<E> rightNode) {
        BinaryTreeNode<E> oldRight = right;
        this.right = rightNode;
        
        return oldRight;
    }
    
    @Override
    public BinaryTreeNode<E> detachRightNode() {
        BinaryTreeNode<E> oldRight = right;
        this.right = null;
        
        return oldRight;
    }

    @Override
    public String toString() {
        return element.toString();
    }
    
    
}
