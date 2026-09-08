import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhenAllAreFree {
    public int findEarliestFreeTime(int[][][] schedules, int x){
        List<int[]> intervals = new ArrayList<>();
        for(int i = 0; i < schedules.length; i++){
            intervals.addAll(Arrays.asList(schedules[i]));
        }
        intervals.sort((a, b) -> Integer.compare(a[0], b[0]));
        int i = 0;
        while(i < intervals.size()){
            if(intervals[i][1] > intervals[i + 1][0]){
                intervals[i]
            }
        }
    }
}