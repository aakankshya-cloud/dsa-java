public class AddTwoNums {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode result = new ListNode(-1);
        ListNode res = result;
        int carry = 0;
        int sum = 0;
        while(t1 != null || t2 != null || carry != 0){
            int a = (t1 != null) ? t1.val : 0;
            int b = (t2 != null) ? t2.val : 0;
            sum = a + b + carry;
            res.next = new ListNode(sum % 10);
            res = res.next;
            carry = sum / 10;
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
        }
        return result.next;
    }

}
