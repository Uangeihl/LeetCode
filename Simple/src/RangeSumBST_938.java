/**
 * 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
 */
public class RangeSumBST_938 {
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

    int sum = 0;

    public int rangeSumBST(TreeNode root, int low, int high) {
        help_938(root, low, high);
        return sum;
    }

    void help_938(TreeNode root, int low, int high) {
        if (root == null) return;
        help_938(root.left, low, high);
        if (root.val >= low && root.val <= high) sum += root.val;
        help_938(root.right, low, high);
    }
}
