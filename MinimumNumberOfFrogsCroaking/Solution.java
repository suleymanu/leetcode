class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int[] cnt = new int[5];
        int frgs=0, r=0;
        char[] cof = croakOfFrogs.toCharArray();
        for(char c:cof) {
            int l = "croak".indexOf(c);
            ++cnt[l];
            if(l==0) r = Math.max(r,++frgs);
            else if(--cnt[l-1]<0) return -1;
            else if(l==4) --frgs;
        }
        return frgs==0?r:-1;
    }
}
