import java.util.ArrayList;
import java.util.List;

public class RootToNodePath {
    public List<Integer> path(TreeNode root, TreeNode node) {
        List<Integer> ans = new ArrayList<>();
        find(root, node, ans);
        return ans;
    }

    private boolean find(TreeNode root, TreeNode node, List<Integer> ans) {
        if (root == null)
            return false;

        ans.add(root.val);

        if (root == node)
            return true;

        if (find(root.left, node, ans) || find(root.right, node, ans))
            return true;

        ans.remove(ans.size() - 1);   // Backtrack
        return false;
    }
}
