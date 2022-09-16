/**
 * 给你一个整数数组 nums ，请计算数组的 中心下标 。
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 */
public class PivotIndex_724 {
    public static int pivotIndex(int[] nums) {
        int sum = 0, sumLeft = 0, n = nums.length;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < n; i++) {
            if (sumLeft == sum - nums[i]) return i;
            sumLeft += nums[i];
            sum -= nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, -1, 0, -1};
        System.out.println(pivotIndex(nums));
    }
}
