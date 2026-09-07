//import java.util.HashMap;
//
////public class SubarraySumEqualToK {
////    public int subarraySum(int[] nums, int k){
////        HashMap<Integer, Integer> map = new HashMap<>();
////        int cur = 0, cnt = 0;
////        for(int i = 0; i < nums.length; i++){
////            cur = cur + nums[i];
////            int needed = k - cur;
////            if(map.containsKey(needed)){
////                cnt = cnt + map.get(needed);
////            }
////            map.put(cur, map.getOrDefault(cur, 0) + 1);
////        }
////        return cnt;
////    }
////}
//
//public class SubarraySumEqualToK {
//    public int subarraySum(int[] nums, int k) {
//        int cnt = 0;
//        for(int i = 0; i < nums.length; i++){
//            int sum = 0;
//            for(int j = i; j < nums.length; j++){
//                sum = sum + nums[j];
//                if(sum == k){
//                    cnt++;
//                }
//            }
//        }
//        return cnt;
//    }
//}