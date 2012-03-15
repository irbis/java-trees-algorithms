package com.github.irbis.trees.binarytree;

import java.util.List;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public abstract class BinaryTreeTraverser<K, V> {
    
    public abstract List<K> keys(BinaryTreeNode<K, V> tree);

    public abstract List<V> values(BinaryTreeNode<K, V> tree);
    
}
