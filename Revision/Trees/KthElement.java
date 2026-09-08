import java.util.ArrayList;
import java.util.Collections;

//public class KthElement {
//    public void inorder(TreeNode root, ArrayList<Integer> arr){
//        if(root == null) return;
//        inorder(root.left,arr);
//        arr.add(root.val);
//        inorder(root.right,arr);
//    }
//    public int kthSmallest(TreeNode root, int k){
//        ArrayList<Integer> arr = new ArrayList<>();
//        inorder(root,arr);
//        return arr.get(k - 1);
//    }
//}


// naive method
public class KthElement {
    public void preorder(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        arr.add(root.val);
        preorder(root.left,arr);
        preorder(root.right,arr);
    }
    public int kthSmallest(TreeNode root, int k){
        ArrayList<Integer> arr = new ArrayList<>();
        preorder(root,arr);
        Collections.sort(arr);
        return arr.get(k - 1);
    }
}
