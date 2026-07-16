import java.util.ArrayList;

public class DFS {
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited, ArrayList<Integer> ls){
        visited[node] = true;
        ls.add(node);
        for(Integer it : adj.get(node)){
            if(!visited[it]){
                dfs(node,adj,visited,ls);
            }
        }
    }
    public ArrayList<Integer> BFSGraph(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[V+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,adj,vis,ls);
        return ls;
    }
}
