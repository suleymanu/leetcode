/* O(nlogn) time. Uses sorting. Consider using Heap. */
class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer,List<Integer>> scores = new HashMap();
        for(int[] item : items) {
            if(scores.containsKey(item[0]))
                scores.get(item[0]).add(item[1]);
            else
                scores.put(item[0],new ArrayList(Arrays.asList(item[1])));
        }
        int[][] result = new int[scores.keySet().size()][2];
        int index = 0;
        for(int i : List.copyOf(scores.keySet())){
            Collections.sort(scores.get(i),Collections.reverseOrder());
            int sum = 0;
            for(int j=0; j<5; j++)
                sum += scores.get(i).get(j);
            result[index][0] = i;
            result[index][1] = sum/5;
            index++;
        }
        return result;
    }
}
