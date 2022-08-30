/**
 * 给你二叉树的根节点 root ，请你采用前序遍历的方式，将二叉树转化为一个由括号和整数组成的字符串，返回构造出的字符串。
 * 空节点使用一对空括号对 "()" 表示，转化后需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 */
public class Tree2str_606 {
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

    public String tree2str(TreeNode root) {
        StringBuffer res = new StringBuffer();
        help_606(root, res);
        return String.valueOf(res);
    }

    static void help_606(TreeNode root, StringBuffer res) {
        if (root == null) return;
        res.append(root.val);
        if (root.left != null || root.right != null) res.append('(');
        help_606(root.left, res);
        if (root.left != null || root.right != null) res.append(')');
        if (root.right != null) res.append('(');
        help_606(root.right, res);
        if (root.right != null) res.append(')');
    }
}
