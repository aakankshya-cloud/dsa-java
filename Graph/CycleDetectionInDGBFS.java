import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectionInDGBFS {
    public boolean check(ArrayList<ArrayList<Integer>> adj, int V){
        int[] inDegree = new int[V];
        for(int i = 0; i < V; i++){
            for(int adjNode : adj.get(i)){
                inDegree[adjNode]++;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(inDegree[i] == 0){
                queue.add(i);
            }
        }
        while (!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);
            for(int adjNode : adj.get(node)){
                inDegree[adjNode]--;
                if(inDegree[adjNode] == 0){
                    queue.add(adjNode);
                }
            }
        }
        if(result.size() < V){
            return true;
        }
        return false;
    }
}
