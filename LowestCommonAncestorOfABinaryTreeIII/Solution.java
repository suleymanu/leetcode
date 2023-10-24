class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Set<Node> s = new HashSet();
        while(p!=null || q!=null) {
            if(s.contains(p)) return p;
            if(p!=null) {s.add(p); p=p.parent;}
            if(s.contains(q)) return q;
            if(q!=null) {s.add(q); q=q.parent;}
        }
        return null;
    }
}
