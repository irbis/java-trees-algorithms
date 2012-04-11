package com.github.irbis.trees.binarytree;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class BreadthFirstSearchTraverserTest {
    
    /**
     *    1 => [1]
     */
    @Test
    public void testTreeNodeBreadthFirstSearch1NodeTree() {
        BinaryTreeNodeImpl<Integer> node1 = new BinaryTreeNodeImpl<Integer>(1);
        BreadthFirstSearchTraverser<Integer> bfs = 
                new BreadthFirstSearchTraverser<Integer>();
        
        List<Integer> expectedElements = new ArrayList<Integer>(1);
        
        expectedElements.add(1);
        
        List<Integer> actualElements = bfs.traverse(node1);
        assertEquals(expectedElements.size(), actualElements.size());
        assertEquals(expectedElements, actualElements);
    }
    
    /**
     *          2
     *         /   => [2, 1]
     *        1
     */
    @Test
    public void testTreeNodeBreadthFirstSearch2NodesLeftTree() {
        BinaryTreeNode rootNode = 
                TestBinaryTreeUtils.createTreeWithTwoElementsLeft();
        BreadthFirstSearchTraverser<Integer> bfs = 
                new BreadthFirstSearchTraverser<Integer>();
        
        List<Integer> expectedElements = new ArrayList<Integer>(2);
        expectedElements.add(2);
        expectedElements.add(1);
        
        List<Integer> actualElements = bfs.traverse(rootNode);        
        assertEquals(expectedElements.size(), actualElements.size());
        assertEquals(expectedElements, actualElements);
    }
    
    /**
     *         2
     *          \     => [2, 3]
     *           3
     */
    @Test
    public void testTreeNodeBreadthFirstSearch2NodesRightTree() {
        BinaryTreeNode<Integer> rootNode = 
                TestBinaryTreeUtils.createTreeWithTwoElementsRight();
        BreadthFirstSearchTraverser<Integer> bfs = 
                new BreadthFirstSearchTraverser<Integer>();
        
        List<Integer> expectedElements = new ArrayList<Integer>(2);
        expectedElements.add(2);
        expectedElements.add(3);
        
        List<Integer> actualElements = bfs.traverse(rootNode);
        assertEquals(expectedElements.size(), actualElements.size());
        assertEquals(expectedElements, actualElements);
    }
    
    /**
     *         2
     *        / \        =>   [2, 1, 3]
     *       1   3
     */
    @Test
    public void testTreeNodeBreadthFirstSearch3NodesTree() {
        BinaryTreeNode<Integer> rootNode =
                TestBinaryTreeUtils.createTreeWithThreeElements();
        BreadthFirstSearchTraverser<Integer> bfs = 
                new BreadthFirstSearchTraverser<Integer>();

        List<Integer> expectedElements = new ArrayList<Integer>(3);
        
        expectedElements.add(2);
        expectedElements.add(1);
        expectedElements.add(3);
        
        List<Integer> actualElements = bfs.traverse(rootNode);
        assertEquals(expectedElements.size(), actualElements.size());
        assertEquals(expectedElements, actualElements);
    }
    
    /**
     *                     4
     *                    /  \
     *                   2    6
     *                  / \  / \        => [4, 2, 6, 1, 3, 5, 7, 8]
     *                 1  3  5  7
     *                           \
     *                            8
     */    
    @Test
    public void testTreeNodeBreadthFirstSearchMediumTree() {
        BinaryTreeNode<Integer> rootNode = 
                TestBinaryTreeUtils.createTreeWithEightElements();
        BreadthFirstSearchTraverser<Integer> bfs =
                new BreadthFirstSearchTraverser<Integer>();
        
        List<Integer> expectedElements = new ArrayList<Integer>(8);
        expectedElements.add(4);
        expectedElements.add(2);
        expectedElements.add(6);
        expectedElements.add(1);
        expectedElements.add(3);
        expectedElements.add(5);
        expectedElements.add(7);
        expectedElements.add(8);
        
        List<Integer> actualElements = bfs.traverse(rootNode);
        assertEquals(expectedElements.size(), actualElements.size());
        assertEquals(expectedElements, actualElements);
    }
}
