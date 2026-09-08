public class ContWithMostWater {
    public int maxArea(int[] height){
        int min = Integer.MAX_VALUE;
        int max = -1;
        for(int i = 0; i < height.length; i++){
            min = Math.min(min,height[i]);
            max = Math.max(max,height[i]);
        }

    }
}
