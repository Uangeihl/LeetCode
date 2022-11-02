/**
 * 给你一棵二叉搜索树的 root ，请你 按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
 */

public class IncreasingBST_897 {
    public static class TreeNode {
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

    TreeNode res = new TreeNode();
    TreeNode p = res;

    void help_897(TreeNode root) {
        if (root == null) return;
        help_897(root.left);
        p.right = new TreeNode(root.val);
        p = p.right;
        help_897(root.right);
    }

    public TreeNode increasingBST(TreeNode root) {
        help_897(root);
        return res.right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(1), new TreeNode(7));
        IncreasingBST_897 s = new IncreasingBST_897();
        TreeNode res = s.increasingBST(root);
        while (res != null) {
            System.out.println(res.val);
            res = res.right;
        }
    }
}
