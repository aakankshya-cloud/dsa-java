package Revision.Revision;

public class ReverseLinkedL {
    class ListNode{
        int data;
        ListNode next;
        ListNode(int data, ListNode next){
            this.data = data;
            this.next = next;
        }
    }
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = head;
        ListNode prev = null;
        while(temp.next != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

}
