class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Insertion {
    public Node insertFirst(Node head , int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }
    public Node insertLast(Node head , int data){
        Node node = new Node(data);
        Node temp = head;
        if(head == null){
            return node;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }
    public Node insertInK(Node head, int k, int data){
        Node node = new Node(data);
        if(k == 1){
            node.next = head;
            head = node;
            return head;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while(temp!= null){
            cnt++;
            if(cnt == k){
                prev.next = node;
                node.next = temp;
                return head;
            }
            prev = temp;
            temp = temp.next;

        }
        if(cnt + 1 == k) {
            prev.next = node;
        }
        return head;
    }
    public Node InsertBeforeX(Node head,int data,int x){
        Node node = new Node(data);
        if(head == null){
            return null;
        }
        if(head.data == x){
            node.next = head;
            return node;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.data == x){
                prev.next = node;
                node.next = temp;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
