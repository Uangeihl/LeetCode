/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

public class IsPalindrome_9 {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;
        while (temp > 0) {
            sum = sum * 10 + temp % 10;
            temp /= 10;
        }
        return sum == x;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(isPalindrome(x));
    }
}
