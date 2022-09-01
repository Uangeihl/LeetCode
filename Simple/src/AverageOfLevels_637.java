import java.util.*;

/**
 * 给定一个非空二叉树的根节点 root , 以数组的形式返回每一层节点的平均值。与实际答案相差 10-5 以内的答案可以被接受。
 */
public class AverageOfLevels_637 {
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

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        double sum = 0;
        int count = 0, temp = 1;
        queue.add(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i < temp; i++) {
                if (queue.peek() == null) {
                    queue.poll();
                    continue;
                }
                TreeNode p = queue.poll();
                sum += p.val;
                count++;
                queue.add(p.left);
                queue.add(p.right);
            }
            if (count > 0) res.add((sum / count));
            sum = 0;
            count = 0;
            temp = queue.size();
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(40,
                new TreeNode(0,
                        new TreeNode(17,
                                new TreeNode(82),
                                new TreeNode(-57)),
                        new TreeNode(-87,
                                new TreeNode(45),
                                new TreeNode(-52))),
                new TreeNode(-37,
                        new TreeNode(-13,
                                new TreeNode(3),
                                new TreeNode(-22)),
                        new TreeNode(62,
                                new TreeNode(-55),
                                new TreeNode(-54))));
        System.out.println(averageOfLevels(root));
    }
}
