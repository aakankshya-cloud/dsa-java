public class RemoveNthFromEnd {
    public Node Delete(Node head, int n){
        if(head == null){
            return null;
        }
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        int k = count - n + 1;
        if(k == 1){
            return head.next;
        }
        count = 0;
        Node prev = null;
        temp = head;
        while(temp != null){
            count++;
            if(count == k){
                prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
