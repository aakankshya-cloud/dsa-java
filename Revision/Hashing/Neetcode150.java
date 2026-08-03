import java.util.*;

public class Neetcode150 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0, right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum > target){
                right--;
            }
            else if(sum < target){
                left++;
            }
            else{
                result[0] = left;
                result[1] = right;
                return result;
            }
        }
        return new int[2];
    }
}
