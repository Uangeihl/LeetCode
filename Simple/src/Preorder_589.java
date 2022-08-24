import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个 n 叉树的根节点  root ，返回 其节点值的 前序遍历 。
 * n 叉树 在输入中按层序遍历进行序列化表示，每组子节点由空值 null 分隔（请参见示例）。
 */
public class Preorder_589 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        help_589(root, res);
        return res;
    }

    static void help_589(Node root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            for (Node child : root.children) {
                help_589(child, res);
            }
        }
    }
}
