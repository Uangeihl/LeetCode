/**
 * 给定二叉树的根节点 root ，返回所有左叶子之和。
 */

public class SumOfLeftLeaves_404 {
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

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        return sumOfLeftLeaves(root.left)
                + sumOfLeftLeaves(root.right)
                + (root.left != null && root.left.left == null && root.left.right == null ? root.left.val : 0);
    }
}
