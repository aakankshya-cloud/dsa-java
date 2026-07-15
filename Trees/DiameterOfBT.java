//public class DiameterOfBT {
//    private int diameter = 0;
//    public int diameterOfBinaryTree(TreeNode root) {
//        HeightOfBinaryTree(root);   // Which function goes here?
//        return diameter;
//    }
//    private int HeightOfBinaryTree(TreeNode root){
//        if(root == null){
//            return 0;
//        }
//        int left = diameterOfBinaryTree(root.left);
//        int right = diameterOfBinaryTree(root.right);
//        diameter = Math.max(diameter,left + right);
//        return Math.max(left,right)+1;
//    }
//}





public class DiameterOfBT {
    int diameter = 0;
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(diameter,left + right);
    }
    public int diameterOfBinaryTree(TreeNode root){
        height(root);
        return diameter;
    }
}