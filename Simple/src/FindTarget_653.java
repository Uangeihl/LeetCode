import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个二叉搜索树 root 和一个目标结果 k，如果二叉搜索树中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 */
public class FindTarget_653 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return help_653(root, set, k);
    }

    static boolean help_653(TreeNode root, Set<Integer> set, int k) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        else set.add(root.val);
        return help_653(root.left, set, k) || help_653(root.right, set, k);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2), new TreeNode(4)),
                new TreeNode(6,
                        null,
                        new TreeNode(7)));
        System.out.println(findTarget(root, 9));
    }
}
