class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0)
        return head;
        ListNode reversedHead=reverse(head);
        int length=0;
        ListNode curr= reversedHead;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        k=k%length;
        if(k==0)
        return reverse(reversedHead);
        curr=reversedHead;
        for(int i=1; i<k&&curr!=null; i++)
        {
            curr=curr.next;
        }
        ListNode next=curr.next;
        curr.next=null;
        ListNode firstPart=reverse(reversedHead);
        ListNode secondPart=reverse(next);
        ListNode tail=firstPart;
        while(tail.next !=null)
        {
            tail=tail.next;
        }
        tail.next=secondPart;
        return firstPart;
    }
    public ListNode reverse(ListNode head){
        if(head==null)
        return null;
        ListNode prev=null, curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}