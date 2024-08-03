/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        int sum=0;
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode res = new ListNode(0);
        ListNode temp3 = res;
        while(temp1!=null && temp2!=null){
            sum=carry+temp1.val+temp2.val;
            carry=sum/10;
            temp3.next=new ListNode(sum%10);
            temp3=temp3.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            sum=carry+temp1.val;
            carry=sum/10;
            temp3.next=new ListNode(sum%10);
            temp3=temp3.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            sum=carry+temp2.val;
            carry=sum/10;
            temp3.next=new ListNode(sum%10);
            temp3=temp3.next;
            temp2=temp2.next;
        }
        if(carry==1){
            temp3.next=new ListNode(1);
        }
        return res.next;
        
    }
}