package com.github.irbis.trees.binarytree;

/**
 * <p>
 * A binary tree node - tree node contains other two nodes: left and right. 
 * Any node is tree node. If node is null - there is no node.
 * </p>
 * <p>
 * An interface doesn't define method of tree organization. It's just a data
 * structure which defines only binary tree node.
 * </p>
 * @author A.Nadtochey<irbis@github.com>
 */
public interface BinaryTreeNode<E> {

    /**
     * Attach left node to the node.
     * @param leftNode node to attach.
     * @return node that was previously attached or null if no node was attached.
     */
    BinaryTreeNode<E> attachLeftNode(BinaryTreeNode<E> leftNode);

    /**
     * Attach right node to the node.
     * @param rightNode node to attache.
     * @return node that was previously attached or null if no node was attached.
     */
    BinaryTreeNode<E> attachRightNode(BinaryTreeNode<E> rightNode);

    /**
     * Detach left node from the node.
     * @return node that was detached or null if no left node had attached.
     */
    BinaryTreeNode<E> detachLeftNode();

    /**
     * Detach right node from the node.
     * @return node that was detached or null if no right node had attached.
     */
    BinaryTreeNode<E> detachRightNode();

    /**
     * @return element that was connected with the node.
     */
    E get();

    /**
     * @return left node.
     */
    BinaryTreeNode<E> getLeft();

    /**
     * @return right node.
     */
    BinaryTreeNode<E> getRight();

    /**
     * @return true if the node has left node.
     */
    boolean hasLeft();

    /**
     * @return true if the node has right node.
     */
    boolean hasRight();

    /**
     * @return true if the node doesn't have left or right nodes.
     */
    boolean isNode();
    
}
