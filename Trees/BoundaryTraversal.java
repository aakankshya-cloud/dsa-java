

import java.util.ArrayList;


public class BoundaryTraversal {
    private boolean isLeaf(TreeNode node){
        return node.left == null && node.right == null;
    }
    public void addLeftBoundary(TreeNode root, ArrayList<Integer> arr){
        TreeNode current = root.left;
        while(current != null) {
            if(!isLeaf(current)){
                arr.add(current.val);
            }
            if(current.left != null){
                current = current.left;
            }
            else{
                current = current.right;
            }
        }
    }
    public void addRightBoundary(TreeNode root, ArrayList<Integer> arr){
        ArrayList<Integer> temp = new ArrayList<>();
        TreeNode current = root.right;
        while(current != null){
            if(!isLeaf(current)){
                temp.add(current.val);
            }
            if(current.right != null){
                current = current.right;
            }
            else{
                current = current.left;
            }
        }
        for(int i = temp.size() - 1; i >= 0; i--){
            arr.add(temp.get(i));
        }
    }
    public void addLeaf(TreeNode root,ArrayList<Integer> arr){
        if(root == null)
            return;
        if(isLeaf(root)){
            arr.add(root.val);
        }
        if(root.left != null) addLeaf(root.left,arr);
        if(root.right != null) addLeaf(root.right,arr);
    }
}
