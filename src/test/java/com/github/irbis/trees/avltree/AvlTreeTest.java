package com.github.irbis.trees.avltree;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class AvlTreeTest {
    
    /**
     *          1 => [1]
     */
    @Test
    public void testAvlTreeWithOneNode() {
        AvlTree<Integer> avlTree = new AvlTree<Integer>(1);
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        
        assertEquals(expectedElements, avlTree.traverse());
    }
    
    /**
     *              1
     *               \  => [1, 2]
     *                2
     */
    @Test
    public void testAvlTreeWithTwoNodes() {
        AvlTree<Integer> avlTree = new AvlTree<Integer>(1);
        
        avlTree.put(2);
        
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        
        assertEquals(expectedElements, avlTree.traverse());
    }
    
    @Test
    public void testAvlTreeWithTwoNodesTwiceAdd() {
        AvlTree<Integer> avlTree = new AvlTree<Integer>(1);
        
        avlTree.put(2);
        avlTree.put(2);
        
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        
        assertEquals(expectedElements, avlTree.traverse());
    }
    
    /**
     *             2
     *            / \    => [1, 2, 3]
     *           1   3
     */
    @Test
    public void testAvlTreeWithThreeNodes() {
        AvlTree<Integer> avlTree = new AvlTree<Integer>(2);
        
        avlTree.put(1);
        avlTree.put(3);
        
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        expectedElements.add(3);
        
        assertEquals(expectedElements, avlTree.traverse());
        
    }
    
    /**
     *             2
     *            / \    => [1, 2, 3, 4]
     *           1   3
     *                \
     *                 4
     */
    @Test 
    public void testAvlTreeWithFourNodes() {
        AvlTree<Integer> avlTree = new AvlTree<Integer>(2);
        avlTree.put(1);
        avlTree.put(3);
        avlTree.put(4);

        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        expectedElements.add(3);
        expectedElements.add(4);
        
        assertEquals(expectedElements, avlTree.traverse());
    }

    /**
     *             2
     *            / \    => [1, 2, 3, 4, 5]
     *           1   4
     *              / \
     *             3   5
     */
    @Test 
    public void testAvlTreeWithFiveNodes() {
        AvlTree<Integer> avlTree = new AvlTree<Integer>(2);
        avlTree.put(1);
        avlTree.put(4);
        avlTree.put(4);
        avlTree.put(3);
        avlTree.put(5);

        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        expectedElements.add(3);
        expectedElements.add(4);
        expectedElements.add(5);
        
        assertEquals(expectedElements, avlTree.traverse());
    }

}
