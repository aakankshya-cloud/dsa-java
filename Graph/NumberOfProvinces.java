import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfProvinces {
    public void dfs(ArrayList<ArrayList<Integer>> adj,int node,int[] vis){
        vis[node] = 1;
        for(Integer it : adj.get(node)){
            if(vis[it] == 0) {
                dfs(adj,it,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected , int V){
        int[] vis = new int[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int cnt = 0;
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                cnt++;
                dfs(adj,i,vis);
            }
        }
        return cnt;
    }
}
