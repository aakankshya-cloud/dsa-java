import java.util.*;

public class Neetcode150 {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int i = 0; i < piles.length; i++){
            high = Integer.max(piles[i],high);
        }

        while(low <= high){
            int mid = (low + high)/2;
            int count = 0;
            for(int i = 0; i < piles.length; i++){
                if(piles[i] % mid != 0) {
                    count = count + (piles[i] / mid) + 1;
                }
                else{
                    count = count + (piles[i] / mid);
                }
            }
            if(count > h){
                low = mid + 1;
            }
            if(count <= h){
                high = mid - 1;
            }
        }
        return low;
    }
}
