class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] allow = allowed.toCharArray();
        char[][] charArrays = new char[words.length][];
        int count = 0;
        int m = allow.length;

        for (int i = 0; i < words.length; i++) {
            charArrays[i] = words[i].toCharArray();
        }

        for (int i = 0; i < words.length; i++) {
            boolean isConsistent = true;

            for (char c : charArrays[i]) {
                boolean found = false;
                for (int j = 0; j < m; j++) {
                    if (c == allow[j]) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) {
                count++;
            }
        }

        return count;
    }
}
