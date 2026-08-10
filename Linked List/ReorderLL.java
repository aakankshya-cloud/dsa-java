public class ReorderLL {
    class ListNode {
        int val;
        HasCycle.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }
    public void reorderList(ListNode head){
        ListNode temp = head;
        ListNode last = head;
        while(last != null){

            last = last.next;
        }
    }
}
