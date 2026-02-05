class Solution {
    public int minSwaps(String s) {
    int open = 0, close = 0, imbalance = 0;
        for(int i = 0; i< s.length(); i++) {
            Character c = s.charAt(i);
            open += c.equals('[') ? 1 : 0;
            close += c.equals(']') ? 1 : 0;
            if(open < close) {
                imbalance++;
                close--;
            }
        }
        return (imbalance + 1) / 2;
    }
}
