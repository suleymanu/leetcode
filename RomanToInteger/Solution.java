/* O(1) time. O(1) space. Work from back to front. */
class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>(7);
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int pre = 0;
        int num = 0;
        for(int i = s.length()-1; i>=0; i--) {
            int cur = map.get(s.charAt(i));
            if(cur >= pre)
                num += cur;
            else
                num -= cur;
            pre = cur;
        }
        return num;
    }
}
