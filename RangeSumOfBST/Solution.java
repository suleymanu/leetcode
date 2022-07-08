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
/* O(n) time. O(1) space. Recursive. */
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root==null)
            return 0;
        
        else if(root.val<low)
            return rangeSumBST(root.right,low,high);
        
        else if(root.val>high)
            return rangeSumBST(root.left,low,high);
        
        else
            return root.val + 
                rangeSumBST(root.left,low,high) + 
                rangeSumBST(root.right,low,high);
    }
}
