class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for(int i=0; i<=heights.length; ) {
            int height = (i==heights.length ? 0 : heights[i]);
            if(s.isEmpty() || height >= heights[s.peek()]) s.push(i++);
            else maxArea = Math.max(maxArea, heights[s.pop()]*(s.isEmpty()?i:i-1-s.peek()));
            System.out.println(maxArea);
        }
        return maxArea;
    }
}
