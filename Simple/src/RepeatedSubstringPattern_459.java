/**
 * 给定一个非空的字符串 s ，检查是否可以通过由它的一个子串重复多次构成。
 */
public class RepeatedSubstringPattern_459 {
    public static boolean repeatedSubstringPattern(String s) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i <= s.length() / 2; i++) {
            if (!help_459(res, s)) res.append(s.charAt(i));
            else return true;
        }
        return false;
    }

    static boolean help_459(StringBuffer res, String s) {
        if (res.length() < 1 || s.length() % res.length() != 0) return false;
        String str = res.toString();
        for (int i = str.length(); i < s.length(); i++) {
            if (str.charAt(i % res.length()) != s.charAt(i)) return false;
        }
        return true;
//        return (s + s).indexOf(s, 1) != s.length();
    }

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aabaaba"));
    }
}
