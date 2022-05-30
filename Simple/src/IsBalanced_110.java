/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class IsBalanced_110 {
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int count = Math.abs(maxDepth(root.left) - maxDepth(root.right));
        if (count > 1) return false;
        else return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        /*TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));*/
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4), new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));
        System.out.println(isBalanced(root));
    }
}
