import java.util.Arrays;

/**
 * 给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数 ，返回一个长度为 n + 1 的数组 ans 作为答案。
 */
public class CountBits_338 {
    public static int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            /*int biti = Integer.bitCount(i);
            int sum = 0;
            while (biti > 0) {
                sum += biti % 10;
                biti /= 10;
            }
            res[i] = sum;*/
            int sum = 0;
            int x = i;
            while (x > 0) {
                x &= (x - 1);
                sum++;
            }
            res[i] = sum;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(85723)));
    }
}
