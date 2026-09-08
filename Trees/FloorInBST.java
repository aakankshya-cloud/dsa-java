public class FloorInBST {
    public int Floor(TreeNode root, int key){
        int floor = -1;
        while(root != null){
            if(root.val == key){
                return root.val;
            }
            if(key > root.val){
                floor = root.val;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return floor;
    }
}
