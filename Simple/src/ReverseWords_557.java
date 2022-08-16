import java.util.Arrays;

/**
 * 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
public class ReverseWords_557 {
    public static String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            StringBuffer word = new StringBuffer(strings[i]);
            res.append(word.reverse().toString());
            if (i == strings.length - 1) break;
            res.append(" ");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
