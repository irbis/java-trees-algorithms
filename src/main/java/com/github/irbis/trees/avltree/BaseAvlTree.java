package com.github.irbis.trees.avltree;

import com.github.irbis.trees.binarytree.BinaryTreeTraverser;
import com.github.irbis.trees.binarytree.BinaryTree;
import java.util.List;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class BaseAvlTree<K, V, T extends BinaryTreeTraverser<K, V>> 
    extends BinaryTree<K, V, AvlTreeNode<K, V>, T> {
        
    public BaseAvlTree(AvlTreeNode<K, V> rootNode, T traverser) {
        super(rootNode, traverser);
    }
    
    public BaseAvlTree(K key, V value, T traverser) {
        super(new AvlTreeNode<K, V>(key, value), traverser);
    }
    
    @Override
    public void put(K key, V value) {
        
    }

    @Override
    public List<K> keys() {
        return traverser.keys(rootNode);
    }
    
    @Override
    public List<V> values() {
        return traverser.values(rootNode);
    }
}
