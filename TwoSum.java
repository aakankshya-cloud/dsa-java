//import java.util.HashMap;
//
//public class TwoSum {
//    public int[] twoSum(int[] nums, int target){
////        brute
//        int[] result = new int[2];
//        for(int i = 0; i < nums.length; i++){
//            for(int j = i + 1; j < nums.length; j++){
//                int sum = nums[i] + nums[j];
//                if(sum == target){
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;
//
////        optimise
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int[] result = new int[2];
//        for(int i = 0; i < nums.length; i++){
//            int needed = target - nums[i];
//            if(map.containsKey(needed)){
//                result[0] = i;
//                result[1] = map.get(needed);
//                return result;
//            }
//            map.put(nums[i],i);
//        }
//        return result;
//    }
//}
