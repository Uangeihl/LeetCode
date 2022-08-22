import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给你两棵二叉树 root 和 subRoot 。检验 root 中是否包含和 subRoot 具有相同结构和节点值的子树。如果存在，返回 true ；否则，返回 false 。
 * 二叉树 tree 的一棵子树包括 tree 的某个节点和这个节点的所有后代节点。tree 也可以看做它自身的一棵子树。
 */
public class IsSubtree_572 {
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

    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        /*Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                if (help_572(root,subRoot)) return true;
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop().right;
            }
        }
        return false;*/
        if (subRoot == null) return true;
        if (root == null) return false;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot) || help_572(root,subRoot);
    }

    static boolean help_572(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot ==null) return true;
        if (root == null || subRoot == null) return false;
        if (root.val != subRoot.val) return false;
        return help_572(root.left, subRoot.left) && help_572(root.right, subRoot.right);
    }
}
