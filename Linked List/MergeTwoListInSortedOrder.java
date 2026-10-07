
public class MergeTwoListInSortedOrder {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode result = new ListNode(-1);
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode res = result;
        while(temp1 != null && temp2 != null){
            if(temp1.val > temp2.val){
                res.next = temp2;
                temp2 = temp2.next;
            }
            else{
                res.next = temp1;
                temp1 = temp1.next;
            }
            res = res.next;
        }
        if(temp1 != null){
            res.next = temp1;
        }
        if(temp2 != null){
            res.next = temp2;
        }
        return result.next;
    }
}
