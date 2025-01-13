class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left =0;
        int right = n-1;
        int res =0;
        while(left<right){
            int w = Math.min(height[left],height[right])*(right-left);
            res = Math.max(w,res);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}
