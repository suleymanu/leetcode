/* O(n) time. O(n) space. Uses hash map and hash set. Easy to implement and readable. */
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> ocMap = new HashMap<>();
        for(int a:arr) {
            if(ocMap.containsKey(a))
                ocMap.put(a,ocMap.get(a)+1);
            else
                ocMap.put(a,1);
        }
        Set<Integer> set = new HashSet<>(ocMap.values());
        return set.size()==ocMap.values().size();
    }
}
