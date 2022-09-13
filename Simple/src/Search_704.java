/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class Search_704 {
    public static int search(int[] nums, int target) {
        int left = 0, rigtht = nums.length - 1, mid;
        while (left <= rigtht) {
            mid = (left + rigtht) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) rigtht--;
            else left++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 2));
    }
}
