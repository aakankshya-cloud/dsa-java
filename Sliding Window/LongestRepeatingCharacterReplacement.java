import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static int characterReplacement(String s, int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        int maxFreq = 0;
        char[] arr = s.toCharArray();
        for(int right = 0; right < arr.length; right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            maxFreq=Integer.max(maxFreq,map.get(arr[right]));
            while((right - left + 1) - maxFreq > k){
                map.put(s.charAt(left),map.get(s.charAt(left)) - 1);
                if(map.get(s.charAt(left)) == 0){
                    map.remove(s.charAt(left));
                }
                left++;
            }
            max = Integer.max(max,right - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s,k));

    }
}
