/**
 * 给你一个整数数组 nums ，其中总是存在 唯一的 一个最大整数 。
 * 请你找出数组中的最大元素并检查它是否 至少是数组中每个其他数字的两倍 。如果是，则返回 最大元素的下标 ，否则返回 -1 。
 */
public class DominantIndex_747 {
    public static int dominantIndex(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = nums[i] > nums[max] ? i : max;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == max) continue;
            if (nums[i] != 0 && nums[max] / nums[i] < 2) return -1;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 3, 2};
        System.out.println(dominantIndex(nums));
    }
}
