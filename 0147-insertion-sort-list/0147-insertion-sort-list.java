/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode newHead = null;
        // insert node one by one in list with new Head
        while (head != null) {
            ListNode temp = head;
            head = head.next;
            ListNode tail = newHead;
            ListNode prev = null;
            while (tail != null && tail.val < temp.val) {
                prev = tail;
                tail = tail.next;
            }
            // insert node at head
            if (prev == null) {
                temp.next = newHead;
                newHead = temp;
            } else {
                temp.next = prev.next;
                prev.next = temp;
            }
        }
        return newHead;
    }

}