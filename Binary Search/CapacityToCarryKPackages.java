public class CapacityToCarryKPackages {
    public int shipWithinDays(int[] weights, int days){
        int sum = 0;
        int max = 0;
        for(int i = 0; i < weights.length; i++){
            sum = sum + weights[i];
            max = Integer.max(max,weights[i]);
        }
        int low = max;
        int high = sum;
        int ans = max;
        while(low <= high){
            int total = 1;
            int currentWeight = 0;
            int mid = (low + high)/2;
            for(int i = 0; i < weights.length; i++){
                if(currentWeight + weights[i] <= mid){
                    currentWeight += weights[i];
                }
                else{
                    total++;
                    currentWeight = weights[i];
                }
            }
            if(total > days){
                low = mid + 1;
            }
            else{
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
