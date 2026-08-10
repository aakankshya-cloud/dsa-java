public class ReorderLL {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }
    public void reorderList(ListNode head){
        ListNode prev = null;
       ListNode slow = head;
       ListNode fast = head;
       while(fast != null && fast.next != null){
           prev = slow;
           slow = slow.next;
           fast = fast.next.next;
       }
       prev.next = null;
       ListNode temp = slow;
       prev = null;
       while(temp != null){
           ListNode curr = temp.next;
           temp.next = prev;
           prev = temp;
           temp = curr;
       }
       ListNode curr = head;
       temp = prev;
       while(curr != null && temp != null){
           ListNode x = curr.next;
           ListNode y = temp.next;
           curr.next = temp;
           temp.next = x;
           curr = x;
           temp = y;
       }
    }
}
