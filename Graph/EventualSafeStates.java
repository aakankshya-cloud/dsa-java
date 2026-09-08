import java.util.ArrayList;
public class EventualSafeStates {
    public ArrayList<Integer> eventualSafeNodes(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V];
        int[] check = new int[V];
        boolean[] pathVis = new boolean[V];
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                checkForCycle(V,adj,vis,pathVis,i,check);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < V; i++){
            if(check[i] == 1){
                list.add(i);
            }
        }
        return list;

    }
    public boolean checkForCycle(int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis, boolean[] pathVis, int node, int[] check){
        vis[node] = true;
        for(int adjNode : adj.get(node)){
            if(!vis[adjNode]){
                if(checkForCycle(V,adj,vis,pathVis,adjNode,check)) return true;
            }
            else{
                if(pathVis[adjNode]){
                    check[node] = 0;
                    pathVis[node] = false;
                    return true;
                }
            }
        }
        check[node] = 1;
        pathVis[node] = false;
        return false;
    }
}
