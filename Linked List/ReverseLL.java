import java.util.Deque;
import java.util.LinkedList;

public class ReverseLL {
    public Node Reverse(Node head){
        Deque<Integer> stack = new LinkedList<>();
        Node temp = head;
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            temp.data = stack.pop();
            temp = temp.next;
        }
        return head;
    }
}
