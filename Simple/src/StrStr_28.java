/**
 * 给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 */
public class StrStr_28 {
    public static int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;
        int i,j;
        for (i = 0; i < haystack.length(); i++) {
            for (j = 0; j < needle.length();) {
                if((i+j)<haystack.length()&&needle.charAt(j)==haystack.charAt(i+j)){
                    j++;
                }else {
                    break;
                }
            }
            if(j==needle.length()) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issipi";
        System.out.println(strStr(haystack, needle));
    }
}
