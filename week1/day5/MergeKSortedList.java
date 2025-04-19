package week1.day5;

import java.util.PriorityQueue;

// leetcode problem  no 23   
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

public class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
        // declaring min heap
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
        for (ListNode head : lists) {
            if (head != null)
                pq.add(head);
        }
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while (!pq.isEmpty()) {
            ListNode top = pq.poll();
            // returns the node which has the smallest number
            tail.next = top;
            tail = top;

            if (top.next != null)
                pq.add(top.next);

        }
        return dummy.next;

    }

}
