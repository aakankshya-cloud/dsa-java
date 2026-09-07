//import java.util.List;
//
//public class ReverseLL {
//    public class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }
//    public ListNode reverseList(ListNode head){
//        if(head == null){
//            return null;
//        }
//        ListNode temp = head;
//        ListNode prev = null;
//        while(temp != null){
//            ListNode curr = temp.next;
//            temp.next = prev;
//            prev = temp;
//            temp = curr;
//        }
//        return prev;
//
//    }
//}
