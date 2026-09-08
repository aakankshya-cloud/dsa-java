import java.util.ArrayList;
import java.util.List;
class TreeNode {
     int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { data = val; left = null, right = null }
}
public class Rev {
    class Solution {
        public List<Integer> floorCeilOfBST(TreeNode root, int key) {
            int floor = -1, ciel = -1;
            while (root != null)
                if (root.data == key) {
                    floor = root.data;
                    ciel = root.data;
                    break;
                }
            if (root.data < key) {
                floor = root.data;
                root = root.right;
            } else {
                ciel = root.data;
                root = root.left;
            }
            List<Integer> res = new ArrayList<>();
            res.add(floor);
            res.add(ciel);

            return res;
        }

        }
    }
}
