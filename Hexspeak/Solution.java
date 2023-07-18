class Solution {
    public String toHexspeak(String num) {
        Map<Integer,Character> m = new HashMap<>(8);
        int[] a={0,1,10,11,12,13,14,15}; char[] c={'O','I','A','B','C','D','E','F'};
        for(int i=0;i<8;i++) m.put(a[i],c[i]);
        StringBuilder sb = new StringBuilder();
        for(long l = Long.parseLong(num);l>0;l/=16) {
            int r = (int)(l%16);
            if(r>1 && r<10) return "ERROR";
            else sb.append(m.get(r));
        }
        return sb.reverse().toString();
    }
}
