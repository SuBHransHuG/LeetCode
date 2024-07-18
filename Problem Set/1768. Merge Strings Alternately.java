class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        int j=0;
        int k=0;
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        int n= arr1.length;
        int m= arr2.length;
        char[] arr3 = new char[n+m];
        while(i<n && j<m){
            arr3[k++] = arr1[i++]; 
            arr3[k++] = arr2[j++]; 
        }
        while(i<n){
            arr3[k++] = arr1[i++]; 
        }
        while(j<m){
            arr3[k++] = arr2[j++]; 
        }
        return new String(arr3);
    }
}
