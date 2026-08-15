package Revision.Revision;

public class TrappingRWater {
    public int trap(int[] height){
//        int[] prefixMax = new int[height.length];
//        int[] suffixMax = new int[height.length];
//        prefixMax[0] = height[0];
//        suffixMax[height.length - 1] = height[height.length - 1];
//        for(int i = 1; i < height.length; i++){
//            prefixMax[i] = Math.max(height[i],prefixMax[i - 1]);
//        }
//        for(int i = height.length - 2; i >= 0; i--){
//            suffixMax[i] = Math.max(suffixMax[i + 1],height[i]);
//        }
//        int total = 0;
//        for(int i = 0; i < height.length; i++){
//            int leftMax = prefixMax[i], rightMax = suffixMax[i];
//            if(height[i] < prefixMax[i] && height[i] < suffixMax[i]){
//                total = total + (Math.min(leftMax,rightMax) - height[i]);
//            }
//        }
//        return total;


//        2 --------------------------------------------------------------
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0, total = 0;
        while(left <= right){
            if(height[left] <= height[right]){
                if(leftMax > height[left] && height[right] > height[left]){
                    total += (leftMax - height[left]);
                }
                else{
                    leftMax = height[left];
                }
                left++;
            }
            else{
                if(rightMax > height[right] && height[left] > height[right]){
                    total += (rightMax - height[right]);
                }
                else{
                    rightMax = height[right];
                }
                right--;
            }
        }
        return total;
    }
}
