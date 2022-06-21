/**
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 如果存在一个整数 x 使得 n == 2x ，则认为 n 是 2 的幂次方。
 */
public class IsPowerOfTwo_231 {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n % 2 != 0 || n == 0) return false;
        return isPowerOfTwo(n / 2);
        //在2^x的二进制中只有一位1，n&(n-1)可以消除最后一位1
        //return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }
}
