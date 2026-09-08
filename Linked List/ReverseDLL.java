// print the dll in reverse order
class Node{
    int data;
    Node next;
    Node back;
    Node(int data){
        this.data = data;
    }
}
public class ReverseDLL {
//    print in dll
//    public void Reverse(Node head){
//        if(head == null){
//            return;
//        }
//        Node temp = head;
//        while(temp.next != null){
//            temp = temp.next;
//        }
//        while(temp.back != null){
//            System.out.print(temp.data +" ");
//            temp = temp.back;
//        }
//    }

//    Reverse the dll
    public Node reverse(Node head){
        if(head == null){
            return null;
        }
        Node prev = null;
        Node temp = head;
        while(temp != null){
             prev = temp.back;
             temp.back = temp.next;
             temp.next = prev;
             temp = temp.back;
        }
        return prev.back;
    }
}
