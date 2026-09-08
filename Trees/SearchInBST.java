import java.util.ArrayList;

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int val){
        while(root != null && root.val != val){
            if(root.val > val){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }
        return root;
    }
}
