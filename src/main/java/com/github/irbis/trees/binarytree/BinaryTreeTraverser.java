package com.github.irbis.trees.binarytree;

import java.util.List;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public abstract class BinaryTreeTraverser<E> {
    
    public abstract List<E> traverse(BinaryTreeNode<E> tree);
    
}
