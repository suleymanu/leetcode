class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        targetSum-=root.val;
        if(root.left==null && root.right==null && targetSum==0) return true;
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }
}
