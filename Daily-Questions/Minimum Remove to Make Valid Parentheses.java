class Solution {
    public String minRemoveToMakeValid(String s) {
        char[] ans = s.toCharArray();
        int len = s.length(), stIx = 0, i = 0, j = 0;
        int[] stack = new int[len+1];
        for (; i < len; i++)
            if (ans[i] == ')')
                if (stIx > 0) stIx--;
                else ans[i] = '_';
            else if (ans[i] == '(') stack[stIx++] = i;
        for (i = 0, stack[stIx] = -1, stIx = 0; j < len; j++)
            if (j == stack[stIx]) stIx++;
            else if (ans[j] != '_') ans[i++] = ans[j];
        return new String(ans, 0, i);
    }
}
