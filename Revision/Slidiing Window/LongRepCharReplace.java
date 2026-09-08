import java.util.HashSet;

public class LongRepCharReplace {
    public int characterReplacement(String s, int k){
        HashSet<Character> set = new HashSet<>();
        int low = 0;
        int max = -1;
        for(int high = 0; high < s.length(); high++){
            set.add(s.charAt(low));
            if(s.charAt(high) != s.charAt(low)){
                if(k == 0){
                    low++;
                    if(!set.contains(s.charAt(low))){
                        k++;
                        set.remove(s.charAt(low));
                    }
                }
                else{
                    k--;
                }
            }
            max = Integer.max(max,high - low + 1);
        }
        return max;
    }
}
