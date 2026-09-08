import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str: strs){
            ArrayList<String> arr = new ArrayList<>();
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            map.putIfAbsent(s, new ArrayList<>());
            map.get(s).add(str);
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> val : map.values()){
            res.add(val);
        }
        return res;
    }
}
