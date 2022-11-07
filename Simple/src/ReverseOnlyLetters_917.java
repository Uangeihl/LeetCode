/**
 * 给你一个字符串 s ，根据下述规则反转字符串：
 * 所有非英文字母保留在原有位置。
 * 所有英文字母（小写或大写）位置反转。
 * 返回反转后的 s 。
 */
public class ReverseOnlyLetters_917 {
    public static String reverseOnlyLetters(String s) {
        int left = 0, right = s.length() - 1;
        char[] res = new char[s.length()];
        while (left <= right) {
            if (!Character.isAlphabetic(s.charAt(left))) res[left] = s.charAt(left++);
            else if (!Character.isAlphabetic(s.charAt(right))) res[right] = s.charAt(right--);
            else if (Character.isAlphabetic(s.charAt(left)) && Character.isAlphabetic(s.charAt(right))) {
                char temp = s.charAt(left);
                res[left++] = s.charAt(right);
                res[right--] = temp;
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("ab-cd"));
    }
}
