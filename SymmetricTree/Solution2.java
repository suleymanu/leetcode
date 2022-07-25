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
/* Iterative approach. Uses 2 queue. */
class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        TreeNode l, r;
        Queue<TreeNode> ls = new LinkedList(), rs = new LinkedList();
        ls.add(root.left);
        rs.add(root.right);
        while(!ls.isEmpty() || !rs.isEmpty()) {
            l = ls.poll();
            r = rs.poll();
            if(l==null && r==null) continue;
            if(l==null || r==null) return false;
            if(l.val!=r.val) return false;
            ls.add(l.left);
            rs.add(r.right);
            ls.add(l.right);
            rs.add(r.left);
        }
        return true;
    }
}
