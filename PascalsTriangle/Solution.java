/* O(n) time. O(n) space. [n is total numbers in triangle] */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>(1);
        l.add(1);
        res.add(l);
        for(int r=1; r<numRows; r++) {
            l = new ArrayList<>(r+1);
            l.add(1);
            List<Integer> p = res.get(r-1);
            for(int i=1; i<p.size(); i++)
                l.add(p.get(i-1)+p.get(i));
            l.add(1);
            res.add(l);
        }
        return res;
    }
}
