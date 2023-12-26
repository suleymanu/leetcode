/* Shorther. Push the oppostie from the beginning. */
class Solution {
    public boolean isValid(String s) {
        Stack<Character> t = new Stack();
        for(char c:s.toCharArray()) {
            if(c=='(') t.push(')');
            else if(c=='[') t.push(']');
            else if(c=='{') t.push('}');
            else if(t.isEmpty() || t.pop()!=c) return false;
        }
        return t.isEmpty();
    }
}
