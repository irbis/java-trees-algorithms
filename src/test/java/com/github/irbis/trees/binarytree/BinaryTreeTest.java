package com.github.irbis.trees.binarytree;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Junit test to check routes of abstract class BinaryTree.
 * @author A.Nadtochey<irbis@github.com>
 */
public class BinaryTreeTest {
 
    private static class MockBinaryTree<E> 
    extends BinaryTree<E, BinaryTreeNode<E>, DepthFirstSearchTraverser<E>> {

        public MockBinaryTree(BinaryTreeNode<E> rootNode) {
            super(rootNode, new DepthFirstSearchTraverser<E>());
        }

        @Override
        public void put(E element) {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
    }
    
    @Test
    public void testContainsTreeWithOneNode() {
        BinaryTreeNode<Integer> rootNode = new BinaryTreeNodeImpl<Integer>(2);
        MockBinaryTree<Integer> tree = new MockBinaryTree<Integer>(rootNode);
        
        assertTrue(tree.contains(2));
        assertFalse(tree.contains(1));
    }
    
    @Test
    public void testContainsTreeWithTwoNodesLeft() {
        MockBinaryTree<Integer> tree = new MockBinaryTree<Integer>(
                TestBinaryTreeUtils.createTreeWithTwoElementsLeft());
        
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(2));
        assertFalse(tree.contains(3));
    }
    
    @Test
    public void testContainsTreeWithTwoNodesRight() {
        MockBinaryTree<Integer> tree = new MockBinaryTree<Integer>(
                TestBinaryTreeUtils.createTreeWithTwoElementsRight());
        
        assertTrue(tree.contains(3));
        assertTrue(tree.contains(2));
        assertFalse(tree.contains(1));
    }
    
    @Test
    public void testContainsTreeWithThreeNodes() {
        MockBinaryTree<Integer> tree = new MockBinaryTree<Integer>(
                TestBinaryTreeUtils.createTreeWithThreeElements());
        
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(2));
        assertTrue(tree.contains(3));
        assertFalse(tree.contains(4));
    }
    
    @Test
    public void testContainsTreeWithEightNodes() {
        MockBinaryTree<Integer> tree = new MockBinaryTree<Integer>(
                TestBinaryTreeUtils.createTreeWithEightElements());
        
        assertTrue(tree.contains(4));
        assertTrue(tree.contains(1));
        assertTrue(tree.contains(3));
        assertTrue(tree.contains(5));
        assertTrue(tree.contains(7));
        assertTrue(tree.contains(8));
        assertFalse(tree.contains(9));
    }
}
