class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int m = target.length;
        int n = arr.length;
        if(m!=n){
            return false;
        }
        else{
            int count=0;
            Arrays.sort(arr);
            Arrays.sort(target);
            for(int i=0;i<n;i++){
                if(arr[i]==target[i]){
                    count++;
                }
            }
            if(count==m){
                return true;
            }
            return false;
        }
    }
}
