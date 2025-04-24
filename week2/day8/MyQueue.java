package week2.day8;

import java.util.*;

// leetcode problem no  232. Implement Queue using Stacks
public class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        st1.push(x);
    }

    public int pop() {
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        int poppedVal = st2.pop();
        return poppedVal;
    }

    public int peek() {

        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        int poppedVal = st2.peek();
        return poppedVal;
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }
}
