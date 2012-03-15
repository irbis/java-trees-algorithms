package com.github.irbis.trees.binarytree;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

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
    
    /**
     *    1 => [1]
     */
    @Test
    public void testTreeNodeDepthFirstSearch1NodeTree() {
        BinaryTreeNodeImpl<Integer> node1 = 
                new BinaryTreeNodeImpl<Integer>(1);
        DepthFirstSearchTraverser<Integer> dfs = 
                new DepthFirstSearchTraverser<Integer>();
        
        List<Integer> expectedKeys = new ArrayList<Integer>(1);
        
        expectedKeys.add(1);
        
        List<Integer> actualElements = dfs.traverse(node1);
        
        assertEquals(expectedKeys.size(), actualElements.size());
        assertEquals(expectedKeys, actualElements);
    }

    /**
     *          2
     *         /   => [1, 2]
     *        1
     */
    @Test
    public void testTreeNodeDepthFirstSearch2NodesLeftTree() {
        BinaryTreeNodeImpl<Integer> node1 = 
                new BinaryTreeNodeImpl<Integer>(1);
        BinaryTreeNodeImpl<Integer> node2 = 
                new BinaryTreeNodeImpl<Integer>(2);
        DepthFirstSearchTraverser<Integer> dfs = 
                new DepthFirstSearchTraverser<Integer>();
        
        node2.attachLeftNode(node1);
        
        List<Integer> expectedElements = new ArrayList<Integer>(2);
        
        expectedElements.add(1);
        expectedElements.add(2);
        
        List<Integer> actualKeys = dfs.traverse(node2);
        
        assertEquals(expectedElements.size(), actualKeys.size());
        assertEquals(expectedElements, actualKeys);
    }
    
    /**
     *         2
     *          \     => [2, 3]
     *           3
     */
    @Test
    public void testTreeNodeDepthFirstSearch2NodesRightTree() {
        BinaryTreeNodeImpl<Integer> node2 = 
                new BinaryTreeNodeImpl<Integer>(2);
        BinaryTreeNodeImpl<Integer> node3 = 
                new BinaryTreeNodeImpl<Integer>(3);
        DepthFirstSearchTraverser<Integer> dfs = 
                new DepthFirstSearchTraverser<Integer>();

        node2.attachRightNode(node3);
        
        List<Integer> expectedElements = new ArrayList<Integer>(2);
        
        expectedElements.add(2);
        expectedElements.add(3);
        
        List<Integer> actualKeys = dfs.traverse(node2);
        
        assertEquals(expectedElements.size(), actualKeys.size());
        assertEquals(expectedElements, actualKeys);
    }
    
    /**
     *         2
     *        / \        =>   [1, 2, 3]
     *       1   3
     */
    @Test
    public void testTreeNodeDepthFirstSearch3NodesTree() {
        BinaryTreeNodeImpl<Integer> node1 = 
                new BinaryTreeNodeImpl<Integer>(1);
        BinaryTreeNodeImpl<Integer> node2 = 
                new BinaryTreeNodeImpl<Integer>(2);
        BinaryTreeNodeImpl<Integer> node3 = 
                new BinaryTreeNodeImpl<Integer>(3);
        DepthFirstSearchTraverser<Integer> dfs = 
                new DepthFirstSearchTraverser<Integer>();
        
        node2.attachLeftNode(node1);
        node2.attachRightNode(node3);

        List<Integer> expectedElements = new ArrayList<Integer>(3);
        
        expectedElements.add(1);
        expectedElements.add(2);
        expectedElements.add(3);
        
        List<Integer> actualKeys = dfs.traverse(node2);
        
        assertEquals(expectedElements.size(), actualKeys.size());
        assertEquals(expectedElements, actualKeys);
    }
    
    /**
     *                     4
     *                    /  \
     *                   2    6
     *                  / \  / \        => [1, 2, 3, 4, 5, 6, 7, 8]
     *                 1  3  5  7
     *                           \
     *                            8
     */
    @Test
    public void testTreeNodeDepthFirstSeachMediumTree() {
        BinaryTreeNodeImpl<Integer> node1 = new BinaryTreeNodeImpl<Integer>(1);
        BinaryTreeNodeImpl<Integer> node2 = new BinaryTreeNodeImpl<Integer>(2);
        BinaryTreeNodeImpl<Integer> node3 = new BinaryTreeNodeImpl<Integer>(3);
        BinaryTreeNodeImpl<Integer> node4 = new BinaryTreeNodeImpl<Integer>(4);
        BinaryTreeNodeImpl<Integer> node5 = new BinaryTreeNodeImpl<Integer>(5);
        BinaryTreeNodeImpl<Integer> node6 = new BinaryTreeNodeImpl<Integer>(6);
        BinaryTreeNodeImpl<Integer> node7 = new BinaryTreeNodeImpl<Integer>(7);
        BinaryTreeNodeImpl<Integer> node8 = new BinaryTreeNodeImpl<Integer>(8);
        
        DepthFirstSearchTraverser<Integer> dfs = new DepthFirstSearchTraverser<Integer>();
        
        node2.attachLeftNode(node1);
        node2.attachRightNode(node3);
        node4.attachLeftNode(node2);
        
        node7.attachRightNode(node8);
        node6.attachLeftNode(node5);
        node6.attachRightNode(node7);
        node4.attachRightNode(node6);
        
        List<Integer> expectedElements = new ArrayList<Integer>(8);
        
        expectedElements.add(1);
        expectedElements.add(2);
        expectedElements.add(3);
        expectedElements.add(4);
        expectedElements.add(5);
        expectedElements.add(6);
        expectedElements.add(7);
        expectedElements.add(8);
        
        List<Integer> actualKeys = dfs.traverse(node4);
        
        assertEquals(expectedElements.size(), actualKeys.size());
        assertEquals(expectedElements, actualKeys);
        
    }
}
