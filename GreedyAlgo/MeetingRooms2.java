package GreedyAlgo;

public class MeetingRooms2 {
    public int canAttendMeetings(int[][] intervals){
        int[] current = intervals[0];
        int count = 1;
        for(int i = 1; i < intervals.length; i++){
            if(current[1] > intervals[i][0]){
                count++;
            }
            current = intervals[i];
        }
        return count;
    }
}
