/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 */
public class IsPalindrome_125 {
    public static boolean isPalindrome(String s) {
        /*for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
        }*/
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            while (i < j && !Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))) i++;
            while (j > i && !Character.isAlphabetic(s.charAt(j)) && !Character.isDigit(s.charAt(j))) j--;
            /*char chi = s.charAt(i);
            char chj = s.charAt(j);
            if (chi < 65 && chj >= 65 || chj < 65 && chi > 65) return false;
            if (!(Math.abs(chi - chj) == 0 || Math.abs(chi - chj) == 32)) return false;*/
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ab2a";
        System.out.println(isPalindrome(s));
    }
}
