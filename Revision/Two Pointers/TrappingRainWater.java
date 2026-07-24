public class TrappingRainWater {
    public int trap(int[] height){
        int low = 0, high = 0;
        int total = 0;
        while(high < height.length){
            if(low < high){
                if(height[high] == 0){
                    total += height[low];
                    low = high;
                }
            }
            else{
                if(height[high] == 0){
                    total += low;
                }
            }
            high++;
        }
        return total;
    }
}
