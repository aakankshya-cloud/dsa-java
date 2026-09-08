public class DeleteOnlyOddNodes {
    public ListNode delete(ListNode head){
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = head;
        int cnt = 1;
        ListNode prev = dummy;
        while(temp != null){
            if(cnt % 2 == 1){
                prev.next = temp.next;
            }
            else{
                prev = temp;
            }
            temp = temp.next;
            cnt++;
        }
        return dummy.next;
    }
}
