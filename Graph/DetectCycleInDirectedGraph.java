import java.util.ArrayList;

public class DetectCycleInDirectedGraph {
    public boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int src, int V, boolean[] pathVis){
        vis[src] = true;
        for(int adjNode : adj.get(src)){
            if(!vis[adjNode]) {
                if(checkForCycle(adj, vis, adjNode, V, pathVis)) return true;
            }
            else{
                if(pathVis[adjNode]){
                    return true;
                }
            }
        }
        pathVis[src] = false;
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];
        boolean[] pathVis = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(checkForCycle(adj,vis,i,V,pathVis)) return true;
            }
        }
        return false;
    }
}
