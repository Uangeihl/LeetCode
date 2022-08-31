import java.util.Arrays;

/**
 * 给你一个整型数组 nums ，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 */
public class MaximumProduct_628 {
    public static int maximumProduct(int[] nums) {
        int[] max = {-1001, -1001, -1001};
        int[] min = {1001, 1001};
        for (int num : nums) {
            max[0] = Math.max(max[0], num);
            min[1] = Math.min(min[1], num);
            Arrays.sort(max);
            Arrays.sort(min);
        }
        return Math.max(min[0] * min[1] * max[2], max[0] * max[1] * max[2]);
    }

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, 4};
        System.out.println(maximumProduct(nums));
    }
}
