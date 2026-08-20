
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule2{
    public ArrayList<Integer> isPossible(int V, int[][] prerequisites){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < prerequisites.length; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] inDegree = new int[V];
        for(int i = 0; i < V; i++){
            for(int adjNode : adj.get(i)){
                inDegree[adjNode]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);
            for(int adjNode : adj.get(node)){
                inDegree[adjNode]--;
                if(inDegree[adjNode] == 0){
                    queue.add(adjNode);
                }
            }
        }
        return result;
    }
}
