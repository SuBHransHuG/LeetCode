class Solution {
    public int findDuplicate(int[] nums) {
        int num=0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                num = nums[i];
                break;
            }
        }
        return num;
    }
}
