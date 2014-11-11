package com.github.irbis.trees.avltree;

import java.util.List;

import com.github.irbis.trees.binarytree.BinaryTreeTraverser;
import com.github.irbis.trees.binarytree.ComparableBinaryTree;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 * @param <E> type of elements AVL tree stores.
 * @param <T> type of tree traverser.
 */
public class BaseAvlTree<E extends Comparable<E>, 
        T extends BinaryTreeTraverser<E>> 
    extends ComparableBinaryTree<E, T> {
        
    public BaseAvlTree(AvlTreeNode<E> rootNode, T traverser) {
        super(rootNode, traverser);
    }
    
    public BaseAvlTree(E element, T traverser) {
        super(new AvlTreeNode<E>(element), traverser);
    }

    @Override
    public List<E> traverse() {
        return traverser.traverse(rootNode);
    }
    
    @Override
    public void put(E element) {
        put((AvlTreeNode<E>) rootNode, element); 
    }

    private void put(AvlTreeNode<E> node, E element) {
        E nodeElement = node.get();
        int compareResult = element.compareTo(nodeElement);
        
        if (compareResult == 0) return;
        
        AvlTreeNode<E> newNode = new AvlTreeNode<E>(element);
        if (compareResult < 0) {
            if (!node.hasLeft())
                node.attachLeftNode(newNode);
            else
                put(node.getLeft(), element);
        } else {
            if (!node.hasRight())
                node.attachRightNode(newNode);
            else
                put(node.getRight(), element);
        }
    }  
}
