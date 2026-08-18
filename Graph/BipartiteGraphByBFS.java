import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// any graph with a even cycle length can also be bipartite
// any graph that does not have a cycle is also a bipartite
public class BipartiteGraphByBFS {
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> queue = new LinkedList<>();
        int[] color = new int[V];
        for(int i = 0; i < V; i++){
            color[i] = -1;
        }
        for(int i = 0; i < V; i++) {
            if (color[i] == -1) {
                queue.add(i);
                color[i] = 0;
                while (!queue.isEmpty()) {
                    int node = queue.peek();
                    queue.remove();
                    for (int adjNode : adj.get(node)) {
                        if (color[adjNode] == -1) {
                            color[adjNode] = 1 - color[node];
                            queue.add(adjNode);
                        } else {
                            if (color[node] == color[adjNode]) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

}
