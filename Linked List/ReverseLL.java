import java.util.Deque;
import java.util.LinkedList;

public class ReverseLL {
    public Node Reverse(Node head){
        Node temp = head;
        Node prev = null;
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

//    Reverse
    public Node Reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = Reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

}
