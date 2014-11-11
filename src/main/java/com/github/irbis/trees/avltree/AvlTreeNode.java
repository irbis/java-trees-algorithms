package com.github.irbis.trees.avltree;

import com.github.irbis.trees.binarytree.BinaryTreeNode;
import com.github.irbis.trees.binarytree.BinaryTreeNodeImpl;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class AvlTreeNode<E> extends BinaryTreeNodeImpl<E> {
    private int balance = 0;

    public AvlTreeNode(E element) {
        super(element);
    }

	@Override
	public AvlTreeNode<E> attachLeftNode(BinaryTreeNode<E> leftNode) {
		balance = balance - 1;
		return (AvlTreeNode<E>) super.attachLeftNode(leftNode);
	}

	@Override
	public AvlTreeNode<E> attachRightNode(BinaryTreeNode<E> rightNode) {
		balance = balance + 1;
		return (AvlTreeNode<E>) super.attachRightNode(rightNode);
	}

	@Override
	public AvlTreeNode<E> getLeft() {
		return (AvlTreeNode<E>) super.getLeft();
	}

	@Override
	public AvlTreeNode<E> getRight() {
		return (AvlTreeNode<E>) super.getRight();
	}
    
}
