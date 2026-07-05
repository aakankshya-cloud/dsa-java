import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length - 3; i++){
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for(int j = i; j < nums.length - 2; j++){
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1 , l = nums.length - 1;
                while(k < l) {
                    if (nums[k] + nums[l] + nums[i] + nums[j] == target) {
                        ArrayList<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        arr.add(nums[l]);
                        result.add(arr);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;

                        while (k < l && nums[l] == nums[l + 1])
                            l--;

                    } else if (nums[k] + nums[l] + nums[i] + nums[j] > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }
        return result;
    }
}
