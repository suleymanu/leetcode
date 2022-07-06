/* Could be a fast alternative. Creats groups of 15. */
class Solution2 {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>(n);
        int i=1;
        while(i<=n/15*15) {
            output.add(String.valueOf(i));
            output.add(String.valueOf((i+1)));
            output.add("Fizz");
            output.add(String.valueOf((i+3)));
            output.add("Buzz");
            output.add("Fizz");
            output.add(String.valueOf((i+6)));
            output.add(String.valueOf((i+7)));
            output.add("Fizz");
            output.add("Buzz");
            output.add(String.valueOf((i+10)));
            output.add("Fizz");
            output.add(String.valueOf((i+12)));
            output.add(String.valueOf((i+13)));
            output.add("FizzBuzz");
            i+=15;
        }
        while(i<=n) {
            int remainder = i%15;
            switch (remainder) {
                case 5:
                case 10:
                    output.add("Buzz");
                    break;
                case 3:
                case 6:
                case 9:
                case 12:
                    output.add("Fizz");
                    break;
                default:
                    output.add(String.valueOf(i));
                    break;
            }
            i++;
        }
        return output;
    }
}
