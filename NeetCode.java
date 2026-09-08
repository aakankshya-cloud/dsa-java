import java.util.HashMap;
import java.util.TreeMap;

public class NeetCode {
    class TimeMap {
        HashMap<String, TreeMap<Integer,String>> map;
        public TimeMap() {
            map = new HashMap<>();
        }
        public void set(String key, String value, int timestamp) {
            TreeMap<Integer,String> treeMap = map.get(key);
            if(treeMap == null){
                treeMap = new TreeMap<>();
                map.put(key,treeMap);
            }
            treeMap.put(timestamp,value);
        }

        public String get(String key, int timestamp) {
            if(!map.containsKey(key)){
                return null;
            }
            TreeMap<Integer,String> treeMap = map.get(key);
            var entry = treeMap.floorEntry(timestamp);
            if(entry == null){
                return "";
            }
            return entry.getValue();
        }
    }
}
