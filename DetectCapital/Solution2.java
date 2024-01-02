class Solution2 {
    public boolean detectCapitalUse(String word) {
        if(word.length()<2) return true;
        boolean a = Character.isUpperCase(word.charAt(0));
        boolean b = Character.isUpperCase(word.charAt(1));
        if(!a && b) return false;
        for(int i=2; i<word.length(); ++i) {
            char c = word.charAt(i);
            System.out.println("Checking: "+c);
            if(b && !Character.isUpperCase(c)) return false;
            else if(!b && Character.isUpperCase(c)) return false;
        }
        return true;
    }
}
