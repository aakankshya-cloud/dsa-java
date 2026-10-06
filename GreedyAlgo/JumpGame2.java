package GreedyAlgo;

public class JumpGame2 {
    public int jump(int[] nums) {
        int maxIndex = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] + i > maxIndex){
                count++;
            }
            maxIndex = Math.max(maxIndex, i + nums[i]);
            if(maxIndex >= nums.length - 1){
                return count;
            }
        }
        return -1;
    }
}
