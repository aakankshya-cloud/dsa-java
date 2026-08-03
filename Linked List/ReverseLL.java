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
}
