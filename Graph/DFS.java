import java.util.ArrayList;

public class DFS {
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited, ArrayList<Integer> ls){
        visited[node] = true;
        ls.add(node);
        for(int it : adj.get(node)){
            if(visited[it] == false){
                dfs(it,adj,visited,ls);
            }
        }
    }
    public ArrayList<Integer> DFSGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,adj,visited,ls);
        return ls;
    }
}
