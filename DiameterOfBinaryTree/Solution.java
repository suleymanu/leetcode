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
/* O(n) time. O(1) sapce. Recursive approach.
Needs a separate function and variable. 
Check out the iterative approach. */
class Solution {
    
    int d=0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        findMaxDepth(root);
        return d;
    }
    
    public Integer findMaxDepth(TreeNode n) {
        if(n==null) return 0;
        int ld = findMaxDepth(n.left);
        int rd = findMaxDepth(n.right);
        d = Math.max(d,ld+rd);
        return Math.max(ld,rd)+1;
    }
}
