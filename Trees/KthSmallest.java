import java.util.ArrayList;

public class KthSmallest {
    private void inorder(TreeNode root, ArrayList<Integer> arr,int k){
        if(root == null){
            return;
        }
        inorder(root.left,arr,k);
        arr.add(root.val);
        inorder(root.right,arr,k);

    }
    public int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr,k);
        return arr.get(k - 1);
    }
}
