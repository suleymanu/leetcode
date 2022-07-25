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
/* Short recursive code. */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return root==null || check(root.left,root.right);
    }
    
    public boolean check(TreeNode l, TreeNode r) {
        if(l==null && r==null) return true;
        else if(l==null || r==null) return false;
        else return l.val==r.val && check(l.left,r.right) && check(l.right,r.left);
    }
}
