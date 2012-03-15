package com.github.irbis.trees.avltree;

import com.github.irbis.trees.binarytree.BinaryTreeNodeImpl;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class AvlTreeNode<E> extends BinaryTreeNodeImpl<E> {
    private NodeBalance balance = NodeBalance.ZERO;

    public AvlTreeNode(E element) {
        super(element);
    }
    
}
