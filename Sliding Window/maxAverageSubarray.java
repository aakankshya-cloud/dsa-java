public class maxAverageSubarray {
    public static double findMaxAverage(int[] nums, int k){
        int sum = 0;
        int avg = 0;
        for(int i = 0; i < k;i++){
            sum = sum + nums[i];
        }
        int max = sum;
        for(int i = k; i < nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            max = Math.max(max,sum);
        }
        return (double) max/k;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(findMaxAverage(nums,k));
    }

}
