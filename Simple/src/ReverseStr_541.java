/**
 * 给定一个字符串 s 和一个整数 k，从字符串开头算起，每计数至 2k 个字符，就反转这 2k 字符中的前 k 个字符。
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 */
public class ReverseStr_541 {
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int i, n = s.length();
        for (i = 0; i < n; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k, n) - 1;
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 8;
        System.out.println(reverseStr(s, k));
    }
}
