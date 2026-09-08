public class Move_Zeros {
    public static void moveZeroes(int[] nums){
//        int j = 0;
//        int i = 0;
//        while (j < nums.length  && i < nums.length ) {
//                if (nums[i] == 0){
//                    if(nums[j] == 0){
//                        j ++;
//                    }
//                    else {
//                        int temp = nums[i];
//                        nums[i] = nums[j];
//                        nums[j] = temp;
//                    }
//                }
//                else{
//                    i ++;
//            }
//        }
        int i = 0 , j = 0;
        while ( i <= j) {
            if(nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
            else if (nums[j] == 0){
                j++;
            }
            else if(nums[i] != 0){
                i++;
            }
        }
    }public static void main(String[] args) {
        int nums[] = {1,0};
        moveZeroes(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "\t");
        }

    }
}
