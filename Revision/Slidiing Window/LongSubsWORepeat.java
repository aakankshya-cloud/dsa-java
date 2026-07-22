import java.util.HashSet;

public class LongSubsWORepeat {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int low = 0;
        int count = 0;
        int max = -1;
       for(int high = 0; high < s.length(); high++){
           while(set.contains(s.charAt(high))){
               set.remove(s.charAt(low));
               low++;
           }
           set.add(s.charAt(high));
           max = Math.max(max , high - low + 1);
       }
        return max;
    }
}
