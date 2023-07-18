class Solution {
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        for(int i=0, j=c.length-1; i<j; i++, j--) {
            while(i<c.length && (c[i]<'A' || c[i]>'Z' && c[i]<'a' || c[i]>'z')) i++;
            while(j>=0 && (c[j]<'A' || c[j]>'Z' && c[j]<'a' || c[j]>'z')) j--;
            if(i<j) {char t=c[i]; c[i]=c[j]; c[j]=t;}
        }
        return new String(c);
    }
}
