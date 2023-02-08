class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length()==1) return true;
        boolean firstLower = Character.isLowerCase(word.charAt(0));
        boolean secondLower = Character.isLowerCase(word.charAt(1));
        if(firstLower) {
            for(int i=1; i<word.length(); i++)
                if(Character.isUpperCase(word.charAt(i)))
                    return false;
            return true;
        }
        else { //firstUpper
            if(secondLower) {
                for(int i=1; i<word.length(); i++)
                    if(Character.isUpperCase(word.charAt(i)))
                        return false;
                return true;
            } else {
                    for(int i=1; i<word.length(); i++)
                    if(Character.isLowerCase(word.charAt(i)))
                        return false;
                return true;
            }
        }
    }
}
