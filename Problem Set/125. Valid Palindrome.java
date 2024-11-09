class Solution {
    public boolean isPalindrome(String s) {
        String cleanedPhrase = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = cleanedPhrase.toCharArray();
        int length = arr.length;
        int j = length - 1;
        for(int i =0;i<length;i++){
            if(i == j){
                break;
            }
            if(arr[i]!=arr[j]){
                return false;
            }
            j--;
        }
        return true;
    }
}
