/* Efficient. One-pass. Passing balance info as -1. */
class Solution2 {
    public boolean isBalanced(TreeNode root) {
        return balanceHelper(root)!=-1;
    }

    int balanceHelper(TreeNode root) {
        if(root==null) return 0;
        int l = balanceHelper(root.left);
        int r = balanceHelper(root.right);
        return l==-1 || r==-1 || Math.abs(l-r)>1 ? -1 : Math.max(l,r)+1;
    }
}
