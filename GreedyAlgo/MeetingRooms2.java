package GreedyAlgo;

import java.util.ArrayList;
import java.util.Collections;

public class MeetingRooms2 {
    public int canAttendMeetings(int[][] intervals){
        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            start.add(intervals[i][0]);
            end.add(intervals[i][1]);
        }
        int i = 0, j = 0;
        int max = 0;
        int count = 0;
        Collections.sort(start);
        Collections.sort(end);
        while(i < start.size() && j < end.size()){
            if(start.get(i) < end.get(j)){
                count++;
                max = Math.max(count, max);
                i++;
            }
            else{
                count--;
                j++;
            }
        }
        return max;
    }
}