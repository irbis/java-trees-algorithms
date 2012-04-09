package com.github.irbis.trees.avltree;

import com.github.irbis.trees.binarytree.BinaryTreeTraverser;
import com.github.irbis.trees.binarytree.BinaryTree;
import java.util.List;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class BaseAvlTree<E extends Comparable<E>, 
        T extends BinaryTreeTraverser<E>> 
    extends BinaryTree<E, AvlTreeNode<E>, T> {
        
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
    }
    
}
