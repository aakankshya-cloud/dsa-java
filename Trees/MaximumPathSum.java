public class MaximumPathSum {
    int max = Integer.MIN_VALUE;
    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = Math.max(0,dfs(root.left));
        int right = Math.max(0,dfs(root.right));
        max = Math.max(max , right + left + root.val);
        return root.val + Math.max(left,right);
    }
    public int MaxSum(TreeNode root){
        dfs(root);
        return max;
    }
}
