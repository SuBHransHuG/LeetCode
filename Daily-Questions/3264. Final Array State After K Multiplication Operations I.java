class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;

        while(k>0){
            int min = Integer.MAX_VALUE;
            for(int i =0;i<n;i++){
                min = Math.min(min,nums[i]);
            }
            for(int i =0;i<n;i++){
                if(nums[i] == min){
                    nums[i] = min*multiplier;
                    break;
                }
            }
            k--;
        }
        return nums;
    }
}
