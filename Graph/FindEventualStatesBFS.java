import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class FindEventualStatesBFS {
    public ArrayList<Integer> eventual(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<ArrayList<Integer>> adjRev = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adjRev.add(new ArrayList<>());
        }
        int[] inDegree = new int[V];
        for(int i = 0; i < V; i++) {
            for (int adjNode : adj.get(i)){
                adjRev.get(adjNode).add(i);
                inDegree[i]++;
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
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
        Collections.sort(result);
        return result;
    }
}
