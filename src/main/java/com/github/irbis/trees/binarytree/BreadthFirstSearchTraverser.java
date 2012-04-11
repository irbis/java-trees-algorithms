package com.github.irbis.trees.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * <p>
 * An implementation of binary tree traverser which uses breadth first search
 * (BFS) algorithm to traverse binary tree.
 * </p>
 * @author A.Nadtochey<irbis@github.com>
 */
public class BreadthFirstSearchTraverser<E> extends BinaryTreeTraverser<E> {

    @Override
    public List<E> traverse(BinaryTreeNode<E> tree) {
        List<BinaryTreeNode<E>> nodes = new LinkedList<BinaryTreeNode<E>>();
        List<BinaryTreeNode<E>> levelFirst = new ArrayList<BinaryTreeNode<E>>(1);
        
        levelFirst.add(tree);
        levelToList(nodes, levelFirst);
        
        List<E> elements = new ArrayList<E>(nodes.size());
        for(BinaryTreeNode<E> node : nodes)
            elements.add(node.get());
        
        return elements;
    }

    private void levelToList(List<BinaryTreeNode<E>> nodes, 
            List<BinaryTreeNode<E>> levelNodes) {
        nodes.addAll(levelNodes);
        
        List<BinaryTreeNode<E>> nextLevelNodes = 
                new LinkedList<BinaryTreeNode<E>>();
        for (BinaryTreeNode<E> node : levelNodes) {
            if (node.hasLeft()) nextLevelNodes.add(node.getLeft());
            if (node.hasRight()) nextLevelNodes.add(node.getRight());
        }
        
        if (!nextLevelNodes.isEmpty()) {
            levelNodes.clear(); // free memory
            levelToList(nodes, nextLevelNodes);
        }
            
    }
}
