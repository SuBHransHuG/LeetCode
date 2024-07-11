class Solution {
    public int findKthLargest(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int m = arr[n-k];
        return m;
    }
}
