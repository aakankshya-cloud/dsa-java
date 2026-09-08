import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int len = 0;
        int max = 0;
        while(i <= j) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
            } else {
                len = (j - i) ;
                max = Integer.max(max, len);
                i++;
            }
        }
        return max;
    }
}
