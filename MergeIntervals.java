//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Stack;
//
//public class MergeIntervals {
//    public int[][] merge(int[][] intervals) {
////        int n = intervals.length;
////        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
////        ArrayList<int[]> arr = new ArrayList<>();
////        Stack<int[]> stack = new Stack<>();
////        stack.add(intervals[0]);
////        for(int i = 1; i < n; i++){
////            int[] top = stack.peek();
////            int[] current = intervals[i];
////            if(current[0] <= top[1]){
////                top[1] = Math.max(top[1],current[1]);
////            }
////            else{
////                stack.push(current);
////            }
////        }
////        return stack.toArray(new int[stack.size()][]);
////    }
//
////    optimal
//        int n = intervals.length;
//        ArrayList<int[]> arr = new ArrayList<>();
//        int[] current = intervals[0];
//        for(int i = 1; i < n; i++){
//            if(intervals[i][0] <= current[1]){
//                current[1] = Math.max(current[1],intervals[i][1]);
//            }
//            else{
//                arr.add(current);
//                current = intervals[i];
//            }
//        }
//        arr.add(current);
//        return arr.toArray(new int[arr.size()][]);
//    }
//
//}
