class Node{
    int data;
    Node next;
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class basic {
    public static void main(String[] args) {
        int[] arr = {2,5,7,8};
        Node y = new Node(arr[3],null);
        System.out.println(y.data);
    }
}
