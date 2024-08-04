
class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        final int MOD = 1000000007;
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum = (sum + nums[j]) % MOD;
                al.add(sum);
            }
        }
        
        Collections.sort(al);
        long result = 0;  
        for(int i = left - 1; i < right; i++) {
            result = (result + al.get(i)) % MOD;
        }
        
        return (int) result;
    }
}
