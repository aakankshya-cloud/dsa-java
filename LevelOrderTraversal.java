//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//
//public class LevelOrderTraversal {
//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, TreeNode left, TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//    public List<List<Integer>> levelOrder(TreeNode root){
//            Queue<TreeNode> queue = new LinkedList<>();
//            List<List<Integer>> result = new ArrayList<>();
//            if(root == null) return result;
//            queue.add(root);
//            while(!queue.isEmpty()){
//                ArrayList<Integer> ls = new ArrayList<>();
//                int size = queue.size();
//                for(int i = 0; i < size; i++){
//                    TreeNode node = queue.poll();
//                    ls.add(node.val);
//                    if(node.left != null){
//                        queue.add(node.left);
//                    }
//                    if(node.right != null){
//                        queue.add(node.right);
//                    }
//                }
//                result.add(ls);
//            }
//            return result;
//    }
//
//    }
//}
