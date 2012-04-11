package com.github.irbis.trees.binarytree;

/**
 * <p>
 * Specification of unbalanced binary tree with breadth first search traverser.
 * To compare elements Comparable interface uses.
 * </p>
 * <p>
 * Specification simplify usage of ComparableBinaryTree class:</p>
 * <p><code>
 * BFSComparableBinaryTree<Integer> tree = new BFSComparableBinaryTree<Integer>(1);
 * </code></p>
 * @author A.Nadtochey<irbis@github.com>
 */
public class BFSComparableBinaryTree<E extends Comparable<E>>
extends ComparableBinaryTree<E, BreadthFirstSearchTraverser<E>> {

    public BFSComparableBinaryTree(E element) {
        super(element, new BreadthFirstSearchTraverser<E>());
    }

    public BFSComparableBinaryTree(BinaryTreeNode<E> rootNode) {
        super(rootNode, new BreadthFirstSearchTraverser<E>());
    }
    
}
