import java.util.ArrayList;
import java.util.List;

public class LeftView {
    public List<Integer> Left(TreeNode root){
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,arr,0);
        return arr;
    }
    private void dfs(TreeNode root,ArrayList<Integer> arr,int level){
        if(root == null){
            return;
        }
        if(arr.size() == level){
            arr.add(root.val);
        }
        dfs(root.left,arr,level+1);
        dfs(root.right,arr,level+1);
    }
}
