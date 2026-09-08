public class CeilInBST {
    public int Ceil(TreeNode root, int key){
        int ciel = -1;
        while(root != null) {
            if(root.val == key){
                return root.val;
            }
            if (key < root.val) {
                ciel = root.val;
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return ciel;
    }
}
