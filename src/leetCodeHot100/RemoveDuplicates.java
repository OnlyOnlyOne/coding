package leetCodeHot100;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicates {
    public String removeDuplicates(String str) {
        //先转换为单个字符处理
        char[] s = str.toCharArray();
        Deque<Character> stack = new LinkedList<>();
        for (char c : s) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else{
                stack.push(c);
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while(!stack.isEmpty()) stringBuilder.append(stack.pop());
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
