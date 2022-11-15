/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }                                        
 */  
//By this logic, in the first case, compare the left sub-tree height with the right sub-tree height. If //they are equal it is a full tree, then the answer will be 2^height – 1. Otherwise, If they aren’t equal, //recursively call for the left sub-tree and the right sub-tree to count the number of nodes.
public class Solution {                      
    public int countNodes(TreeNode root) { 
        if (root == null) {        
            return 0;
        }
        int left = leftDepth(root); //3    
        int right = rightDepth(root);//2
        if (left == right) {
            return (1<<left) - 1;//2^height – 1
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }
    private int leftDepth(TreeNode node) {
        int count = 0; 
        while (node != null) {
            count ++;
            node = node.left;
        }
        return count;
    }
    private int rightDepth(TreeNode node) {
        int count = 0;
        while (node != null) {
            count ++;
            node = node.right;
        }
        return count;
    }
}