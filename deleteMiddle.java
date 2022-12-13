class Solution {
    public ListNode deleteMiddle(ListNode head) {

        ListNode one = head;
        ListNode two = head;
        ListNode three = head;
        ListNode prev = head;

        if(one.next == null)
           return null;

        while(two != null && two.next != null)
        {
            prev = one;
            one = one.next;
            two = two.next.next;
        }
        prev.next = one.next;
        return three;
        
    }
}
