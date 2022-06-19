import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个  无重复元素 的 有序 整数数组 nums 。
 * 返回 恰好覆盖数组中所有数字 的 最小有序 区间范围列表 。也就是说，nums 的每个元素都恰好被某个区间范围所覆盖，并且不存在属于某个范围但不属于 nums 的数字 x 。
 * 列表中的每个区间范围 [a,b] 应该按如下格式输出：
 * "a->b" ，如果 a != b
 * "a" ，如果 a == b
 */
public class SummaryRanges_228 {
    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;
        int temp = nums[0];
        for (int i = 1, j = 1; i <= nums.length; i++) {
            while (i != nums.length && nums[i] == temp + j) {
                j++;
                i++;
            }
            list.add("" + temp + (j == 1 ? "" : "->" + nums[i - 1]));
            if (i != nums.length) temp = nums[i];
            j = 1;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(summaryRanges(nums));
    }
}
