import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KahnAlgo {
    public void Kahn(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] vis = new boolean[V];
        int[] inDegree = new int[V];
        for(int i = 0; i < V; i++){
            for(int adjNode : adj.get(i)){
                inDegree[adjNode]++;
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
                if(inDegree[adjNode] == 0) {
                    queue.add(adjNode);
                }
            }
        }
        System.out.println(result);
    }
}
