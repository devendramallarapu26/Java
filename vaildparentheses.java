import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> sa = new Stack<>(); // Corrected Stack declaration

        for (int i = 0; i < s.length(); i++) { // Fixed length method call
            char ch = s.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') { // Use single quotes for char comparison
                sa.push(ch);
            } else {
                if (sa.isEmpty()) { // Fixed isEmpty() method call
                    return false;
                }
                char top = sa.pop();

                if ((ch == ')' && top != '(') || 
                    (ch == '}' && top != '{') || 
                    (ch == ']' && top != '[')) { // Use single quotes and remove space in '!='
                    return false;
                }
            }
        }
        return sa.isEmpty(); // Check if stack is empty at the end
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // System.out.println(solution.isValid("()"));      // true
        // System.out.println(solution.isValid("()[]{}"));  // true
        // System.out.println(solution.isValid("(]"));      // false
        // System.out.println(solution.isValid("([)]"));    // false
        // System.out.println(solution.isValid("{[]}"));    // true
    }
}
