class Node{
    int data;
    Node next;
    Node back;
    Node(int data){
        this.data = data;
    }
}
public class InsertionInDLL {
    public void convertArrToDll(Node head , int[] arr){
        head = new Node(arr[0]);
        Node prev = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
    }
    public Node InsertAtF(Node head,int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            return head;
        }
        node.next = head;
        head.back = node;
        head = node;
        return head;
    }
    public Node InsertAtLast(Node head, int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.back = temp;
        return head;
    }
    public Node InsertAtK(Node head, int data, int k){
        Node node = new Node(data);
        if(head == null){
            if(k == 1) {
                head = node;
                return head;
            }
            return null;
        }
        if(k == 1){
            node.next = head;
            head.back = node;
            head = node;
            return head;
        }
        Node temp = head;
        Node prev = null;
        int cnt = 0;
        while(temp != null){
            cnt++;
            if(cnt == k){
                prev.next = node;
                node.back = prev;
                node.next = temp;
                temp.back = node;
                return head;
            }
            prev = temp;
            temp = temp.next;
        }
        if(cnt + 1 == k){
            prev.next = node;
            node.back = prev;
        }
        return head;
    }
    public Node InsertBeforeNode(Node head, Node value){
        if(head == null){
            return null;
        }
        if(head == value){
            if(head.next == null){
                return null;
            }
            head = head.next;
            head.back = null;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp == value){
                prev.next = temp.next;
                temp.next.back = prev;
            }
            prev = temp;
        }
    }
}
