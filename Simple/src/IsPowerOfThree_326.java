/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 true ；否则，返回 false 。
 * 整数 n 是 3 的幂次方需满足：存在整数 x 使得 n == 3x
 */
public class IsPowerOfThree_326 {
    public static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        if (n < 1 || n % 3 != 0) return false;
        return isPowerOfThree(n / 3);
        /*if (n <= 0) return false;
        while (n % 3 == 0) n /= 3;
        return n == 1;*/
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(8));
    }
}
