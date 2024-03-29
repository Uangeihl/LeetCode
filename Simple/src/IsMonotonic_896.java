/**
 * 如果数组是单调递增或单调递减的，那么它是 单调 的。
 * 如果对于所有 i <= j，nums[i] <= nums[j]，那么数组 nums 是单调递增的。 如果对于所有 i <= j，nums[i]> = nums[j]，那么数组 nums 是单调递减的。
 * 当给定的数组 nums 是单调数组时返回 true，否则返回 false。
 */
public class IsMonotonic_896 {
    public boolean isMonotonic(int[] nums) {
        boolean flag = nums[nums.length - 1] > nums[0];
        int temp = nums[0];
        if (flag) {
            for (int num : nums) {
                if (num < temp) return false;
                temp = num;
            }
        } else {
            for (int num : nums) {
                if (num > temp) return false;
                temp = num;
            }
        }
        return true;
    }
}
