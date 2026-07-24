import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class TimeBasedKeyValueStore {

    class TimeMap {
        HashMap<String,TreeMap<Integer,String>> map = new HashMap<>();
        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if(!map.containsKey(key)){
                map.put(key,new TreeMap<>());
            }
            map.get(key).put(timestamp,value);
        }

        public String get(String key, int timestamp) {
            if(!map.containsKey(key)){
                return "";
            }
            Integer t = map.get(key).floorKey(timestamp);
            if(t == null){
                return "";
            }
            return map.get(key).get(t);
        }
    }
}
