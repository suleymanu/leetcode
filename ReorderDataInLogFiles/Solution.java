class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                String[] s1a = s1.split(" ",2);
                String[] s2a = s2.split(" ",2);
                Boolean b1 = Character.isDigit(s1a[1].charAt(0));
                Boolean b2 = Character.isDigit(s2a[1].charAt(0));
                if(!b1 && !b2) {
                    int com = s1a[1].compareTo(s2a[1]);
                    if(com==0) com = s1a[0].compareTo(s2a[0]);
                    return com;
                } else return b1.compareTo(b2);
            }
        };
        Arrays.sort(logs,comparator);
        return logs;
    }
}
