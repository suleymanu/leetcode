/* O(n) time. O(n) space. Stack Class is used. Using array for stack could be faster. */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char k : s.toCharArray()) {
            if(k=='(' || k=='{' || k=='[')
                stack.push(k);
            else {
                if(!stack.isEmpty()) {
                    switch (stack.pop()) {
                        case '(':
                            if(k!=')') return false; break;
                        case '{':
                            if(k!='}') return false; break;
                        case '[':
                            if(k!=']') return false; break;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
