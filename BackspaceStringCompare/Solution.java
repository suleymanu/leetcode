/* In-place. First trial. */
class Solution {
    public boolean backspaceCompare(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        int si=0,ti=0;
        for(int i=0; i<sa.length; i++)
            if(sa[i]!='#') sa[si++]=sa[i];
            else if(si>0) si--;
        for(int i=0; i<ta.length; i++)
            if(ta[i]!='#') ta[ti++]=ta[i];
            else if(ti>0) ti--;
        System.out.println("si:"+si+" ti:"+ti);
        if(si!=ti) return false;
        for(int i=0; i<si; i++)
            if(sa[i]!=ta[i]) return false;
        return true;
    }
}
