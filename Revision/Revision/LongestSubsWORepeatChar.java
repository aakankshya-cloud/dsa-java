package Revision.Revision;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubsWORepeatChar {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int i = 0, j = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            max = Math.max(max , j - i + 1);
            j++;
        }
        return max;
    }
}
