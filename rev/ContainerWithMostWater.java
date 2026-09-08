public class ContainerWithMostWater {
    public int maxArea(int[] heights){
        int left = 0, right = heights.length - 1;
        int max = 0;
        while(left < right){
            int min = Math.min(heights[left], heights[right]);
            int area = min * (right - left );
            max = Math.max(area,max);
            if(heights[left] < heights[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}
