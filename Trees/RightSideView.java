import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RightSideView {
    public void Right(TreeNode root,int level){
        if(root == null){
            return;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        if(level == arr.size()){
            arr.add(root.val);
        }
        Right(root.right,level + 1);
        Right(root.left,level + 1);
    }
}
