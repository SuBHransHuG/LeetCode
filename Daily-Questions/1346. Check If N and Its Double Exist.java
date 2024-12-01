class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        int c = 0;
        for(int i =0;i<n;i++){
            int j =n-1;
            while(j>=0){
                if(arr[i] == 2*arr[j] && i!=j){
                return true;
                }
            j--;
            }
            }
        return false;
    }
}
