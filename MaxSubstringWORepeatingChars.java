//import java.util.HashSet;
//
//public class MaxSubstringWORepeatingChars {
//    public int lengthOfLongestSubstring(String s){
//        HashSet<Character> set = new HashSet<>();
//        int length = 0;
//        int i = 0, j = 0;
//        while(j < s.length()){
//            while(set.contains(s.charAt(j))) {
//                set.remove(s.charAt(i));
//                i++;
//            }
//            set.add(s.charAt(j));
//            length = Math.max(length, j - i + 1);
//            j++;
//        }
//        return length;
//    }
//}
