/* First trial. Recursive, DFS. Additional function. */
class Solution {
    public int minDepth(TreeNode root) {
        return root==null?0:minDepth(root, 1);
    }
    public int minDepth(TreeNode node, int depth) {
        if(node==null) return Integer.MAX_VALUE;
        if(node.left==null && node.right==null) return depth;
        return Math.min(minDepth(node.right,depth+1),minDepth(node.left,depth+1));
    }
}
