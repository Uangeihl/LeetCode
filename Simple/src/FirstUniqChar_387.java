/**
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 */
public class FirstUniqChar_387 {
    public static int firstUniqChar(String s) {
        if (s.length() == 1) return 0;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a';
            if (arr[temp] == 0) arr[temp] = i + 1;
            else arr[temp] = -1;
        }
        int res = Integer.MAX_VALUE;
        for (int value : arr) {
            if (value > 0) res = Math.min(res, value);
        }
        return res == Integer.MAX_VALUE ? -1 : res - 1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("dddccdbb"));
    }
}
