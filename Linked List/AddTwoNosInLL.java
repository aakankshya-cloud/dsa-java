import java.util.ArrayList;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class AddTwoNosInLL {
    public Node AddLL(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummyNode = new Node(-1);
        Node curr = dummyNode;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1 != null) sum = sum + temp1.data;
            if(temp2 != null) sum = sum + temp2.data;
            Node node = new Node(sum % 10);
            carry = sum/10;
            curr.next = node;
            curr = node;
            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }
        if(carry != 0){
            Node node = new Node(carry);
            curr.next = node;
        }
        return dummyNode;
    }
}
