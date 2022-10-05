/* O(nlogn) time compexity */
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int s:stones) q.add(s);
        while(!q.isEmpty()) {
            int a = q.poll();
            if(q.isEmpty()) return a;
            int b = q.poll();
            if(a<b) q.add(b-a);
            if(b<a) q.add(a-b);
        }
        return 0;
    }
}
