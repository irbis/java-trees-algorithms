package com.github.irbis.trees.binarytree;

import java.util.List;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public abstract class BinaryTree<E, N extends BinaryTreeNode<E>,
        T extends BinaryTreeTraverser<E>> {
    protected final N rootNode;
    protected final T traverser;

    public BinaryTree(N rootNode, T traverser) {
        this.rootNode = rootNode;
        this.traverser = traverser;
    }

    public abstract void put(E element);
    
    public List<E> traverse() {
        return traverser.traverse(rootNode);
    }
    
}
