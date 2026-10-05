package GreedyAlgo;

import java.util.Arrays;
import java.util.Stack;

public class OverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Stack<int[]> stack = new Stack<>();
        stack.add(intervals[0]);
        int i = 1;
        int cnt = 0;
        while(i < intervals.length){
            if(intervals[i][0] < stack.peek()[1]){
                if(stack.peek()[1] > intervals[i][1]){
                    stack.push(intervals[i]);
                }
                cnt++;
            }
            else{
                stack.add(intervals[i]);
            }
            i++;
        }
        return cnt;
    }
}