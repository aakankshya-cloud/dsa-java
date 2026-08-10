
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
        ListNode result = new ListNode();
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode r = result;
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                r.next = temp1;
                temp1 = temp1.next;
            }
            else{
                r.next = temp2;
                temp2 = temp2.next;
            }
            r = r.next;
        }
        while(temp1 != null){
            r.next = temp1;
            temp1 = temp1.next;
            r = r.next;
        }
        while(temp2 != null){
            r.next = temp2;
            temp2 = temp2.next;
            r = r.next;
        }
        return result.next;
    }
}
