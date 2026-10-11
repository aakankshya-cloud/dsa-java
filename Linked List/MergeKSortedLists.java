import java.util.PriorityQueue;

public class MergeKSortedLists {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int value){
            this.val = value;
            this.next = null;
        }
    }
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.val, b.val));
        for(ListNode node: lists){
            if(node != null){
                pq.offer(node);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while(!pq.isEmpty()){
            ListNode smallest = pq.poll();
            tail.next = smallest;
            tail = tail.next;
            if(smallest.next != null){
                pq.offer(smallest);
            }
        }
        return dummy.next;
    }
}
