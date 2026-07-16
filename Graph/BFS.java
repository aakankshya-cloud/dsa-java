import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> BFSGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean visited[] = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()) {
            Integer node = queue.poll();
            bfs.add(node);
            for (Integer it : adj.get(node)) {
                if (visited[it] == false) {
                    visited[it] = true;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }
}
