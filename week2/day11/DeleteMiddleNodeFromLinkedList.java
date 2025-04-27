package week2.day11;

import CODEVERSE.ListNode;

public class DeleteMiddleNodeFromLinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null)
            return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        slow.next = null;
        return head;
        // after this loop slow points to the middle node to be deleted

    }
}
