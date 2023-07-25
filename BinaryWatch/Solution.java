/* Reverse check. 12.00 not included shomewhat. */
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> r = new ArrayList();
        for(int h=0; h<12; ++h)
            for(int m=0; m<=59; ++m)
                if(Integer.bitCount(h<<6|m)==turnedOn)
                    r.add(String.format("%d:%02d",h,m));
        return r;
    }
}
