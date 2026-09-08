//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//public class ConstructBSTFromPreorder {
//    private int preIndex = 0;
//    public TreeNode bstFromPreorder(int[] preorder){
//        int ele = 0;
//        int[] inorder = preorder.clone();
//        Arrays.sort(inorder);
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i = 0; i < inorder.length; i++){
//            map.put(inorder[i] , i);
//        }
//        return build(preorder,0,inorder.length - 1,map);
//    }
//    public TreeNode build(int[] preorder,int left,int right,Map<Integer,Integer> map){
//        if(left > right) return null;
//        int rootVal = preorder[preIndex++];
//        TreeNode root = new TreeNode(rootVal);
//        int idx = map.get(rootVal);
//        root.left = build(preorder,left,idx - 1,map);
//        root.right = build(preorder,idx + 1,right,map);
//        return root;
//    }
//}

public class ConstructBSTFromPreorder {
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder){

    }
    private TreeNode build(int[] preorder, int bound){
        if(index == preorder.length || preorder[index] > bound){
            return null;
        }
        TreeNode root = new TreeNode(preorder[index++]);
        root.left = build(preorder , root.val);
        root.right = build(preorder , bound);
        return root;
    }

}
