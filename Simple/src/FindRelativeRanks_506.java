import java.util.Arrays;

/**
 * 给你一个长度为 n 的整数数组 score ，其中 score[i] 是第 i 位运动员在比赛中的得分。所有得分都 互不相同 。
 * <p>
 * 运动员将根据得分 决定名次 ，其中名次第 1 的运动员得分最高，名次第 2 的运动员得分第 2 高，依此类推。运动员的名次决定了他们的获奖情况：
 * <p>
 * 名次第 1 的运动员获金牌 "Gold Medal" 。
 * 名次第 2 的运动员获银牌 "Silver Medal" 。
 * 名次第 3 的运动员获铜牌 "Bronze Medal" 。
 * 从名次第 4 到第 n 的运动员，只能获得他们的名次编号（即，名次第 x 的运动员获得编号 "x"）。
 * 使用长度为 n 的数组 answer 返回获奖，其中 answer[i] 是第 i 位运动员的获奖情况。
 */
public class FindRelativeRanks_506 {
    public static String[] findRelativeRanks(int[] score) {
        String[] arr = new String[score.length];
        int max = -1;
        int temp = 0;
        int base = Integer.MAX_VALUE;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (score[j] < base && score[j] > max) {
                    max = score[j];
                    temp = j;
                }
            }
            base = max;
            max = -1;
            switch (i) {
                case 0:
                    arr[temp] = "Gold Medal";
                    break;
                case 1:
                    arr[temp] = "Silver Medal";
                    break;
                case 2:
                    arr[temp] = "Bronze Medal";
                    break;
                default:
                    arr[temp] = i + 1 + "";
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }
}
