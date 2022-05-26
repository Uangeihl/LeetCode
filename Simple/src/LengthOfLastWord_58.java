/**
 * 给你一个字符串 s，由若干单词组成，单词前后用一些空格字符隔开。返回字符串中 最后一个 单词的长度。
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 */
public class LengthOfLastWord_58 {
    public static int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        int count = 0;
        while (s.charAt(right) == ' ') {
            right--;
        }
        while (right >= 0 && s.charAt(right) != ' ') {
            right--;
            count++;
        }
        return count;
/*        String[] s1 = s.split(" ");
        String s2 = s1[s1.length - 1];
        return s2.length();*/
    }

    public static void main(String[] args) {
        String s = " a bbb ";
        System.out.println(lengthOfLastWord(s));
    }
}
