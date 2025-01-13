class Solution {
    public int scoreOfString(String s) {
        char[] arr = s.toCharArray();
        int sum = 0;
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            sum+=Math.abs(arr[i]-arr[i+1]);
        }
        return sum;
    }
}
