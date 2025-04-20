package week2.day6;

// leetcode problem no   20  
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else if (ch == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } else if (ch == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }
}
