public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        if(head == null) return head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int k = count - n + 1;
        if(k == 1){
            head = head.next;
            return head;
        }
        temp = head;
        count = 1;
        ListNode prev = null;
        while(temp != null){
            if(count == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            count++;
        }
        return head;
    }
}
