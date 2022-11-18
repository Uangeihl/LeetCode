/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class LongestPalindrome_5 {
    public static String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(i) != s.charAt(j)) continue;
                String temp = s.substring(i, j + 1);
                if (help_5(temp)) res = temp.length() > res.length() ? temp : res;
            }
        }
        return res;
    }

    static boolean help_5(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}

