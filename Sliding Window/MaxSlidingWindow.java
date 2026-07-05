import java.lang.reflect.Array;
import java.util.HashMap;

public class MaxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k){
        HashMap<Array,Integer> map = new HashMap<>();
        int sum = 0;
        int[] arr= new int[3];
        for(int i = 0; i < k; i++){
            arr[i] = nums[i];
            sum = sum+arr[i];
        }

    }

}
