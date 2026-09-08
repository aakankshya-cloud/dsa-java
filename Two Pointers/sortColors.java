public class sortColors {
    public static void sortcolors(int[] nums) {
//        for(int i = 0 ; i < nums.length -1; i++){
//            for(int j = 1; j < nums.length - i; j++){
//                if(nums[j] < nums[j-1]){
//                    int temp = nums[j];
//                    nums[j] = nums[j-1];
//                    nums[j-1] = temp;
//                }
//            }
//        }

        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            if(nums[i] > nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j --;
            }
            else{
               j--;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortcolors(nums);
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i] +"\t");
        }
    }
}
