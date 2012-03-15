package com.github.irbis.trees.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class DepthFirstSearchTraverser<E> extends BinaryTreeTraverser<E> {    
    @Override
    public List<E> traverse(BinaryTreeNode<E> tree) {
        List<BinaryTreeNode<E>> nodes = new LinkedList<BinaryTreeNode<E>>();
        
        if (nodes.isEmpty()) toList(nodes, tree);
        List<E> elements = new ArrayList<E>(nodes.size());
        
        for (BinaryTreeNode<E> node : nodes)
            elements.add(node.get());
        
        return elements;
    }
    
    private void toList(List<BinaryTreeNode<E>> nodes, 
            BinaryTreeNode<E> node) {
        if (node == null) return; // empty tree
        
        if (node.hasLeft()) toList(nodes, node.getLeft());
        nodes.add(node);
        if (node.hasRight()) toList(nodes, node.getRight());
    }
}
