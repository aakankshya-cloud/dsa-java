public class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode t3 = dummy;
        int carry = 0;
        while(t1 != null && t2 != null){
            int sum = t1.val + t2.val + carry;
            if(sum > 9){
                t3.next = new ListNode(sum % 10);
                carry = 1;
            }
            else{
                carry = 0;
                t3.next = new ListNode(sum);
            }
            t3 = t3.next;
            t1 = t1.next;
            t2 = t2.next;
        }
        if(t1 != null){
            int sum = t1.val + carry;
            t3.next = new ListNode(sum);
            carry = sum / 10;
            t3 = t3.next;
            t1 = t1.next;
        }
        if(t2 != null){
            int sum = t2.val + carry;
            t3.next = new ListNode(sum);
            carry = sum / 10;
            t3 = t3.next;
            t2 = t2.next;
        }
        if(carry != 0){
            t3.next = new ListNode(carry);
        }
        return dummy.next;
    }

}
