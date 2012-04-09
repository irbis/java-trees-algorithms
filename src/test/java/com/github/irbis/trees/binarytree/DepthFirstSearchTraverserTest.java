package com.github.irbis.trees.binarytree;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class DepthFirstSearchTraverserTest {
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
        BinaryTreeNode<Integer> node2 = TestBinaryTreeUtils.createTreeWithTwoElementsLeft();
        DepthFirstSearchTraverser<Integer> dfs = 
                new DepthFirstSearchTraverser<Integer>();
        
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
        BinaryTreeNode<Integer> node2 = 
                TestBinaryTreeUtils.createTreeWithTwoElementsRight();
        DepthFirstSearchTraverser<Integer> dfs = 
                new DepthFirstSearchTraverser<Integer>();

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
        BinaryTreeNode<Integer> node2 = 
                TestBinaryTreeUtils.createTreeWithThreeElements();
        DepthFirstSearchTraverser<Integer> dfs = 
                new DepthFirstSearchTraverser<Integer>();
        
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
        BinaryTreeNode<Integer> node4 = TestBinaryTreeUtils.createTreeWithEightElements();
        
        DepthFirstSearchTraverser<Integer> dfs = new DepthFirstSearchTraverser<Integer>();
        
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
