import java.util.*;

class Solution {
    public boolean isBipartite(int V, List<List<Integer>> edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(List<Integer> edge : edges){
            int u = edge.get(0);
            int v = edge.get(1);
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] vis = new int[V];
        Arrays.fill(vis, -1);
        queue.add(0);
        vis[0] = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int adjNode : adj.get(node)){
                if(vis[adjNode] == -1){
                    vis[adjNode] = 1 - vis[node];
                    queue.add(adjNode);
                }
                else{
                    if(vis[adjNode] == vis[node]){
                        return false;
                    }
                }
            }
    }
        return true;

    }
}
