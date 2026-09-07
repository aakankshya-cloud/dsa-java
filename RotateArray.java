//public class RotateArray {
//    public void reverse(int[] nums,int m, int n){
//        int i = m; int j = n;
//        while(i < j){
//            int temp = nums[i];
//            nums[i] = nums[j];
//            nums[j] = temp;
//        }
//    }
//    public void rotate(int[] nums, int k){
//        k = k % nums.length;
//        int n = nums.length;
//        reverse(nums,n - k, n - 1);
//        reverse(nums,0,k);
//        reverse(nums,0,n - 1);
//        for(int num : nums){
//            System.out.print(num + "\t");
//        }
//    }
//}
