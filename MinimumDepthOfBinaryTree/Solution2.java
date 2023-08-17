/* Recursive DFS. One function. */
class Solution2 {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        int l=minDepth(root.left), r=minDepth(root.right), m=Math.min(l,r);
        return (m==0?Math.max(l,r):m)+1;
    }
}
