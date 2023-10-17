class Solution {
    TreeNode a = null;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode[] nodes) {
        Set<Integer> s = new HashSet();
        for(TreeNode n:nodes) s.add(n.val);
        lca(root,s);
        return a;
    }

    int lca(TreeNode n, Set<Integer> s) {
        if(n==null) return 0;
        int l = lca(n.left, s);
        int r = lca(n.right, s);
        int c = l+r+(s.contains(n.val)?1:0);
        if(c==s.size() && a==null) a=n;
        return c;
    }
}
