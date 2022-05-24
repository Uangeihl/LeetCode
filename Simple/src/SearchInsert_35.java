/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class SearchInsert_35 {
    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int middle;
        while (left <= right) {
            middle = (left + right) / 2;
            if (target == nums[middle]) return middle;
            else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }
}
