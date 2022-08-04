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
/* In-order traversal collects values sorted in BST. Keep them in a List. Then, generate a new Tree. */
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> values = new ArrayList();
        inorder(root, values);
        TreeNode head = new TreeNode(0);
        TreeNode node = head;
        for(int value : values) {
            node.right = new TreeNode(value);
            node = node.right;
        }
        return head.right;
    }
    
    public void inorder(TreeNode node, List<Integer> values) {
        if(node==null) return;
        inorder(node.left, values);
        values.add(node.val);
        inorder(node.right, values);
    }
}
