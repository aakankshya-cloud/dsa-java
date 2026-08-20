import java.util.ArrayList;

public class DistributeElementsIntoTwoArrays {
    public int[] resultArray(int[] nums){
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i = 0;
        int j = 0;
        int k = 2;
        while(k < nums.length) {
            if(arr1.get(arr1.size() - 1) > arr2.get(arr2.size() - 1)) {
                arr1.add(nums[k]);
            } else {
                arr2.add(nums[k]);
            }
            k++;
        }
        int[] result = new int[nums.length];
        for(int num : arr1) {
            result[i++] = num;
        }
        for(int num : arr2) {
            result[i++] = num;
        }
        return result;
    }
}
