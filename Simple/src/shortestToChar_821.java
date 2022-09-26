import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个字符串 s 和一个字符 c ，且 c 是 s 中出现过的字符。
 * 返回一个整数数组 answer ，其中 answer.length == s.length 且 answer[i] 是 s 中从下标 i 到离它 最近 的字符 c 的 距离 。
 * 两个下标 i 和 j 之间的 距离 为 abs(i - j) ，其中 abs 是绝对值函数。
 */
public class shortestToChar_821 {
    public static int[] shortestToChar(String s, char c) {
        /*Set<Integer> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) set.add(i);
        }
        int[] res = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[i] = s.length();
            for (Integer integer : set) {
                res[i] = Math.min(res[i], Math.abs(integer - i));
            }
        }
        return res;*/
        int n = s.length();
        int[] ans = new int[n];
        for (int i = 0, idx = -n; i < n; ++i) {
            if (s.charAt(i) == c) idx = i;
            ans[i] = i - idx;
        }
        for (int i = n - 1, idx = 2 * n; i >= 0; --i) {
            if (s.charAt(i) == c) idx = i;
            ans[i] = Math.min(ans[i], idx - i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
    }
}
