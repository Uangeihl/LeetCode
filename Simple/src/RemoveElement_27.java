/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement_27 {
/*
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        if (i == j) return nums[i] == val ? 0 : 1;
        while (i < j) {
            while (nums[i] != val && i < j) i++;
            while (nums[j] == val && j > 0) j--;
            if (j == 0 && nums[0] == val) return 0;
            if (i < j) nums[i++] = nums[j--];
        }

        for (int k = 0; k < i; k++) {
            System.out.println(nums[k]);
        }
        System.out.println("--");
        if (i == j && nums[i] != val) return i + 1;
        return i;
    }
*/

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] != val) left++;
            else {
                nums[left] = nums[right];
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
}
