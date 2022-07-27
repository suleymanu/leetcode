/* JAVA stream. */
class Solution2 {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> m = new HashMap();
        Arrays.stream(nums).forEach(n->m.put(n,m.getOrDefault(n,0)+1));
        return Arrays.stream(nums).boxed()
            .sorted((a,b)->m.get(a)!=m.get(b)?m.get(a)-m.get(b):b-a)
            .mapToInt(n->n)
            .toArray();
    }
}
