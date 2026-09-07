//import java.util.HashMap;
//import java.util.HashSet;
//
//public class LongestSubsWithKDistinctChars {
//    public int lengthString(String str, int k) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        int i = 0, j = 0, cnt = 0;
//        while (j < str.length()) {
//            char ch = str.charAt(j);
//            if (!map.containsKey(ch)) {
//                while (map.size() == k) {
//                    char c = str.charAt(i);
//                    map.put(c, map.get(c) - 1);
//                    if (map.get(c) == 0) {
//                        map.remove(c);
//                    }
//                    i++;
//                }
//            }
//            map.put(ch,map.getOrDefault(ch, 0)+1);
//            cnt = Math.max(cnt, j - i + 1);
//            j++;
//        }
//        return cnt;
//    }
//}