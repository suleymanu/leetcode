/* Iterative. */
class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList();
        Stack<TreeNode> s = new Stack();
        TreeNode c = root;
        while(c != null || !s.isEmpty()) {
            while(c != null) {
                s.add(c);
                c = c.left;
            }
            c = s.pop();
            l.add(c.val);
            c = c.right;
        }
        return l;
    }
}
