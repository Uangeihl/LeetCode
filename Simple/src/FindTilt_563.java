/**
 * 给你一个二叉树的根节点 root ，计算并返回 整个树 的坡度 。
 * 一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值 。如果没有左子树的话，左子树的节点之和为 0 ；没有右子树的话也是一样。空结点的坡度是 0 。
 * 整个树 的坡度就是其所有节点的坡度之和。
 */
public class FindTilt_563 {
    public int findTilt(TreeNode root) {
        if (root == null) return 0;
        return findTilt(root.right) + findTilt(root.left) + Math.abs(help_563(root.right) - help_563(root.left));
    }

    static int help_563(TreeNode root) {
        if (root == null) return 0;
        return help_563(root.left) + help_563(root.right) + root.val;
    }
}
