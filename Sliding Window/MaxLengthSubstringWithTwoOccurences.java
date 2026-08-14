import java.util.HashMap;

public class MaxLengthSubstringWithTwoOccurences {
    public int maximumLengthSubstring(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, max = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0) + 1);
            while(map.get(ch) > 2){
                max = Math.max(max, j - i + 1);
                if(s.charAt(i) == ch){
                    map.put(ch,map.get(ch) - 1);
                }
                else{
                    if(map.containsKey(s.charAt(i))){
                        map.put(ch,map.get(ch) - 1);
                        if(map.get(s.charAt(i)) == 0){
                            map.remove(s.charAt(i));
                        }
                    }
                }
                i++;
            }
            max = Math.max(max , j - i + 1);
            j++;
        }
        return max;
    }
}
