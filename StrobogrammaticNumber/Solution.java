class Solution {
    //0:0 1:1 6:9 8:8 9:6
    public boolean isStrobogrammatic(String num) {
        Map<Character,Character> m = new HashMap(10);
        m.put('0','0');
        m.put('1','1');
        m.put('2','x');
        m.put('3','x');
        m.put('4','x');
        m.put('5','x');
        m.put('6','9');
        m.put('7','x');
        m.put('8','8');
        m.put('9','6');
        for(int i=0; i<num.length(); i++)
            if(m.get(num.charAt(i))!=num.charAt(num.length()-1-i))
                return false;
        return true;
    }
}
