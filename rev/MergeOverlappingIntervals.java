import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeOverlappingIntervals {
    public List<List<Integer>> mergeOverlap(List<List<Integer>> intervals){
        Collections.sort(intervals, (a, b) -> a.get(0) - b.get(0));
        List<Integer> current = intervals.get(0);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 1; i < intervals.size(); i++){
            List<Integer> next = intervals.get(i);
            if(next.get(0) >= current.get(1)){
                current.set(1, Math.max(next.get(1), current.get(1)));
            }
            else{
                res.add(current);
                current = next;
            }
        }
        res.add(current);
        return res;
    }
}
