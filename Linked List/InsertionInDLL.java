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
}
