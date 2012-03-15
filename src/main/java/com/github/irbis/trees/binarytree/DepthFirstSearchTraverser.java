package com.github.irbis.trees.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class DepthFirstSearchTraverser<K, V> extends BinaryTreeTraverser<K, V> {    
    @Override
    public List<K> keys(BinaryTreeNode<K, V> tree) {
        List<BinaryTreeNode<K, V>> nodes = new LinkedList<BinaryTreeNode<K, V>>();
        
        if (nodes.isEmpty()) toList(nodes, tree);
        List<K> keys = new ArrayList<K>(nodes.size());
        
        for (BinaryTreeNode<K, V> node : nodes)
            keys.add(node.getKey());
        
        return keys;
    }
    
    @Override
    public List<V> values(BinaryTreeNode<K, V> tree) {
        List<BinaryTreeNode<K, V>> nodes = new LinkedList<BinaryTreeNode<K, V>>();
        
        if (nodes.isEmpty()) toList(nodes, tree);
        List<V> values = new ArrayList<V>(nodes.size());
        
        for (BinaryTreeNode<K, V> node : nodes)
            values.add(node.getValue());
        
        return values;
    }
    
    private void toList(List<BinaryTreeNode<K, V>> nodes, 
            BinaryTreeNode<K, V> node) {
        if (node == null) return; // empty tree
        
        if (node.hasLeft()) toList(nodes, node.getLeft());
        nodes.add(node);
        if (node.hasRight()) toList(nodes, node.getRight());
    }
}
