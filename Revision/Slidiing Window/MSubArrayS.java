public class MSubArrayS {
    public double findMaxAverage(int[] nums, int k){
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        int max = sum;
        for(int i = 1; i <= nums.length - k; i++){
            sum = sum + nums[i + k - 1] - nums[i - 1];
        }
        max = Math.max(max,sum);
        return (double)max/k;
    }
}
