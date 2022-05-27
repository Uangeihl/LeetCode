/**
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 */
public class MySqrt_69 {
    public  static int mySqrt(int x) {
        int left = 1;
        int right = x;
        int middle;
        while (left < right) {
            middle = (left + right) / 2;
            if (middle > x/middle) right = middle - 1;
            else left = middle + 1;
        }
        return left - 1;
        /*long r = x;
        while (r * r > x) {
            r = (r + x/r)/2;
        }
        return (int)r;*/
    }

    public static void main(String[] args) {
        int x = 214;
        System.out.println(mySqrt(x));
    }
}
