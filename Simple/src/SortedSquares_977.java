import java.util.Arrays;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
public class SortedSquares_977 {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length - 1;
        int[] res = new int[n + 1];
        int left = 0, right = n;
        while (left <= right) {
            if (Math.abs(nums[right]) > Math.abs(nums[left])) res[n--] = (int) Math.pow(nums[right--], 2);
            else res[n--] = (int) Math.pow(nums[left++], 2);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
