public class ValidPallindrome {
    public static boolean isPalindrome(String s){
//        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
//        int left = 0;
//        int right = s.length() - 1;
//        while (left < right) {
//            if (s.charAt(left) == s.charAt(right)) {
//                left ++;
//                right --;
//            }
//            else {
//                return false;
//            }
//        }
//        return true;

        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
