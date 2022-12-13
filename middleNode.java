class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode one = head;
        ListNode two = head;
       // System.out.println("one"+" "+one.val);
        //System.out.println("two"+" "+two.val);
        
        while(two != null && two.next != null){
            System.out.println("one"+" "+one.val);
            one = one.next;
            System.out.println("two"+" "+two.val);
            two = two.next.next;
            
        }
        System.out.println("breaked");
        return one;
    }
}
