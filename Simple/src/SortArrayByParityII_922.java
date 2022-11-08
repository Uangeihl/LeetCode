import java.util.Arrays;

/**
 * 给定一个非负整数数组 nums，  nums 中一半整数是 奇数 ，一半整数是 偶数 。
 * 对数组进行排序，以便当 nums[i] 为奇数时，i 也是 奇数 ；当 nums[i] 为偶数时， i 也是 偶数 。
 * 你可以返回 任何满足上述条件的数组作为答案 。
 */
public class SortArrayByParityII_922 {
    public static int[] sortArrayByParityII(int[] nums) {
        int j = 1;
        for (int i = 0; i < nums.length; i += 2) {
            if (nums[i] % 2 != 0) {
                for (; j < nums.length; j += 2) {
                    if (nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 7};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
}
