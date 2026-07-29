import java.util.HashMap;

public class LRUCache {
    class LUCache {
        HashMap<Integer,Integer> map = new HashMap<>();

        public LUCache(int capacity) {
            int[] arr = new int[capacity];
        }

        public int get(int key) {
            if(!map.containsKey(key)){
                return -1;
            }
        }

        public void put(int key, int value) {
            map.put(key,value);

        }
    }
}
