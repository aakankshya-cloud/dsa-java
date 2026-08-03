import java.util.Deque;
import java.util.LinkedList;

public class Pallindrome {
    public boolean Check(Node head){
        Node temp = head;
        Deque<Integer> stack = new LinkedList<>();
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.data != stack.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}
