package week2.day10;
// leetcode   234 
import java.util.Stack;

class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class LinkedListIsPalindrome {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            st.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null && !st.isEmpty()) {
            int data = temp.val;
            int data1 = st.pop();
            if (data != data1) {
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}
