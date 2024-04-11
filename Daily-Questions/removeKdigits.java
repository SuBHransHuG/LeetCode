class Solution {
    public String removeKdigits(String num, int k) {
      StringBuilder stack = new StringBuilder();
        for (char digit : num.toCharArray()) {
    
            while (k > 0 && stack.length() > 0 && stack.charAt(stack.length() - 1) > digit) {
                stack.deleteCharAt(stack.length() - 1);
                k--;
            }
            stack.append(digit);
        }
        while (k > 0) {
            stack.deleteCharAt(stack.length() - 1);
            k--;
        }
      
        int nonZeroIndex = 0;
        while (nonZeroIndex < stack.length() && stack.charAt(nonZeroIndex) == '0') {
            nonZeroIndex++;
        }
        String result = stack.substring(nonZeroIndex);
      
        return result.isEmpty() ? "0" : result;  
    }
}
