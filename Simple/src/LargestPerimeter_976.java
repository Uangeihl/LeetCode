import java.util.Arrays;

/**
 * 给定由一些正数（代表长度）组成的数组 nums ，返回 由其中三个长度组成的、面积不为零的三角形的最大周长 。如果不能形成任何面积不为零的三角形，返回 0。
 */
public class LargestPerimeter_976 {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (help_976(nums[i], nums[i - 1], nums[i - 2])) return nums[i] + nums[i - 1] + nums[i - 2];
        }
        return 0;
    }

    static boolean help_976(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
