/**
 * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
 * 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
 */
public class FindLengthOfLCIS_674 {
    public static int findLengthOfLCIS(int[] nums) {
        int begin = 0, max = 0;
        for (int end = 1; end < nums.length; end++) {
            if (nums[end] <= nums[end - 1]) begin = end;
            max = Math.max(max, end - begin);
        }
        return max + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 2, 2};
        System.out.println(findLengthOfLCIS(nums));
    }
}
