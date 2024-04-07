import java.util.Stack;

public class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();
        int len = s.length();

        for (int i = 0; i < len; ++i) {
            char ch = s.charAt(i);
            if (ch == '(')
                open.push(i);
            else if (ch == '*')
                star.push(i);
            else {
                if (!open.isEmpty())
                    open.pop();
                else if (!star.isEmpty())
                    star.pop();
                else
                    return false;
            }
        }

        while (!open.isEmpty()) {
            if (star.isEmpty())
                return false;
            else if (open.peek() < star.peek()) {
                open.pop();
                star.pop();
            } else
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.checkValidString("((*)"));
    }
}
