public class TrappingRainwater {
    public int trap(int[] height){
        int total = 0;
        int[] prefixMax = new int[height.length];
        prefixMax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }
        int[] suffixMax = new int[height.length];
        suffixMax[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            suffixMax[i] = Math.max(height[i],suffixMax[i + 1]);
        }
        for(int i = 0; i < height.length; i++){
            int left = prefixMax[i], right = suffixMax[i];
            if(height[i] < left && height[i] < right){
                total += Math.min(left , right) - height[i];
            }
        }
        return total;
    }

}
