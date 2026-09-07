//import java.util.HashMap;
//
//public class DetectALoopInLL {
////    public boolean hasCycle(ReverseLL.ListNode head) {
////        HashMap<ReverseLL.ListNode, Integer> map = new HashMap<>();
////        ReverseLL.ListNode temp = head;
////        while(temp != null){
////            if(map.containsKey(temp)){
////                return true;
////            }
////            map.put(temp,1);
////            temp = temp.next;
////        }
////        return false;
////    }
//
////    slow and fast pointer
//public boolean hasCycle(ReverseLL.ListNode head){
//    ReverseLL.ListNode slow = head;
//    ReverseLL.ListNode fast = head;
//    while(fast != null && fast.next != null){
//        slow = slow.next;
//        fast = fast.next.next;
//        if(slow == fast){
//            return true;
//        }
//    }
//    return false;
//
// }
//}
