
class Solution {
    public ListNode sortList(ListNode head) {
       if(head==null || head.next==null){
        return head;
       } 
        
       ListNode mid=getmid(head);
      ListNode left=head;
       ListNode right=mid.next;
       mid.next=null;
       left=sortList(left);
       right=sortList(right);

    return merge(left,right);}
    public ListNode getmid(ListNode  head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode temp2=new ListNode (0);
        ListNode temp=temp2; 
        while(left!=null && right !=null){
            if(left.val<right.val){
                temp.next=left;
                left=left.next;
            }else{
                temp.next=right;
                right=right.next;
            }
            temp=temp.next;
            if (left != null) {
        temp.next = left;
    } else {
        temp.next = right;
    }
        }
        return temp2.next;
    }
}