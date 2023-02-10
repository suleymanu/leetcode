class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        for(String email : emails) {
            String[] a = email.split("\\@");
            String l = a[0].split("\\+")[0].replace(".","");
            set.add(l+"@"+a[1]);
        }
        return set.size();
    }
}
