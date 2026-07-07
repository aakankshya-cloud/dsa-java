import java.util.ArrayList;

public class ConcatenateAndMultiply {
    public static long sumAndMultiply(int n){
        int sum = 0;
        ArrayList<Character> arr = new ArrayList<>();
        String str = String.valueOf(n);
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '0'){
                sum = sum + str.charAt(i) - '0';
                arr.add(str.charAt(i));
            }
        }
        double x = 0;
        for(int i = 0; i < arr.size(); i++){
            x = x + Math.pow(10,arr.size() - 1 - i)*(arr.get(i) - '0');
        }
        return (long) x * sum;
    }
    public static void main(String[] args) {
        int n = 10203004;
        System.out.println(sumAndMultiply(n));
    }
}
