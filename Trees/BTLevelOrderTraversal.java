import java.util.ArrayList;
import java.util.List;

public class BTLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return result;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(root.left.val);
        arr.add(root.right.val);
        result.add(arr);
        levelOrder(root.left);
        levelOrder(root.right);
        return result;
    }
}
