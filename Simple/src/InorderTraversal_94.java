import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 */
public class InorderTraversal_94 {
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

    public static List<Integer> inorderTraversal(TreeNode root) {
        /*List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode p;
        while (root != null) {
            if (root.left != null) {
                stack.push(root);
                root = root.left;
            } else {
                list.add(root.val);
                if (root.right != null) root = root.right;
                else if (!stack.empty()) {
                    p = stack.pop();
                    list.add(p.val);
                    while (p.right == null && !stack.empty()) {
                        p = stack.pop();
                        list.add(p.val);
                    }
                    root = p.right;
                } else break;
            }
        }
        return list;*/
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.empty()) {
            if (root != null) {
                /*list.add(root.val);*///前序遍历
                stack.push(root);
                root = root.left;
            } else {
                TreeNode p = stack.pop();
                list.add(p.val);//中序遍历
                root = p.right;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(4,
                        new TreeNode(2),
                        null),
                new TreeNode(3));
        System.out.println(inorderTraversal(root));
    }
}
