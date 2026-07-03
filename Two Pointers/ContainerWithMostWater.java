import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.lang.Math;

public class ContainerWithMostWater {
    public static int maxArea(int[] height){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0 ; i < height.length ; i++) {
//            if(!map.containsKey(height[i])){
//                map.put(height[i] , i);
//            }
//        }
//        Arrays.sort(height);
//        int i = height.length - 1;
//        int j = height.length - 1;
//        while (height[i] == height[j]){
//            j--;
//        }
//        int area = (Math.abs((map.get(height[i]))-(map.get(height[j])) )* height[j]);
//        return area;

//        optimal
        int i = 0 , j = height.length - 1;
        int area = 1;
        int max = Integer.MIN_VALUE;
        while(i < j){
            area = (j - i) * Math.min(height[i] , height[j]);
            max = Math.max(max,area);
            if(height[i] > height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
