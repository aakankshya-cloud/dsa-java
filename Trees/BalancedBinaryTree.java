public class BalancedBinaryTree {
    public int height(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Integer.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root){
        if(root == null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
