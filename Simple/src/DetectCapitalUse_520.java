import sun.nio.cs.US_ASCII;

/**
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 * 全部字母都是大写，比如 "USA" 。
 * 单词中所有字母都不是大写，比如 "leetcode" 。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。
 * 给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。
 */
public class DetectCapitalUse_520 {
    public static boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||
                word.equals(word.toLowerCase()) ||
                (((char) (word.charAt(0) + 32) + word.substring(1)).equals(word.toLowerCase()));
        //return word.equals(word.toUpperCase())||word.substring(1).equals(word.substring(1).toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("Google"));
    }
}
