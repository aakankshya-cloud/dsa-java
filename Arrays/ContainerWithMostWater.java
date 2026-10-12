public class ContainerWithMostWater {
    public int maxArea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int min = Integer.MAX_VALUE;
        int area = 0;
        int max = 0;
        while(left < right){
            min = Math.min(height[left], height[right]);
            area = min * (right - left);
            max = Math.max(area, max);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
