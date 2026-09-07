//public class RemoveNthNodeFromEnd {
//    public class ListNode {
//        int val;
//        ListNode next;
//        ListNode() {}
//        ListNode(int val) { this.val = val; }
//        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//    }
//    public ListNode removeNthFromEnd(ListNode head, int n){
//        ListNode temp = head;
//        int cnt = 0;
//        while(temp != null){
//            cnt++;
//            temp = temp.next;
//        }
//        ListNode prev = null;
//        int len = cnt;
//        int k = len - n + 1;
//        temp = head;
//        cnt = 0;
//        if(k == 1){
//            return head.next;
//        }
//        while(temp != null){
//            cnt++;
//            if(cnt == k){
//                prev.next = temp.next;
//                break;
//            }
//            prev = temp;
//            temp = temp.next;
//        }
//        return head;
//    }
//
//}
