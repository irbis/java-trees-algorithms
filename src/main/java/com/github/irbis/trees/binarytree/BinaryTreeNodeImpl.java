package com.github.irbis.trees.binarytree;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class BinaryTreeNodeImpl<K, V> implements BinaryTreeNode<K, V> {
    protected BinaryTreeNodeImpl left = null;
    protected BinaryTreeNodeImpl right = null;
    
    protected final K key;
    protected final V value;

    public BinaryTreeNodeImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public BinaryTreeNodeImpl getLeft() {
        return left;
    }

    @Override
    public BinaryTreeNodeImpl getRight() {
        return right;
    }

    @Override
    public boolean hasLeft() {
        return left != null;
    }
    
    @Override
    public boolean hasRight() {
        return right != null;
    }
    
    @Override
    public boolean isNode() {
        return left == null && right == null;
    }
    
    @Override
    public BinaryTreeNodeImpl<K, V> attachLeftNode(BinaryTreeNodeImpl<K, V> leftNode) {
        BinaryTreeNodeImpl<K, V> oldLeft = left;
        this.left = leftNode;
        
        return oldLeft;
    }

    @Override
    public BinaryTreeNodeImpl<K, V> detachLeftNode() {
        BinaryTreeNodeImpl<K, V> oldLeft = this.left;
        this.left = null;
        
        return oldLeft;
    }
    
    @Override
    public BinaryTreeNodeImpl<K, V> attachRightNode(BinaryTreeNodeImpl<K, V> rightNode) {
        BinaryTreeNodeImpl<K, V> oldRight = right;
        this.right = rightNode;
        
        return oldRight;
    }
    
    @Override
    public BinaryTreeNodeImpl<K, V> detachRightNode() {
        BinaryTreeNodeImpl<K, V> oldRight = right;
        this.right = null;
        
        return oldRight;
    }

    @Override
    public String toString() {
        return key.toString() + "=" + value.toString();
    }
    
    
}
