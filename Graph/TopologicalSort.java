import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSort {
    public void dfs(ArrayList<ArrayList<Integer>> adj, int V, int node, boolean[] vis, Stack<Integer> stack){
        vis[node] = true;
        for(int adjNode : adj.get(node)){
            if(!vis[adjNode]){
                dfs(adj,V,adjNode,vis,stack);
            }
        }
        stack.push(node);
    }
    public ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] vis = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                dfs(adj,V,i,vis,stack);
            }
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
}
