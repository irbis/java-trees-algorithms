package com.github.irbis.trees.binarytree;

import java.util.List;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public abstract class BinaryTree<K, V, N extends BinaryTreeNode<K, V>, 
        T extends BinaryTreeTraverser<K, V>> {
    protected final N rootNode;
    protected final T traverser;

    public BinaryTree(N rootNode, T traverser) {
        this.rootNode = rootNode;
        this.traverser = traverser;
    }

    public abstract void put(K key, V value);
    
    public List<K> keys() {
        return traverser.keys(rootNode);
    }
    
    public List<V> values() {
        return traverser.values(rootNode);
    }
}
