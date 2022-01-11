package leetCodeHot100;

import java.util.Stack;

public class IsValid {
    public boolean isvalid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');
            } else if(stack.isEmpty() ||stack.pop() !=c)
                return false;
        }
        return stack.isEmpty();
    }
}
