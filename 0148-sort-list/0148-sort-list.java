class Solution {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;  
        }

        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;

        middle.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(nextOfMiddle);
        
        return merge(left, right);
    }

    private ListNode getMiddle(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        
        ListNode result;
        
        if (left.val <= right.val) {
            result = left;
            result.next = merge(left.next, right);
        } else {
            result = right;
            result.next = merge(left, right.next);
        }
        
        return result;
    }
}