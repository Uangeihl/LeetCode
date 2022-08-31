import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别 正好是 1 。
 * 现在，给你一个整数数组 nums ，请你在所有可能的子序列中找到最长的和谐子序列的长度。
 * 数组的子序列是一个由数组派生出来的序列，它可以通过删除一些元素或不删除元素、且不改变其余元素的顺序而得到。
 */
public class FindLHS_594 {
    public static int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        int max = 0;
        for (Integer integer : map.keySet()) {
            max = Math.max(max, map.containsKey(integer + 1) ? map.get(integer) + map.get(integer + 1) : 0);
        }
        return max;
        /*Arrays.sort(nums);
        int begin = 0;
        int cnt = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] - nums[begin] > 1) begin++;
            if (nums[end] - nums[begin] == 1) {
                cnt = Math.max(cnt, end - begin + 1);
            }
        }
        return cnt;*/
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        System.out.println(findLHS(nums));
    }
}