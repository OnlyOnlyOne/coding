package leetCodeHot100;

import java.util.Stack;

//使用两个栈实现
public class MyQueue {
    private static Stack<Integer> inStack;
    private static Stack<Integer> outStack;
    public MyQueue() {
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            inZout();
        }
        return outStack.pop();
    }

    public int peek() {
        if (outStack.isEmpty()) {
            inZout();
        }
        return outStack.peek();
    }

    public boolean empty() {
        return inStack.isEmpty()&&outStack.isEmpty();
    }

    private void inZout() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }
}
