class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode current=dummy;
        while(current.next!=null){
            if(st.contains(current.next.val)){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return dummy.next;
    }
}