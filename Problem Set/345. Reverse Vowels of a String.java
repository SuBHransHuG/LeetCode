class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        for (char c : s.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                vowels.append(c);
            }
        }
        
        char[] arr = s.toCharArray();
        int j = vowels.length() - 1;
        for (int i = 0; i < arr.length; i++) {
            if ("aeiouAEIOU".indexOf(arr[i]) != -1) {
                arr[i] = vowels.charAt(j--);
            }
        }
        
        return new String(arr);
    }
}
