/**
 * 给定两个字符串, s 和 goal。如果在若干次旋转操作之后，s 能变成 goal ，那么返回 true 。
 * s 的 旋转操作 就是将 s 最左边的字符移动到最右边。 
 * 例如, 若 s = 'abcde'，在旋转一次之后结果就是'bcdea' 。
 */
public class RotateString_796 {
    public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        int i, j;
        for (i = 0; i < s.length(); i++) {
            for (j = 0; j < s.length(); j++) {
                if (s.charAt((i + j) % s.length()) != goal.charAt(j)) break;
            }
            if (j == s.length()) return true;
        }
        return false;
        /*if (s.length() != goal.length()) return false;
        s = s + s;
        return s.contains(goal);*/
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "abced"));
    }
}
