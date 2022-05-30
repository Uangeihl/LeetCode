import java.util.Arrays;

/**
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 */
public class SortedArrayToBST_108 {
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

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return new TreeNode(nums[nums.length / 2],
                sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2)),
                sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length))
        );
    }

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        System.out.println(sortedArrayToBST(nums));
    }
}
