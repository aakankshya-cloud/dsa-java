import java.util.ArrayList;
import java.util.Stack;

public class ShortestPathInDAG {
    class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public void dfs(int node, ArrayList<ArrayList<Pair>> adj, int[] vis, Stack<Integer> stack){
        vis[node] = 1;
        for(int i = 0; i < adj.get(node).size(); i++){
            int v = adj.get(node).get(i).first;
            if(vis[v] == 0){
                dfs(v,adj,vis,stack);
            }
        }
        stack.add(node);
    }
    public int[] shortestPath(int N, int M, int[][] edges){
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i = 0; i < N; i++){
            ArrayList<Pair> temp = new ArrayList<Pair>();
            adj.add(temp);
        }
        for(int i = 0; i < M; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new Pair(v,wt));
        }
        int[] vis = new int[N];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < N; i++){
            if(vis[i] == 0){
                dfs(i,adj,vis,stack);
            }
        }
        int[] dis = new int[N];
        for(int i = 0; i < N; i++){
            dis[i] = (int)(1e9);
        }
        dis[0] = 0;
        while(!stack.isEmpty()){
            int node = stack.peek();
            stack.pop();
            for(int i = 0; i < adj.get(node).size(); i++){
                int v = adj.get(node).get(i).first;
                int wt = adj.get(node).get(i).second;
                if(dis[node] + wt < dis[v]){
                    dis[v] = wt + dis[node];
                }
            }
        }

    }
}
