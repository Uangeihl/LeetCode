/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class MoveZeroes_283 {
    public static void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[left] == 0 && nums[right] != 0) {
                nums[left] = nums[right];
                nums[right] = 0;
            }
            if (nums[left] != 0) left++;
            if (nums[right] == 0 || left >= right) right++;
        }
        /*int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            else nums[k++] = nums[i];
        }
        while (k < nums.length) nums[k++] = 0;*/
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1};
        moveZeroes(nums);
    }
}
