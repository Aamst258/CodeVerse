package week2.day8;

import java.util.*;

// leetcode problem no   225. Implement Stack using Queues  
public class MyStack {
    // using one queue implemented a stack
    // whenever adding the new element to queue add it to right end of the queue and
    // remove /left end element from queue size - 1 no of times from the queue

    // Queue<Integer> q;

    // public MyStack() {
    // q = new LinkedList<>();
    // }

    // public void push(int x) {
    // q.add(x);
    // for (int i = 0; i < q.size() - 1; i++) {
    // q.add(q.poll());
    // }
    // }

    // public int pop() {
    // return q.poll();
    // }

    // public int top() {
    // return q.peek();
    // }

    // public boolean empty() {
    // return q.isEmpty();
    // }
    // using two queues
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);

    }

    public int pop() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int poppedVal = q1.poll();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return poppedVal;
    }

    public int top() {
        while (q1.size() > 1) {
            q2.add(q1.poll());
        }
        int topVal = q1.peek();
        q2.add(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return topVal;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

}
