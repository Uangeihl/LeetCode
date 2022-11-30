/**
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
 */
public class Divide_29 {
    public static int divide(int dividend, int divisor) {
        boolean fu = (((dividend >>> 31) ^ (divisor >>> 31)) == 1);
        if (dividend > 0) dividend = -dividend;
        if (divisor > 0) divisor = -divisor;
        int mod = divisor;
        int minn = dividend >> 1;
        int now = -1;
        while (mod >= minn) {
            mod <<= 1;
            now <<= 1;
        }
        int ans = 0;
        while (dividend <= divisor) {
            while (mod < dividend) {
                mod >>= 1;
                now >>= 1;
            }
            while (dividend <= mod) {
                dividend -= mod;
                ans -= now;
            }
        }
        if (ans == -2147483648 && !fu) return 2147483647;
        return fu ? -ans : ans;
        /*int flag = 1;
        if (dividend * divisor < 0) flag = -1;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int left = 0, right = dividend;
        while (left < right) {
            if (left * divisor <= dividend && (left + 1) * divisor > dividend) return left * flag;
            int middle = left + (right - left) / 2;
            if (middle * divisor <= dividend) left = middle + 1;
            else right = middle - 1;
        }
        return left * flag;*/
    }

    public static void main(String[] args) {
        System.out.println(divide(2, 2));
    }
}
