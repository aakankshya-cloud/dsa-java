import java.util.ArrayList;

public class DetectCycleInDirectedGraph {
    public boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int src, int V){
        vis[src] = true;
        for(int adjNode : adj.get(src)){
            if(!vis[adjNode]) {
                checkForCycle(adj, vis, adjNode, V);
            }
            else{
                if(adjNode == )
            }
        }


    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];

    }
}
