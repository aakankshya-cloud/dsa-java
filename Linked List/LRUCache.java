import java.util.HashMap;

public class LRUCache {
    class Node{
        int value;
        int key;
        Node prev;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }
    HashMap<Integer, Node> map;
    int capacity;
    Node head;
    Node tail;
    public LRUCache(int capacity) {
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        map = new  HashMap<>();
        this.capacity = capacity;
    }
    public void insertAtFirst(Node node){
        Node next = head.next;
        head.next = node;
        node.next = next;
        node.prev = head;
    }
    public void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        Node node = map.get(key);
        map.get(key);
        remove(node);
        insertAtFirst(node);
        return node.value;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            remove(node);
            insertAtFirst(node);
        }
        else{
            Node node = new Node(key, value);
            map.put(key, node);
            insertAtFirst(node);
            if(capacity < map.size()){
                Node last = tail.prev;
                remove(last);
                map.remove(last.key);
            }
        }

    }
}