public class RemoveNthFromEnd {
    public Node Delete(Node head, int n){
        if(head == null){
            return null;
        }
        Node fast = head;
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        if(fast == null) return head.next;
        Node slow = head;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }

}
