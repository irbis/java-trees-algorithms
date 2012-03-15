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
        BinaryTreeNodeImpl<Integer, String> node1 = 
                new BinaryTreeNodeImpl<Integer, String>(1, "node1");
        BinaryTreeNodeImpl<Integer, String> node2 = 
                new BinaryTreeNodeImpl<Integer, String>(2, "node2");
        BinaryTreeNodeImpl<Integer, String> node3 = 
                new BinaryTreeNodeImpl<Integer, String>(3, "node3");
        
        node2.attachLeftNode(node1);
        node2.attachRightNode(node3);
    }
    
    /**
     *    1 => [1]
     */
    @Test
    public void testTreeNodeDepthFirstSearch1NodeTree() {
        BinaryTreeNodeImpl<Integer, String> node1 = 
                new BinaryTreeNodeImpl<Integer, String>(1, "node1");
        DepthFirstSearchTraverser<Integer, String> dfs = 
                new DepthFirstSearchTraverser<Integer, String>();
        
        List<Integer> expectedKeys = new ArrayList<Integer>(1);
        List<String> expectedValues = new ArrayList<String>(1);
        
        expectedKeys.add(1);
        
        expectedValues.add("node1");
        
        List<Integer> actualKeys = dfs.keys(node1);
        List<String> actualValues = dfs.values(node1);
        
        assertEquals(expectedKeys.size(), actualKeys.size());
        assertEquals(expectedKeys, actualKeys);
        
        assertEquals(expectedValues.size(), actualValues.size());
        assertEquals(expectedValues, actualValues);
    }

    /**
     *          2
     *         /   => [1, 2]
     *        1
     */
    @Test
    public void testTreeNodeDepthFirstSearch2NodesLeftTree() {
        BinaryTreeNodeImpl<Integer, String> node1 = 
                new BinaryTreeNodeImpl<Integer, String>(1, "node1");
        BinaryTreeNodeImpl<Integer, String> node2 = 
                new BinaryTreeNodeImpl<Integer, String>(2, "node2");
        DepthFirstSearchTraverser<Integer, String> dfs = 
                new DepthFirstSearchTraverser<Integer, String>();
        
        node2.attachLeftNode(node1);
        
        List<Integer> expectedKeys = new ArrayList<Integer>(2);
        List<String> expectedValues = new ArrayList<String>(2);
        
        expectedKeys.add(1);
        expectedKeys.add(2);
        
        expectedValues.add("node1");
        expectedValues.add("node2");
        
        List<Integer> actualKeys = dfs.keys(node2);
        List<String> actualValues = dfs.values(node2);
        
        assertEquals(expectedKeys.size(), actualKeys.size());
        assertEquals(expectedKeys, actualKeys);
        
        assertEquals(expectedValues.size(), actualValues.size());
        assertEquals(expectedValues, actualValues);
    }
    
    /**
     *         2
     *          \     => [2, 3]
     *           3
     */
    @Test
    public void testTreeNodeDepthFirstSearch2NodesRightTree() {
        BinaryTreeNodeImpl<Integer, String> node2 = 
                new BinaryTreeNodeImpl<Integer, String>(2, "node2");
        BinaryTreeNodeImpl<Integer, String> node3 = 
                new BinaryTreeNodeImpl<Integer, String>(3, "node3");
        DepthFirstSearchTraverser<Integer, String> dfs = 
                new DepthFirstSearchTraverser<Integer, String>();

        node2.attachRightNode(node3);
        
        List<Integer> expectedKeys = new ArrayList<Integer>(2);
        List<String> expectedValues = new ArrayList<String>(2);
        
        expectedKeys.add(2);
        expectedKeys.add(3);
        
        expectedValues.add("node2");
        expectedValues.add("node3");
        
        List<Integer> actualKeys = dfs.keys(node2);
        List<String> actualValues = dfs.values(node2);
        
        assertEquals(expectedKeys.size(), actualKeys.size());
        assertEquals(expectedKeys, actualKeys);
        
        assertEquals(expectedValues.size(), actualValues.size());
        assertEquals(expectedValues, actualValues);
    }
    
    /**
     *         2
     *        / \        =>   [1, 2, 3]
     *       1   3
     */
    @Test
    public void testTreeNodeDepthFirstSearch3NodesTree() {
        BinaryTreeNodeImpl<Integer, String> node1 = 
                new BinaryTreeNodeImpl<Integer, String>(1, "node1");
        BinaryTreeNodeImpl<Integer, String> node2 = 
                new BinaryTreeNodeImpl<Integer, String>(2, "node2");
        BinaryTreeNodeImpl<Integer, String> node3 = 
                new BinaryTreeNodeImpl<Integer, String>(3, "node3");
        DepthFirstSearchTraverser<Integer, String> dfs = 
                new DepthFirstSearchTraverser<Integer, String>();
        
        node2.attachLeftNode(node1);
        node2.attachRightNode(node3);

        List<Integer> expectedKeys = new ArrayList<Integer>(3);
        List<String> expectedValues = new ArrayList<String>(3);
        
        expectedKeys.add(1);
        expectedKeys.add(2);
        expectedKeys.add(3);
        
        expectedValues.add("node1");
        expectedValues.add("node2");
        expectedValues.add("node3");
        
        List<Integer> actualKeys = dfs.keys(node2);
        List<String> actualValues = dfs.values(node2);
        
        assertEquals(expectedKeys.size(), actualKeys.size());
        assertEquals(expectedKeys, actualKeys);
        
        assertEquals(expectedValues.size(), actualValues.size());
        assertEquals(expectedValues, actualValues);
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
        BinaryTreeNodeImpl<Integer, String> node1 = new BinaryTreeNodeImpl<Integer, String>(1, "node1");
        BinaryTreeNodeImpl<Integer, String> node2 = new BinaryTreeNodeImpl<Integer, String>(2, "node2");
        BinaryTreeNodeImpl<Integer, String> node3 = new BinaryTreeNodeImpl<Integer, String>(3, "node3");
        BinaryTreeNodeImpl<Integer, String> node4 = new BinaryTreeNodeImpl<Integer, String>(4, "node4");
        BinaryTreeNodeImpl<Integer, String> node5 = new BinaryTreeNodeImpl<Integer, String>(5, "node5");
        BinaryTreeNodeImpl<Integer, String> node6 = new BinaryTreeNodeImpl<Integer, String>(6, "node6");
        BinaryTreeNodeImpl<Integer, String> node7 = new BinaryTreeNodeImpl<Integer, String>(7, "node7");
        BinaryTreeNodeImpl<Integer, String> node8 = new BinaryTreeNodeImpl<Integer, String>(8, "node8");
        
        DepthFirstSearchTraverser<Integer, String> dfs = new DepthFirstSearchTraverser<Integer, String>();
        
        node2.attachLeftNode(node1);
        node2.attachRightNode(node3);
        node4.attachLeftNode(node2);
        
        node7.attachRightNode(node8);
        node6.attachLeftNode(node5);
        node6.attachRightNode(node7);
        node4.attachRightNode(node6);
        
        List<Integer> expectedKeys = new ArrayList<Integer>(8);
        List<String> expectedValues = new ArrayList<String>(8);
        
        expectedKeys.add(1);
        expectedKeys.add(2);
        expectedKeys.add(3);
        expectedKeys.add(4);
        expectedKeys.add(5);
        expectedKeys.add(6);
        expectedKeys.add(7);
        expectedKeys.add(8);
        
        expectedValues.add("node1");
        expectedValues.add("node2");
        expectedValues.add("node3");
        expectedValues.add("node4");
        expectedValues.add("node5");
        expectedValues.add("node6");
        expectedValues.add("node7");
        expectedValues.add("node8");
        
        List<Integer> actualKeys = dfs.keys(node4);
        List<String> actualValues = dfs.values(node4);
        
        assertEquals(expectedKeys.size(), actualKeys.size());
        assertEquals(expectedKeys, actualKeys);
        
        assertEquals(expectedValues.size(), actualValues.size());
        assertEquals(expectedValues, actualValues);
        
    }
}
