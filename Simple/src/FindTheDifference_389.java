/**
 * 给定两个字符串 s 和 t ，它们只包含小写字母。
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 请找出在 t 中被添加的字母。
 */
public class FindTheDifference_389 {
    public static char findTheDifference(String s, String t) {
        int[] arrs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arrs[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arrs[t.charAt(i) - 'a']--;
        }
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] == -1) return (char) ('a' + i);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abecd"));
    }
}
