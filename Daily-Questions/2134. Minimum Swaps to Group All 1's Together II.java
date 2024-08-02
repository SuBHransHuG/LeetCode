class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int totalOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                totalOnes++;
            }
        }

        if (totalOnes == 0) {
            return 0;
        }

        int currentOnes = 0;
        for (int i = 0; i < totalOnes; i++) {
            if (nums[i] == 1) {
                currentOnes++;
            }
        }

        int maxOnesInWindow = currentOnes;

        for (int i = totalOnes; i < n + totalOnes; i++) {
            if (nums[i % n] == 1) {
                currentOnes++;
            }
            if (nums[(i - totalOnes) % n] == 1) {
                currentOnes--;
            }
            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnes);
        }

        return totalOnes - maxOnesInWindow;
    }
}
