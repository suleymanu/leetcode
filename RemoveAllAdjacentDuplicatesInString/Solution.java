/* O(n) time. O(1) space. Uses stack. */
class Solution {
    public String removeDuplicates(String s) {
        char[] sc = s.toCharArray();
        Stack<Character> stack = new Stack();
        for(char c : s.toCharArray()) {
            if(!stack.empty() && stack.peek()==c)
                stack.pop();
            else
                stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.empty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
