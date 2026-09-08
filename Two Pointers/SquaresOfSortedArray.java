import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquares(int[] nums) {
        // for(int i = 0 ; i < nums.length; i++){
        // nums[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(nums);
        // return nums;
        //
        // optimal
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int i = 0;
        while (i < nums.length) {
            int j = i;
            while (j < nums.length) {
                if (nums[i] == nums[j]) {
                    j++;
                } else if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                } else {
                    j++;
                }
            }
            i++;
        }
        return nums;
    }

    //
    //
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        sortedSquares(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }

    }
}
