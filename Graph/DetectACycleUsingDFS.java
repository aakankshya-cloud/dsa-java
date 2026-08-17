import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectACycleUsingDFS {
    class Pair{
        int node;
        int parent;
        Pair(int node, int parent){
            this.node = node;
            this.parent = parent;
        }
    }
    public boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int src, int V, int parent){
        vis[src] = true;
        for(int adjNode : adj.get(src)){
            if(!vis[adjNode]){
                vis[adjNode] = true;
                if(checkForCycle(adj,vis,adjNode,V,src)) return true;
            }
            else{
                if(adjNode != parent){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(checkForCycle(adj,vis,i,V,-1)) return true;
            }
        }
        return false;
    }
}
