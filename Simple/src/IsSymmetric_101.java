/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称
 */
public class IsSymmetric_101 {
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

    public static boolean isSymmetric(TreeNode root) {
        return isSymmetricTree(root.left, root.right);
    }

    //用到了第100题的判断两棵树是否相同，在此基础上改为判断两棵树是否对称
    public static boolean isSymmetricTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        boolean left = isSymmetricTree(p.left, q.right);
        boolean right = isSymmetricTree(p.right, q.left);
        return left && right;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        TreeNode q = new TreeNode(1,
                new TreeNode(3),
                new TreeNode(2));
        TreeNode root = new TreeNode(3, p, q);
        System.out.println(isSymmetric(root));
    }
}
