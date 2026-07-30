class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class ConvertArrtoLL {
    private static Node convert(int[] arr){
        Node head = new Node(arr[0]);
        Node curr = head;
        for(int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            curr.next = temp;
            curr = curr.next;
        }
        return head;
    }
    private int length(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp !=  null){
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    private int search(Node head,int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                System.out.println("Available");
                return 1;
            }
            temp = temp.next;
        }
        System.out.println("Not available");
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {12,2,3,4};
        Node head = convert(arr);
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(head.data);
    }
}
