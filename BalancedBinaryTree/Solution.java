/* Inefficient but clean code. getHeight is called for every cell. */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        return isBalanced(root.left) && isBalanced(root.right) && 
            Math.abs(getHeight(root.left)-getHeight(root.right))<2;
    }

    int getHeight(TreeNode root) {
        if(root==null) return 0;
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }
}
