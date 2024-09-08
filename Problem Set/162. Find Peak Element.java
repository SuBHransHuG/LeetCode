class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n-1;
        while(l<h){
            int mid = l + (h-l) / 2;
           
            if(nums[mid]<nums[mid+1]){
                l = mid + 1;
            }else{
                h = mid;
            }
        }
        return l;
    }
}
