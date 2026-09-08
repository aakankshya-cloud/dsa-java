public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h){
        int max = 0;
        for(int i = 0; i < piles.length; i++){
            max = Integer.max(max , piles[i]);
        }
        int answer = max;
        int low = 1;
        int high = max;
        while(low <= high){
            int mid = (low + high)/2;
            int k = mid;
            long total = 0;
            for (int i = 0; i < piles.length; i++) {

                total += piles[i] / k;
                if (piles[i] % k != 0) {
                    total++;
                }
            }
            if(total <= h){
                answer = k;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return answer;
    }
}
