class Solution {
    public ListNode swapPairs(ListNode head) {
      ListNode ans =new ListNode(0);
        ans.next=head;
        ListNode curr = ans;

        while(curr.next != null && curr.next.next != null){
            ListNode p1 = curr.next;
            ListNode p2 = curr.next.next;
            
            curr.next = p2;
            p1.next = p2.next;
            p2.next = p1;
            curr = curr.next.next;
        }
        return ans.next;  
    }
}