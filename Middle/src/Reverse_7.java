/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 */
public class Reverse_7 {
    public static int reverse(int x) {
        int flag = 1, sum = 0;
        if (x < 0) {
            flag = -1;
            x *= -1;
        }
        while (x > 0) {
            int temp = x % 10;
            sum = sum * 10 + temp;
            x /= 10;
            if (sum > Math.pow(2, 31) / 10 && x > 0) return 0;
        }
        return sum * flag;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-120));
    }
}
