/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix_14 {
    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        int flage;
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            flage = 1;
            for (int j = 1; j < strs.length; j++) {
                if (i < strs[j].length()) {
                    if (c != strs[j].charAt(i)) {
                        flage = 0;
                        break;
                    }
                } else {
                    flage = 0;
                    break;
                }
            }
            if (flage == 1) {
                s += c;
            } else return s;
        }
        return s;
    }

    public static void main(String[] args) {
        String[] strs = {"flower"};
        System.out.println(longestCommonPrefix(strs));
    }
}
