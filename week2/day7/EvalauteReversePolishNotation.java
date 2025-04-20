package week2.day7;
// probelm no 150

import java.util.Stack;

public class EvalauteReversePolishNotation {
    // evaluate Postfix notation
    public int evalRPN(String[] tokens) {

        Stack<Integer> st = new Stack<>();
        for (String str : tokens) {
            // if it is a number convert it to integer
            if (!str.equals("+") && !str.equals("-") && !str.equals("/") && !str.equals("*")) {
                int n = Integer.valueOf(str);
                st.push(n);
            } else {
                // input represents a valid arithmetic expression
                // so atleast 2 values will be there in stack
                // whenever an operator is occured
                int key1 = st.pop();
                int key2 = st.pop();
                // the first popped number will be the second number in calculation the order of
                // the number will not affect in addition and multiplication but in subtraction
                // and division we have to be carefull about the order of the numbers popped
                int result = 0;
                switch (str) {
                    case "+":
                        result += key2 + key1;
                        break;
                    case "-":
                        result += key2 - key1;
                        break;
                    case "*":
                        result = key2 * key1;
                        break;
                    case "/":
                        result = key2 / key1;
                        break;
                }
                st.push(result);
            }
        }
        return st.peek();
    }
}
