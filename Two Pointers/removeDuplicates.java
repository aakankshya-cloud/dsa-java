import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplicates {
//    public static int removeduplicates(int[] nums){
//        HashSet<Integer> set = new HashSet<>();
//        for(int i = 0 ; i < nums.length ; i++){
//            set.add(nums[i]);
//        }
//        for(int i : set){
//            System.out.print(i + "\t");
//        }
//        System.out.println();
//        return set.size();
//
//    }
public static int removeduplicates(int[] nums){
    int count = 1;
    int j = 0;
    int i = 0;
    while(j < nums.length){
        if(nums[i] == nums[j]) {
            j++;
        }
        else{
            count++;
            i++;
            nums[i+1] = nums[j];
            j++;
        }
    }
    return count;

}
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeduplicates(nums));
    }
}
