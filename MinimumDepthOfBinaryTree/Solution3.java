/* BFS. */
class Solution3 {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList();
        q.offer(root);
        int d = 1;
        while(!q.isEmpty()) {
            int s = q.size();
            for(int i=0; i<s; ++i) {
                TreeNode n = q.poll();
                if(n.left==null && n.right==null) return d;
                if(n.left!=null) q.offer(n.left);
                if(n.right!=null) q.offer(n.right);
            }
            ++d;
        }
        return d;
    }
}
