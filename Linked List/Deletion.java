//class Node{
//    int data;
//    Node next;
//    Node(int data){
//        this.data = data;
//    }
//
//    public  nec() {
//    }
//}
//public class Deletion {
//    public Node deleteHead(Node head){
//        if(head == null) {
//            return null;
//        }
//        return head.next;
//    }
//    public Node deleteLast(Node head){
//        if(head == null) return null;
//        Node temp = head;
//        while(temp.next.next != null){
//            temp = temp.next;
//        }
//        temp.next = null;
//        return head;
//    }
//    public Node deleteKElement(Node head , int k){
//        if(head == null) return null;
//        if(k == 1){
//            head = head.next;
//            return head;
//        }
//        int cnt = 0;
//        Node temp = head;
//        Node prev = null;
//        while(temp != null){
//            cnt++;
//            if(k == cnt){
//                prev.next = prev.next.next;
//                break;
//            }
//            prev = temp;
//            temp = temp.next;
//
//        }
//        return head;
//    }
//    public Node deleteValue(Node head , int value){
//        if(head == null) return null;
//        if(head.data == value){
//            head = head.next;
//            return head;
//        }
//        Node prev = null;
//        Node temp = head;
//        while(temp != null){
//            if(temp.data == value){
//                prev.next = prev.next.next;
//                break;
//            }
//            prev = temp;
//            temp = temp.next;
//        }
//        return head;
//    }
//}
