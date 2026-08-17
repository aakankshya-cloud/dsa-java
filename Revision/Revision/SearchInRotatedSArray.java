package Revision.Revision;

public class SearchInRotatedSArray {
    public int search(int[] nums, int target){
        int left = 0, right = nums.length;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > nums[right]){
                if(target < nums[left]){
                    left = mid + 1;
                }
                else{
                     right = mid;
                }
            }
            else{
                if(target > nums[mid]){
                    left = mid + 1;
                }
                else{
                    right = mid;
                }
            }
        }
        return -1;
    }
}
