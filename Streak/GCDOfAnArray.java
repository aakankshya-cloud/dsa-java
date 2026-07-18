import java.util.Arrays;

public class GCDOfAnArray {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1];
        int b = nums[0];
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
