package com.github.irbis.trees.binarytree;

import java.util.List;

/**
 * <p>
 * An abstract binary tree. Class doesn't define method of put elements to
 * the tree. It combines main binary tree properties: root node and tree
 * traverser.
 * </p>
 * @see BinaryTreeTraverser
 * @see DepthFirstSearchTraverser
 * @author A.Nadtochey<irbis@github.com>
 */
public abstract class BinaryTree<E, N extends BinaryTreeNode<E>,
        T extends BinaryTreeTraverser<E>> {
    protected final N rootNode;
    protected final T traverser;

    /**
     * Creates new binary tree.
     * @param rootNode a root node of the tree.
     * @param traverser a tree traverser.
     */
    public BinaryTree(N rootNode, T traverser) {
        this.rootNode = rootNode;
        this.traverser = traverser;
    }

    /**
     * Puts element to the tree.
     * @param element element to put.
     */
    public abstract void put(E element);
    
    /**
     * Method uses equals to compare element with node element.
     * @param element element to find
     * @return true if tree contains element otherwise false.
     */
    public boolean contains(E element) {
        return contains(rootNode, element);
    }
    
    private boolean contains(BinaryTreeNode<E> node, E element) {
        boolean exists = node.get().equals(element);

        
        if (!exists && node.hasLeft())
            exists = contains(node.getLeft(), element);
        
        if (!exists && node.hasRight())
            exists = contains(node.getRight(), element);
                
        return exists;
    }
    
    /**
     * Transform tree to the list of elements with help of traverser.
     * @return list of elements.
     */
    public List<E> traverse() {
        return traverser.traverse(rootNode);
    }
    
}
