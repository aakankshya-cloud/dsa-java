public class PallindromeNumber {
    public boolean isPalindrome(int x){
        String str = new String(String.valueOf(x));
        int left = 0, right = str.length();
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
