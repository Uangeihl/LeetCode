/**
 * 给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。
 */
public class MinMoves_453 {
    public static int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int num : nums) {
            min = Math.min(num, min);
            sum += num;
        }
        return sum - nums.length * min;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        System.out.println(minMoves(nums));
    }
}
