/**
 * 给你一个字符串 s，最多 可以从中删除一个字符。
 * 请你判断 s 是否能成为回文字符串：如果能，返回 true ；否则，返回 false 。
 */
public class ValidPalindrome_680 {
    public static boolean validPalindrome(String s) {
        char[] ch = s.toCharArray();
        int left = 0, right = ch.length - 1;
        for (; left <= right; left++, right--) {
            if (ch[left] != ch[right]) break;
        }
        if (left > right) return true;
        int i, j;
        for (i = left + 1, j = right; i <= j; i++, j--) {
            if (ch[i] != ch[j]) break;
        }
        if (i > j) return true;
        for (i = left, j = right - 1; i <= j; i++, j--) {
            if (ch[i] != ch[j]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}
