class Solution {
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> values = new ArrayList<>();

        while (temp != null) {
            values.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(values);

        temp = head;
        int count = 0;
        while (temp != null) {
            temp.val = values.get(count);
            count++;
            temp = temp.next;
        }

        return head;
    }
}