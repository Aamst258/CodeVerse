package week2.day10;

//  206. Reverse Linked List
class ListNode {
    int val;
    ListNode next;

    public ListNode() {

    }

    ListNode(int val) {
        this.next = null;
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode next = null;
        ListNode temp = head;
        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev; // after the traversal previous points to the last Node

    }
}
