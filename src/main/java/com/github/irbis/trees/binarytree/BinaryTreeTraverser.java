package com.github.irbis.trees.binarytree;

import java.util.List;

/**
 * <p>
 * Abstract class of binary tree traverser. Traverser creates list from
 * a tree by visit every tree node.
 * </p>
 * @author A.Nadtochey<irbis@github.com>
 */
public abstract class BinaryTreeTraverser<E> {
    
    /**
     * Trasforms tree to list.
     * @param tree tree to transform.
     * @return list of elements which source tree contains.
     */
    public abstract List<E> traverse(BinaryTreeNode<E> tree);
    
}
