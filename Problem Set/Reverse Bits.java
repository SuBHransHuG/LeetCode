public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int x) {
        String s = "";
        for (int i = 0; i <= 31; i++) {
            if ((x & (1L << i)) != 0) {
                s = '1' + s;
            } else {
                s = '0' + s;
            }
        }
        int ans = 0;
        for (int i = 0; i <= 31; i++) {
            if (s.charAt((int)i) == '1') {
                ans += (1 << i);
            }
        }
        return ans;
        
    }
}
