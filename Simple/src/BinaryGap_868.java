/**
 * 给定一个正整数 n，找到并返回 n 的二进制表示中两个 相邻 1 之间的 最长距离 。如果不存在两个相邻的 1，返回 0 。
 * 如果只有 0 将两个 1 分隔开（可能不存在 0 ），则认为这两个 1 彼此 相邻 。两个 1 之间的距离是它们的二进制表示中位置的绝对差。例如，"1001" 中的两个 1 的距离为 3 。
 */
public class BinaryGap_868 {
    public static int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int max = 0, left = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                max = Math.max(max, i - left);
                left = i;
            }
        }
        return Math.max(max, 0);
    }

    public static void main(String[] args) {
        System.out.println(binaryGap(5));
    }
}
