class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0;
        int pos = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
              pos++;
            }
            if(nums[i]<0){
                neg++;
            }
        }
        int maximum = Math.max(pos,neg);
        return maximum;
    }
}
