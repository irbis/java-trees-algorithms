package com.github.irbis.trees.avltree;

import com.github.irbis.trees.binarytree.DepthFirstSearchTraverser;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class AvlTree<E extends Comparable<E>> 
extends BaseAvlTree<E, DepthFirstSearchTraverser<E>> {

    public AvlTree(E element) {
        super(element, new DepthFirstSearchTraverser<E>());
    }

    public AvlTree(AvlTreeNode<E> rootNode) {
        super(rootNode, new DepthFirstSearchTraverser<E>());
    }
    
}
