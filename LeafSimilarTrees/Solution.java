class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList();
        List<Integer> l2 = new ArrayList();
        findSequence(root1,l1);
        findSequence(root2,l2);
        return l1.equals(l2);
    }

    private void findSequence(TreeNode node, List<Integer> l) {
        if(node==null) return;
        if(node.left==null && node.right==null) l.add(node.val);
        else {
            findSequence(node.left,l);
            findSequence(node.right,l);
        }
    }
}
