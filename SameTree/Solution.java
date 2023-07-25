/* Recursive. */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null) return q==null?true:false;
        if(q==null) return p==null?true:false;
        if(p.val!=q.val) return false;
        else return isSameTree(p.left,q.left) &&
        isSameTree(p.right,q.right);
    }
}
