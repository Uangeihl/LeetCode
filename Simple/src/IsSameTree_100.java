/**
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class IsSameTree_100 {
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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
/*
        Stack<TreeNode> pstack = new Stack<>();
        Stack<TreeNode> qstack = new Stack<>();
        while (p != null && q != null || !pstack.empty() && !qstack.empty()) {
            if (p != null && q != null) {
                if (p.val != q.val) return false;
                pstack.push(p);
                p = p.left;
                qstack.push(q);
                q = q.left;
                if ((p != null && q == null) || (p == null && q != null)) return false;
            } else {
                TreeNode p1 = pstack.pop();
                TreeNode q1 = qstack.pop();
                p = p1.right;
                q = q1.right;
                if ((p != null && q == null) || (p == null && q != null)) return false;
            }
        }
        if (p != null || q != null) return false;
        return pstack.empty() && qstack.empty();*/
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        return left && right;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        TreeNode q = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        System.out.println(isSameTree(p, q));
    }
}
