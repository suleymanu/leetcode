class Solution {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        Map<String,List<Pair>> map = new HashMap<>();
        for(int i=0; i<username.length; i++) {
            map.putIfAbsent(username[i],new ArrayList<Pair>());
            map.get(username[i]).add(new Pair(timestamp[i],website[i]));
        }
        Map<String,Integer> count = new HashMap<>();
        int max = 0;
        String res = "";
        for(String key : map.keySet()) {
            Set<String> set = new HashSet<>();
            List<Pair> l = map.get(key);
            Collections.sort(l,(a,b)->(a.timestamp-b.timestamp));
            int m = l.size();
            for(int i=0; i<m; i++)
                for(int j=i+1; j<m; j++)
                    for(int k=j+1; k<m; k++) {
                        String s = l.get(i).website+" "+l.get(j).website+" "+l.get(k).website;
                        if(!set.contains(s)) {
                            set.add(s);
                            int cnt = count.getOrDefault(s,0)+1;
                            count.put(s,cnt);
                            if(cnt>max || (cnt==max && s.compareTo(res)<0)) {
                                max = cnt;
                                res = s;
                            }
                        }
                    }
        }
        String[] r = res.split(" ");
        List<String> result = new ArrayList<>(3);
        for(String rr:r) result.add(rr);
        return result;
    }
    class Pair {
        int timestamp;
        String website;
        Pair(int timestamp, String website) {
            this.timestamp = timestamp;
            this.website = website;
        }
    }
}
