/* O(n) time. O(n) space. Quick to implement. */
class Solution {
    public List<String> fizzBuzz(int n) {
        String[] answer = new String[n];
        for(int i=1; i<=n; i++) {
            boolean t = i%3==0;
            boolean f = i%5==0;
            if(t&&f)
                answer[i-1] = "FizzBuzz";
            else if(t)
                answer[i-1] = "Fizz";
            else if(f)
                answer[i-1] = "Buzz";
            else
                answer[i-1] = String.valueOf(i);
        }
        return Arrays.asList(answer);
    }
}
