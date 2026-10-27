import java.util.List;

public class SubarraySumToK {
    public int sumEqualToK(int[] arr, int target){
        int i = 0, j = 0;
        int count = 0;
        int sum = 0;
        while(j < arr.length){
            sum = sum + arr[j];
            while(sum > target){
                sum = sum - arr[i];
                i++;
            }
            if(sum == target){
                count++;
            }
            j++;
        }
        return count;
    }
}
