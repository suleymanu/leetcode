/* First trial. Worked at first run. */
class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer,Queue> m = new HashMap();
        for(int a : arr) {
            int c = numOfOnes(a);
            if(m.containsKey(c))
                m.get(c).add(a);
            else {
                Queue<Integer> q = new PriorityQueue();
                q.add(a);
                m.put(c,q);
            }
        }
        int[] r = new int[arr.length];
        int x = 0;
        for(int i=0; i<=32; i++) {
            if(m.containsKey(i)) {
                Queue<Integer> q = m.get(i);
                while(!q.isEmpty()) {
                    r[x++] = q.poll();
                }
            }
        }
        return r;
            
    }
    
    public int numOfOnes(int a) {
        int r=0;
        while(a>0) {
            r += a%2;
            a /= 2;
        }
        return r;
    }
}
