class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> m = new HashMap<>();
        for(String domain:cpdomains) {
            String[] cd = domain.split(" ");
            int rep = Integer.valueOf(cd[0]);
            m.merge(cd[1], rep, Integer::sum);
            String[] ds = cd[1].split("\\.");
            if(ds.length==2) m.merge(ds[1], rep, Integer::sum);
            else if(ds.length==3) {
                m.merge(ds[1]+"."+ds[2], rep, Integer::sum);
                m.merge(ds[2], rep, Integer::sum);
            }
        }
        List<String> res = new ArrayList<>();
        for(Map.Entry<String,Integer> e:m.entrySet()) res.add(e.getValue().toString()+" "+e.getKey());
        return res;
    }
}
