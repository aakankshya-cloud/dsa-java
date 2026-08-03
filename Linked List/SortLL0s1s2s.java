public class SortLL0s1s2s {
    public Node Sort(Node head){
        Node temp = head;
        if(head == null || head.next == null){
            return head;
        }
        Node L0 = new Node(-1,null);
        Node L1 = new Node(-1,null);
        Node L2 = new Node(-1,null);
        Node zero = L0;
        Node one = L1;
        Node two = L2;
        while(temp!= null){
            if(temp.data == 0){
                zero.next = temp;
                zero = zero.next;
            }
            else if(temp.data == 1){
                one.next = temp;
                one = one.next;
            }
            else if(temp.data == 2){
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        zero.next = (L1.next != null) ? L1.next : L2.next;
        one.next = L2.next;
        two.next = null;
        return L0.next;
    }
}
