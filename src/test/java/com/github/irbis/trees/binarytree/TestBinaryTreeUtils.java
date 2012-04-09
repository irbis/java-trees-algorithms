package com.github.irbis.trees.binarytree;

/**
 *
 * @author A.Nadtochey<irbis@github.com>
 */
public class TestBinaryTreeUtils {

    private TestBinaryTreeUtils() {
    }
    
    /**
     * Creates node with the following structure:
     * <pre>
     *           2
     *          /
     *         1
     * </pre>
     * 
     * @return tree node witch is root.
     */
    static BinaryTreeNode<Integer> createTreeWithTwoElementsLeft() {
        BinaryTreeNode<Integer> rootNode = new BinaryTreeNodeImpl<Integer>(2);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNodeImpl<Integer>(1);
        
        rootNode.attachLeftNode(node1);
        
        return rootNode;
    }
    
    /**
     * Creates node with the following structure:
     * <pre>
     *         2
     *          \
     *           3
     * </pre>
     * @return tree node witch is root.
     */
    static BinaryTreeNode<Integer> createTreeWithTwoElementsRight() {
        BinaryTreeNode<Integer> rootNode = new BinaryTreeNodeImpl<Integer>(2);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNodeImpl<Integer>(3);
        
        rootNode.attachRightNode(node3);
        
        return rootNode;
    }
    
    /**
     * Creates node with the following structure:
     * <pre>
     *         2
     *        / \
     *       1   3 
     * </pre>
     * @return tree node witch is root.
     */
    static BinaryTreeNode<Integer> createTreeWithThreeElements() {
        BinaryTreeNode<Integer> rootNode = new BinaryTreeNodeImpl<Integer>(2);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNodeImpl<Integer>(1);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNodeImpl<Integer>(3);
        
        rootNode.attachLeftNode(node1);
        rootNode.attachRightNode(node3);
        
        return rootNode;
    }
    
    /**
     * Creates tree with 8 elements with the following structure:
     * <pre>
     *                     4
     *                    /  \
     *                   2    6
     *                  / \  / \
     *                 1  3  5  7
     *                           \
     *                            8
     * </pre>
     * @return tree node witch is root.
     */
    static BinaryTreeNode<Integer> createTreeWithEightElements() {
        BinaryTreeNodeImpl<Integer> rootNode = new BinaryTreeNodeImpl<Integer>(4);
        BinaryTreeNodeImpl<Integer> node1 = new BinaryTreeNodeImpl<Integer>(1);
        BinaryTreeNodeImpl<Integer> node2 = new BinaryTreeNodeImpl<Integer>(2);
        BinaryTreeNodeImpl<Integer> node3 = new BinaryTreeNodeImpl<Integer>(3);
        BinaryTreeNodeImpl<Integer> node5 = new BinaryTreeNodeImpl<Integer>(5);
        BinaryTreeNodeImpl<Integer> node6 = new BinaryTreeNodeImpl<Integer>(6);
        BinaryTreeNodeImpl<Integer> node7 = new BinaryTreeNodeImpl<Integer>(7);
        BinaryTreeNodeImpl<Integer> node8 = new BinaryTreeNodeImpl<Integer>(8);
        
        node2.attachLeftNode(node1);
        node2.attachRightNode(node3);
        rootNode.attachLeftNode(node2);
        
        node7.attachRightNode(node8);
        node6.attachLeftNode(node5);
        node6.attachRightNode(node7);
        rootNode.attachRightNode(node6);
        
        return rootNode;
    }
}
