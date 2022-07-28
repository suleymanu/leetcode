/* Two maps. Map.merge(). */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> noteMap = new HashMap();
        Map<Character,Integer> magazineMap = new HashMap();
        for(char c:ransomNote.toCharArray())
            noteMap.merge(c,1,Integer::sum);
        for(char c:magazine.toCharArray())
            magazineMap.merge(c,1,Integer::sum);
        for(char c:noteMap.keySet())
            if(noteMap.get(c)>magazineMap.getOrDefault(c,0))
                return false;
        return true;
    }
}
