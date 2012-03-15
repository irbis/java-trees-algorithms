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
        AvlTree<Integer, String> avlTree = new AvlTree<Integer, String>(1, "node1");
        List<Integer> expectedKeys = new ArrayList<Integer>();
        List<String> expectedValues = new ArrayList<String>();
        
        expectedKeys.add(1);
        expectedValues.add("node1");
        
        assertEquals(expectedKeys, avlTree.keys());
        assertEquals(expectedValues, avlTree.values());
    }
    
    /**
     *              1
     *               \  => [1, 2]
     *                2
     */
    @Test
    public void testAvlTreeWithTwoNodes() {
        AvlTree<Integer, String> avlTree = new AvlTree<Integer, String>(1, "node1");
        
        avlTree.put(2, "node2");
        
        List<Integer> expectedKeys = new ArrayList<Integer>();
        List<String> expectedValues = new ArrayList<String>();
        
        expectedKeys.add(1);
        expectedKeys.add(2);
        expectedValues.add("node1");
        expectedValues.add("node2");
        
        assertEquals(expectedKeys, avlTree.keys());
        assertEquals(expectedValues, avlTree.values());
        
    }
    
    /**
     *             2
     *            / \    => [1, 2, 3]
     *           1   3
     */
    @Test
    public void testAvlTreeWithThreeNodes() {
        AvlTree<Integer, String> avlTree = new AvlTree<Integer, String>(1, "node1");
        
        avlTree.put(2, "node2");
        avlTree.put(3, "node3");
        
        List<Integer> expectedKeys = new ArrayList<Integer>();
        List<String> expectedValues = new ArrayList<String>();
        
        expectedKeys.add(1);
        expectedKeys.add(2);
        expectedKeys.add(3);
        expectedValues.add("node1");
        expectedValues.add("node2");
        expectedValues.add("node3");
        
        assertEquals(expectedKeys, avlTree.keys());
        assertEquals(expectedValues, avlTree.values());
        
    }
}
