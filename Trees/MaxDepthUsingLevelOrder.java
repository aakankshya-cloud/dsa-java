import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthUsingLevelOrder {
    public int maxDepth(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0;
        if(root == null){
            return 0;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> ans = new ArrayList<>();

            for(int i = 0; i < size; i++){
                TreeNode current = queue.poll();
                if(current.left != null){
                    queue.offer(current.left);
                }
                if(current.right != null){
                    queue.offer(current.right);
                }
                ans.add(current.val);
            }
            count++;
        }
        return count;
    }
}
