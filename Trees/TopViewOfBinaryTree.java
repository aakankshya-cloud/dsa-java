import java.util.*;
//class Pair {
//    TreeNode node;
//    int hd;
//
//    Pair(TreeNode node, int hd) {
//        this.node = node;
//        this.hd = hd;
//    }
//}
public class TopViewOfBinaryTree {
    public void view (TreeNode root) {
        if(root == null){
            return;
        }
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.remove();
            int hd = it.hd;
            TreeNode temp = it.node;
            if(map.get(hd) == null) map.put(hd,temp.val);
            if(temp.left != null){
                q.add(new Pair(temp.left,hd - 1));
            }
            if(temp.right != null){
                q.add(new Pair(temp.right,hd + 1));
            }
        }
        for(int value : map.values()){
            System.out.print(value + "");
        }
    }
}
