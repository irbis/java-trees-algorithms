package com.github.irbis.trees.binarytree;

/**
 * Simple unbalanced binary tree. To compare elements Comparable interface
 * uses.
 * @author A.Nadtochey<irbis@github.com>
 */
public class ComparableBinaryTree<E extends Comparable<E>,
        T extends BinaryTreeTraverser<E>> 
    extends BinaryTree<E, BinaryTreeNode<E>, T> {

    public ComparableBinaryTree(BinaryTreeNode<E> rootNode, T traverser) {
        super(rootNode, traverser);
    }

    public ComparableBinaryTree(E element, T traverser) {
        super(new BinaryTreeNodeImpl<E>(element), traverser);
    }
    
    @Override
    public void put(E element) {
        put(rootNode, element);
    }

    private void put(BinaryTreeNode<E> node, E element) {
        E nodeElement = node.get();
        int compareResult = element.compareTo(nodeElement);
        
        if (compareResult == 0) return;
        
        if (compareResult < 0) {
            if (!node.hasLeft())
                node.attachLeftNode(new BinaryTreeNodeImpl<E>(element));
            else
                put(node.getLeft(), element);
        } else {
            if (!node.hasRight())
                node.attachRightNode(new BinaryTreeNodeImpl<E>(element));
            else
                put(node.getRight(), element);
        }
    }
    
}
