import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        if(root == null) return new ArrayList<>();;
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        boolean leftToRight = true;
        queue.offer(root);
        while(!queue.isEmpty()){
            LinkedList<Integer> level = new LinkedList<>();
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                if (leftToRight) {
                    level.addLast(current.val);
                } else {
                    level.addFirst(current.val);
                }
                if(current.left != null)
                    queue.offer(current.left);

                if(current.right != null)
                    queue.offer(current.right);
            }
            ans.add(level);
            leftToRight = !leftToRight;
        }
        return ans;
    }
}
