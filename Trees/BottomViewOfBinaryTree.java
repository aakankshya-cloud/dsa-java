import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Pair {
    TreeNode node;
    int hd;

    Pair(TreeNode node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
public class BottomViewOfBinaryTree {
    public void bottom(TreeNode root){
        if(root == null) return;
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        queue.add(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair it = queue.remove();
            TreeNode current = it.node;
            int hd = it.hd;
            map.put(hd, current.val);
            if(current.left != null) queue.add(new Pair(current.left,hd - 1));
            if(current.right != null) queue.add(new Pair(current.right,hd + 1));
        }
        for(int values : map.values()){
            System.out.print(values + "\t");
        }
    }
}
