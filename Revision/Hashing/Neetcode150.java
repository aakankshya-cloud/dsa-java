import java.util.*;

public class Neetcode150 {
    public int maxArea(int[] heights){
        int i = 0, j = heights.length - 1;
        int max = 1;
        int area = 1;
        while(i < j){
            area = Math.min(heights[i] , heights[j]) * (j - i);
            max = Math.max(max,area);
            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
}
