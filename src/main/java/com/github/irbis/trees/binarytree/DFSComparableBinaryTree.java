package com.github.irbis.trees.binarytree;

/**
 * <p>
 * Specification of unbalanced binary tree with depth first search traverser.
 * To compare elements Comparable interface uses.
 * </p>
 * <p>
 * Specification simplifier usage of ComparableBinaryTree class:</p>
 * <p><code>
 * DFSComparableBinaryTree<Integer> tree = new DFSComparableBinaryTree<Integer>(1);
 * </code></p>
 * @author A.Nadtochey<irbis@github.com>
 */
public class DFSComparableBinaryTree<E extends Comparable<E>> 
extends ComparableBinaryTree<E, DepthFirstSearchTraverser<E>> {

    public DFSComparableBinaryTree(E element) {
        super(element, new DepthFirstSearchTraverser<E>());
    }

    public DFSComparableBinaryTree(BinaryTreeNode<E> rootNode) {
        super(rootNode, new DepthFirstSearchTraverser<E>());
    }
    
}
