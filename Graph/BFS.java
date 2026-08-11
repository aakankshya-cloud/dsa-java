import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public ArrayList<Integer> BFSGraph(int V, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] vis = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        vis[0] = true;
        while(!queue.isEmpty()){
            int node = queue.poll();
            bfs.add(node);
            for(int it : adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    queue.add(it);
                }
            }
        }
        return bfs;
    }
}
