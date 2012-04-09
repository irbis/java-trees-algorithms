package com.github.irbis.trees.binarytree;

import org.junit.Test;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class BinaryTreeNodeTest {
    
    /**
     *         2
     *        / \
     *       1   3
     */
    @Test
    public void testTreeNodeCreation() {
        BinaryTreeNodeImpl<Integer> node1 = 
                new BinaryTreeNodeImpl<Integer>(1);
        BinaryTreeNodeImpl<Integer> node2 = 
                new BinaryTreeNodeImpl<Integer>(2);
        BinaryTreeNodeImpl<Integer> node3 = 
                new BinaryTreeNodeImpl<Integer>(3);
        
        node2.attachLeftNode(node1);
        node2.attachRightNode(node3);
    }
}
