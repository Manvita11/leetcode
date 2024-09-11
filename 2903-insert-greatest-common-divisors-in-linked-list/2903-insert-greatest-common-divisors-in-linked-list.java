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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            int value = findGCD(temp.val,temp.next.val);
            ListNode curr = new ListNode(value);
            curr.next=temp.next;
            temp.next=curr;
            temp = curr.next;
        }
        return head;
    }
    private int findGCD(int a,int b){
       if(b==0){
        return a;
       }
      return findGCD(b,a%b);
    }
}