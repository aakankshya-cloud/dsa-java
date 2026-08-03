import java.util.*;

public class Neetcode150 {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int i = 0, j = 0, max = -1;
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
            }
            else{
                max = Integer.max(max,set.size());
                while(set.contains(s.charAt(j))) {
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
            }
            j++;
            max = Integer.max(max,set.size());
        }
        return max;

    }
}
