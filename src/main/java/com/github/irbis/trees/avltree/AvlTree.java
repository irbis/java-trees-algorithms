package com.github.irbis.trees.avltree;

import com.github.irbis.trees.binarytree.DepthFirstSearchTraverser;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class AvlTree<K, V> 
extends BaseAvlTree<K, V, DepthFirstSearchTraverser<K, V>> {

    public AvlTree(K key, V value) {
        super(key, value, new DepthFirstSearchTraverser<K, V>());
    }

    public AvlTree(AvlTreeNode<K, V> rootNode) {
        super(rootNode, new DepthFirstSearchTraverser<K, V>());
    }
    
}
