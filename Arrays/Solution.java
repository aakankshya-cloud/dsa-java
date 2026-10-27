import java.util.*;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            int diff = Integer.compare(Math.abs(x - b), Math.abs(x - a));
            if(diff != 0) return diff;
            return Integer.compare(b, a);
        });
        for(int num : arr){
            pq.offer(num);
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<Integer> res = new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
    }
}
