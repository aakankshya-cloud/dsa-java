import java.util.HashSet;

public class HasCycle {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }
    public boolean hasCycle(ListNode head){
        ListNode temp = head;
        HashSet<ListNode> set = new HashSet<>();
        while(temp != null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
