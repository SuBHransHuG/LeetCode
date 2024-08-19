class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        if (target <= nums[0]) {
            return 0;
        }

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] < target && target < nums[i + 1]) {
                return i + 1;
            }
        }

        if (nums[n - 1] == target) {
            return n - 1;
        }

        return n;
    }
}
