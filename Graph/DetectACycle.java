import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectACycle {
    class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, boolean[] vis, int src, int V){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(src,-1));
        vis[src] = true;
        while(!queue.isEmpty()){
            int node = queue.peek().first;
            int parent = queue.peek().second;
            queue.remove();
            for(int adjNode : adj.get(node)){
                if(!vis[adjNode]){
                    vis[adjNode] = true;
                    queue.add(new Pair(adjNode,node));
                }
                else{
                    if(parent != adjNode){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];
        for(int i = 0; i < V; i++){
            vis[i] = false;
        }
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                if(checkForCycle(adj,vis,i,V)) return true;
            }
        }
        return false;
    }
}
