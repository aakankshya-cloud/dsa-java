import java.util.ArrayList;
import java.util.List;
//The k closest elements will always form a contiguous block in the sorted array.
public class KClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x){
        ArrayList<Integer> a = new ArrayList<>();
        int mid = 0;
        for(int i = 0; i < arr.length - k; i++){
            if(Math.abs(x - arr[mid]) < Math.abs(x - arr[mid + k])){
                a.add(arr[mid + i]);
            }
            else{
                a.add(arr[mid + k - i]);
            }
            mid = mid + k;
        }
        return a;
    }
}
