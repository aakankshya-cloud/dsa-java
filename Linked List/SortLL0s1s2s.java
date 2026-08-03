public class SortLL0s1s2s {
    public Node Sort(Node head){
        Node temp = head;
        int c0 = 0, c1 = 0, c2 = 0;
        if(head == null){
            return null;
        }
        while(temp.next != null){
            if(temp.data == 0) c0++;
            else if(temp.data == 1) c1++;
            else c2++;
            temp = temp.next;
        }
        temp = head;
        while(temp.next != null){
            if(c0 != 0){
                temp.data = 0;
                c0--;
            }
            else if(c1 != 0){
                temp.data = 1;
                c1--;
            }
            else{
                temp.data = 2;
                c2--;
            }
            temp = temp.next;
        }
        return head;
    }
}
