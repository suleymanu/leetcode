// linear
class Solution {
    public int partitionString(String s) {
        int p=1;
        int[] d = new int[27];
        for(char c:s.toCharArray()) {
            if(d[c-'a']!=0)  {
                for(int i=0;i<27;i++) d[i]=0;
                p++;
            }
            d[c-'a']=1;
        }
        return p;
    }
}
