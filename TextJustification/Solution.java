class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> r = new ArrayList<>();
        for(int i=0; i<words.length; ) {
            List<String> l = new ArrayList<>();
            int c=0;
            int s=0;
            for(; i<words.length && c<=maxWidth; ++i) {
                int nl = s + words[i].length();
                if(c+nl <= maxWidth) {
                    c+=nl;
                    l.add(words[i]);
                }
                else break;
                s=1;
            }
            
            StringBuilder sb = new StringBuilder();
            sb.append(l.get(0));
            
            if(i==words.length || l.size()==1) {
                for(int lw=1; lw<l.size(); ++lw)
                    sb.append(" ").append(l.get(lw));
                for(int sc=0; sc<maxWidth-c; ++sc) sb.append(" ");
            } else {
                    
                int extraSpaceForEach = (maxWidth-c)/(l.size()-1);
                int numOfOneMoreExtra = (maxWidth-c)%(l.size()-1);
                
                for(int lw=1; lw<l.size(); ++lw) {
                    int x1 = numOfOneMoreExtra>0?1:0;
                    for(int sc=0; sc<extraSpaceForEach+1+x1; ++sc) sb.append(" ");
                    sb.append(l.get(lw));
                    --numOfOneMoreExtra;
                }
            }
            r.add(sb.toString());
        }
        return r;
    }
}
