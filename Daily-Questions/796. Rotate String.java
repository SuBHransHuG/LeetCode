

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}


// another code
import java.util.Arrays;

class Solution {
    public boolean rotateString(String s, String goal) {
        int c = s.length();
        if (c != goal.length()) {
            return false;
        }
        
        char[] arr = s.toCharArray();
        char[] arr1 = goal.toCharArray();
        
        while (c > 0) {
            // Rotate the array by one position to the left
            char firstChar = arr[0];
            for (int i = 0; i < s.length() - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[s.length() - 1] = firstChar;

            // Compare the rotated array with the goal array
            if (Arrays.equals(arr, arr1)) {
                return true;
            }
            
            c--;
        }
        
        return false;
    }
}
