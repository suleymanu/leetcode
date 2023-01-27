class Solution {
    public int maximum69Number (int num) {
        char[] ca = String.valueOf(num).toCharArray();
        for(int i=0; i<ca.length; i++) {
            if(ca[i]=='6') {
                ca[i]='9';
                break;
            }
        }
        return (int) Integer.parseInt(new String(ca));
    }
}
