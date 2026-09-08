//import java.util.HashMap;
//
//public class ValidAnagram {
//    public boolean isAnagram(String s, String t){
//        HashMap<Character,Integer> map1 = new HashMap<>();
//        HashMap<Character,Integer> map2 = new HashMap<>();
//        if(s.length() != t.length()) return false;
//        for(int i = 0; i < s.length(); i++){
//            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i),0)+1);
//            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i),0)+1);
//        }
//        if(map1.equals(map2)) return true;
//        return false;
//
//        int[] freq = new int[26];
//        if(s.length() != t.length()) return false;
//        for(int i = 0; i < s.length(); i++){
//            freq[(s.charAt(i) - 'a')]++;
//            freq[(t.charAt(i) - 'a')]--;
//        }
//        for(int i = 0; i < freq.length; i++){
//            if(freq[i] == 1) return false;
//        }
//        return true;
//    }
//}
