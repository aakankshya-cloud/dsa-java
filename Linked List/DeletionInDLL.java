class Node{
    int data;
    Node next;
    Node back;
    Node(int data){
        this.data = data;
    }
}
public class DeletionInDLL {
    public Node deleteAtFirst(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        head = head.next;
        head.back = null;
        return head;
    }
    public Node deleteAtLast(Node head){
        if(head == null) return null;
        if(head.next == null){
            return null;
        }
        Node temp = head;
        Node prev = null;
        while(temp.next != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }
    public Node DeleteKElement(Node head , int k){
        if(head == null){
            return null;
        }
        if(k == 1) {
            if (head.next == null) {
                return null;
            }
            head = head.next;
            head.back = null;
            return head;
        }
        int cnt = 1;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(cnt == k) {
                prev.next = temp.next;
                if (temp.next != null) {
                    temp.next.back = prev;
                }
                break;
            }
            prev = temp;
            temp = temp.next;
            cnt++;
        }
        return head;
    }

}
