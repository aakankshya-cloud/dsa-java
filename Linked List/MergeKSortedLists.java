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
        ListNode temp = dummy;
        while(!pq.isEmpty()){
            ListNode smallest = pq.poll();
            temp.next = smallest;
            temp = temp.next;
            if(smallest.next != null){
                pq.offer(smallest);
            }
        }
        return dummy.next;
    }
}
