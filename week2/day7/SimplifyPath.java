package week2.day7;

import java.util.Stack;

// problem no 73 
public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] components = path.split("/");
        Stack<String> st = new Stack<>();
        for (String comp : components) {
            if (comp.equals("") || comp.equals("."))
                continue;
            else if (comp.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else
                st.push(comp);
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0, "/" + st.pop());
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
