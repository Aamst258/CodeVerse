package week2.day11;

import CODEVERSE.ListNode;

// leetcode  237
public class DeleteANodeInLinkedList {

    public void deleteNode(ListNode node) {
        // 1st approach TC O(n)
        // moving the value of the given node to last node and deleting the last node
        // meaning next of second last is null
        // ListNode curr = null;
        // while (node.next != null) {
        // ListNode next = node.next;
        // int temp = node.val;
        // node.val = next.val;
        // next.val = temp;
        // curr = node;
        // node = next;
        // }
        // curr.next = null;

        // better approach
        // given that the given node to be deleted will not be the last node
        // so copy the next node data and 'next pointer ' from next node and skip the
        // next node
        node.val = node.next.val;
        node.next = node.next.next;

    }
}
