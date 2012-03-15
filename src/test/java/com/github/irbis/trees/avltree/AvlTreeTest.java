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
    
    /**
     *             2
     *            / \    => [1, 2, 3]
     *           1   3
     */
    @Test
    public void testAvlTreeWithThreeNodes() {
        AvlTree<Integer> avlTree = new AvlTree<Integer>(1);
        
        avlTree.put(2);
        avlTree.put(3);
        
        List<Integer> expectedElements = new ArrayList<Integer>();
        
        expectedElements.add(1);
        expectedElements.add(2);
        expectedElements.add(3);
        
        assertEquals(expectedElements, avlTree.traverse());
        
    }
}
