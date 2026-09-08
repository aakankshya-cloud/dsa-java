import java.util.ArrayList;

public class InorderSuccessorInBST {
//    public void inorder(TreeNode root , ArrayList<Integer> arr){
//        if(root == null){
//            return;
//        }
//        inorder(root.left,arr);
//        arr.add(root.val);
//        inorder(root.right , arr);
//    }
//    public void successor(TreeNode root, int key) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        inorder(root, arr);
//        int ind = arr.indexOf(key);
//        if (ind == -1) {
//            System.out.println("Key not found");
//        } else if (ind == arr.size() - 1) {
//            System.out.println("No inorder successor");
//        } else {
//            System.out.println(arr.get(ind + 1));
//        }
//    }


//
    int successor = Integer.MAX_VALUE;
    public void traverse(TreeNode root , int key){

    }
public void successor(TreeNode root, int key){
    if(root == null) return;
    if(key == root.val) System.out.println(root.right.val);
    if(key > root.val){
        successor(root.right,key);
    }
    if(key < root.val){
        successor(root.left,key);
    }

}
}
