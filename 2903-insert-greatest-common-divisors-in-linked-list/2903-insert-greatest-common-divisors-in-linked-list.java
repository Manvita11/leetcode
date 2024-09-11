class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null)
            return head;

        ListNode temp = head;
        while(temp.next != null)
        {
            putInside(temp,greatestCommonDivisor(temp.val,temp.next.val));
            temp = temp.next.next;
        }
        return head;
    }

    public int greatestCommonDivisor(int num1, int num2)
    {
        int high,low;
        if(num1 > num2){
            high = num1;
            low = num2;
        }
        else{
            high = num2;
            low = num1;
        }
        int low2 = low;
        while(low>1){
            if(high % low !=0 ||  low2%low !=0)
            {
                low--;
            }
            else{
                return low;
            }
        }
        return 1;
    }
    public void putInside(ListNode head, int num)
    {
        ListNode temp = head.next;
        head.next = new ListNode(num);
        head.next.next = temp;
    }
}