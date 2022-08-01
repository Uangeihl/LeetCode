/**
 * 给定一个二进制数组 nums ， 计算其中最大连续 1 的个数。
 */
public class FindMaxConsecutiveOnes_485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, temp = 0;
        for (int num : nums) {
            if (num == 1) temp++;
            else temp = 0;
            res = Math.max(res, temp);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
