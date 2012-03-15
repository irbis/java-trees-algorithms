package com.github.irbis.trees.avltree;

import com.github.irbis.trees.binarytree.BinaryTreeNodeImpl;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class AvlTreeNode<K, V> extends BinaryTreeNodeImpl<K, V> {
    private NodeBalance balance = NodeBalance.ZERO;

    public AvlTreeNode(K key, V value) {
        super(key, value);
    }
    
}
