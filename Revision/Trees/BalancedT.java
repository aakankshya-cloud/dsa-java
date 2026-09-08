public class BalancedT {
    private int height(TreeNode root){
        if(root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(Math.abs(left - right) > 1){
            return -1;
        }
        if(left == -1) return -1;
        if(right == -1) return -1;
        return 1 + Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root){
        if(root == null){
            return true;
        }
        if(height(root) == -1){
            return false;
        }
        return true;
    }
}
