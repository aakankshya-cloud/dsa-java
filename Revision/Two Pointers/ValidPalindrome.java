public class ValidPalindrome {
    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String result = sb.toString();
        int left = 0, right = result.length() - 1;
        while(left < right){
            if(result.charAt(left) != result.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
