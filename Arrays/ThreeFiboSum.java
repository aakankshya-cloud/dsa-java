import java.util.ArrayList;

public class ThreeFiboSum {
    public int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
    public boolean threeFibonacciSum(int n) {
        int i = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(fibo(i) < n){
            arr.add(fibo(i));
            i++;
        }
        int left = 0, right = arr.size() - 1;
        while(left < right){
            int mid = (left + right)/2;
            if(arr.get(mid) + arr.get(mid + 1) + arr.get(mid - 1) == n){
                return true;
            }
            else if(arr.get(mid) + arr.get(mid + 1) + arr.get(mid - 1) < n){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}
