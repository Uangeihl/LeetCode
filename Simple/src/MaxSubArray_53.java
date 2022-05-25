/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * 子数组 是数组中的一个连续部分。
 */
public class MaxSubArray_53 {
    public static int maxSubArray(int[] nums) {
//        int maxsum = 0;
//        int sum = 0;
//        int _sum = -99999;
//        for (int num : nums) {
//            _sum = Math.max(num, _sum);
//            if (num >= 0 || sum + num >= 0) {
//                sum += num;
//            } else sum = 0;
//            if (sum > maxsum) maxsum = sum;
//        }
//        if (_sum < 0) return _sum;
//        return maxsum;
        int pre = 0;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            pre = num + pre;
            max = Math.max(max, pre);
            if (pre < 0) pre = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2};
        System.out.println(maxSubArray(nums));
    }
}
