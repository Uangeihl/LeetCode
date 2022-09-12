/**
 * 给定二叉搜索树（BST）的根节点 root 和一个整数值 val。
 * 你需要在 BST 中找到节点值等于 val 的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 null 。
 */
public class searchBST_700 {
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

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        return searchBST(val < root.val ? root.left : root.right, val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7));
        TreeNode re = searchBST(root, 5);
        help_700(re);
    }

    static void help_700(TreeNode root) {
        if (root == null) return;
        System.out.println(root.val);
        help_700(root.left);
        help_700(root.right);
    }
}
