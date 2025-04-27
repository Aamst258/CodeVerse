package week1.day5;

public class MergeTwoSortedLinkedList {

    class ListNode {
        ListNode next;
        int val;

        ListNode() {

        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headR = null;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode tempR = null;
        while (temp1 != null && temp2 != null) {
            if (temp1.val > temp2.val) {
                if (headR == null) {
                    headR = temp2;
                    tempR = temp2;
                } else {
                    tempR.next = temp2;
                    tempR = temp2;
                }
                temp2 = temp2.next;
            } else {
                if (headR == null) {
                    headR = temp1;
                    tempR = temp1;
                } else {
                    tempR.next = temp1;
                    tempR = temp1;
                }
                temp1 = temp1.next;
            }
        }
        if (headR == null) {
            return (temp1 != null) ? temp1 : temp2;
        }

        tempR.next = (temp1 != null) ? temp1 : temp2;
        return headR;
    }
}
