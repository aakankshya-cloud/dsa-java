import com.sun.source.tree.Tree;

public class ValidateBS {
    public boolean isValidBST(TreeNode root){
        return Valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean Valid(TreeNode root,long min,long max){
        if(root == null){
            return true;
        }
        if(root.val <= min || root.val >= max) return false;
        return Valid(root.left,min, root.val) && Valid(root.right,root.val,max);
    }
}
