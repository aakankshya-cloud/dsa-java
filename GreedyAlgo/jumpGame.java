package GreedyAlgo;

public class jumpGame {
    public boolean canJump(int[] nums){
        int maxIndex = 0;
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxIndex){
                return false;
            }
            index = i + nums[i];
            maxIndex = Math.max(maxIndex, index);
        }
        return true;
    }
}
