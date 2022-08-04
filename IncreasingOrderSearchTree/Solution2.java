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
/* In-place. Uses a class member. */
class Solution {
    
    TreeNode index;
    
    public TreeNode increasingBST(TreeNode root) {
        TreeNode head = new TreeNode(0);
        index = head;
        inorder(root);
        return head.right;
    }
    
    public void inorder(TreeNode node) {
        if(node==null) return;
        inorder(node.left);
        node.left = null;
        index.right = node;
        index = node;
        inorder(node.right);
    }
}
