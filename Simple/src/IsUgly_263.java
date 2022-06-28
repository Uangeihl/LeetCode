/**
 * 丑数 就是只包含质因数 2、3 和 5 的正整数。
 * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
 */
public class IsUgly_263 {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        else if (n % 2 == 0) return isUgly(n / 2);
        else if (n % 3 == 0) return isUgly(n / 3);
        else if (n % 5 == 0) return isUgly(n / 5);
        else return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(13));
    }
}
