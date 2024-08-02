public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s = head;
        ListNode f = head;
        while (f!= null && f.next!= null) {
            s = s.next;
            f = f.next.next;
            if (s == f) {
                ListNode entry = head;
                while (entry!= s) {
                    entry = entry.next;
                    s= s.next;
                }
                return entry;
            }
        }
        return null;
    }
}