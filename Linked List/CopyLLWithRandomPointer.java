import java.util.HashMap;

public class CopyLLWithRandomPointer {
    class Node{
        int data;
        Node next;
        Node random;
        Node(int data){
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }
        public Node copyRandomList(Node head) {
            HashMap<Node, Node> map = new HashMap<>();
            Node curr = head;
            while(curr != null){
                map.put(curr, new Node(curr.val));
                curr = curr.next;
            }
            curr = head;
            while(curr != null){
                map.get(curr).next = map.get(curr.next);
                map.get(curr).random = map.get(curr.random);
                curr = curr.next;
            }
            return map.get(head);
        }

