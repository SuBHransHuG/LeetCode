class Solution {
    public int[] singleNumber(int[] nums) {
        int res1 = 0, res2 = 0, r = 0;
        
        for (int i = 0; i < nums.length; i++) {
            r = r ^ nums[i];
        }
        
        int s = r & (~(r - 1));
        
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & s) != 0) {
                res1 = res1 ^ nums[i];
            } else {
                res2 = res2 ^ nums[i];
            }
        }
        
        return new int[]{res1, res2};
    }
}
