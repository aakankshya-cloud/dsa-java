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
    public Node copyRandomList(Node head){
            if(head == null){
                return head;
            }
            HashMap<Node,Node> map = new HashMap<>();
            Node temp = head;
            while(temp != null){
                map.put(temp,new Node(temp.val));
                temp = temp.next;
            }
            temp = head;
            while(temp != null){
                Node copy = map.get(temp);
                copy.next = map.get(temp.next);
                copy.random = map.get(temp.random);
                temp = temp.next;
            }
            return map.get(head);
        }
    }

