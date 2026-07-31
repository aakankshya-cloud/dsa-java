import java.util.ArrayList;
import java.util.Arrays;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class OddAndEvenLL {
    public Node Arrange(Node head){
        if(head == null || head.next == null) return head;
        ArrayList<Integer> arr = new ArrayList<>();
        Node temp = head;
        int c = 0;
        while(temp != null && temp.next != null){
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if(temp != null){
            arr.add(temp.data);
        }
        temp = head.next;
        while(temp != null && temp.next != null){
            arr.add(temp.data);
            temp = temp.next.next;
        }
        if(temp != null){
            arr.add(temp.data);
        }
        int i = 0;
        temp = head;
        while(temp != null){
            temp.data = arr.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}
