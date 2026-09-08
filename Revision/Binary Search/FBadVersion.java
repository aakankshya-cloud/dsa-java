public class FBadVersion {
    public int firstBadVersion(int n){
        int low = 1 , high = n;
        while(low < high){
            int mid = (low + high)/2;
            if(isBadVersion(mid) == false){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}
