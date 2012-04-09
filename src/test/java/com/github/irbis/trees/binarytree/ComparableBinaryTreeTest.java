package com.github.irbis.trees.binarytree;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class ComparableBinaryTreeTest {
    /**
     * Fills a tree:
     * <pre>
     *              1
     *               \
     *                2
     * </pre>
     */
    @Test
    public void testComparableTreeWithTwoNodes() {
        ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>> tree = 
                new ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>>(1, 
                        new DepthFirstSearchTraverser<Integer>());
        
        tree.put(2);
        
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        
        assertEquals(expectedElements, tree.traverse());
    }
    
    /**
     * Fills a tree, but adds 2 twice.
     * <pre>
     *              1
     *               \
     *                2
     * </pre>
     */
    @Test
    public void testComparableTreeWithTwoNodesTwiceAdd() {
        ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>> tree = 
                new ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>>(1, 
                        new DepthFirstSearchTraverser<Integer>());
        
        tree.put(2);
        tree.put(2);
        
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        
        assertEquals(expectedElements, tree.traverse());
    }
 
    /**
     * Fills a tree:
     * <pre>
     *             2
     *            / \
     *           1   3
     * </pre
     */
    @Test
    public void testComparableTreeWithThreeNodes() {
        ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>> tree = 
                new ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>>(2, 
                        new DepthFirstSearchTraverser<Integer>());
        
        tree.put(1);
        tree.put(3);
        
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        expectedElements.add(3);
        
        assertEquals(expectedElements, tree.traverse());
        
    }
    
    /**
     * Fills a tree:
     * <pre>
     *             2
     *            / \
     *           1   3
     *                \
     *                 4
     * </pre>
     */
    @Test
    public void testComparableTreeWithFourNodes() {
        ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>> tree = 
                new ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>>(2, 
                        new DepthFirstSearchTraverser<Integer>());

        tree.put(1);
        tree.put(3);
        tree.put(4);
        
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        expectedElements.add(3);
        expectedElements.add(4);
        
        assertEquals(expectedElements, tree.traverse());
        
    }
    
    /**
     * Fills a tree:
     * <pre>
     *             2
     *            / \
     *           1   4
     *              / \
     *             3   5
     * </pre>
     */
    @Test
    public void testComparableTreeWithFiveNodes() {
        ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>> tree = 
                new ComparableBinaryTree<Integer, DepthFirstSearchTraverser<Integer>>(2, 
                        new DepthFirstSearchTraverser<Integer>());
        
        tree.put(1);
        tree.put(4);
        tree.put(4);
        tree.put(3);
        tree.put(5);
        
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        expectedElements.add(3);
        expectedElements.add(4);
        expectedElements.add(5);
        
        assertEquals(expectedElements, tree.traverse());
        
    }
}
