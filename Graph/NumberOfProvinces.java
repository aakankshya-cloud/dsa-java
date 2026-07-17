import java.util.ArrayList;
import java.util.Arrays;

public class NumberOfProvinces {
    public void dfs(ArrayList<ArrayList<Integer>> adj,int node,int[] vs){
        vs[node] = 1;
        for(int it : adj.get(node)){
            if(vs[it] == 0){
                dfs(adj,it,vs);
            }
        }
    }
    public int findCircleNum(int[][] isConnected , int V){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] vs = new int[V];
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                }
            }
        }
        int count = 0;
        for(int i = 0; i < V; i++){
            if(vs[i] == 0){
                count++;
                dfs(adj,i,vs);
            }
        }
        return count;
    }
}
