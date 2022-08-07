/**
 * 对于一个 正整数，如果它和除了它自身以外的所有 正因子 之和相等，我们称它为 「完美数」。
 * 给定一个 整数 n， 如果是完美数，返回 true；否则返回 false。
 */
public class CheckPerfectNumber_507 {
    public static boolean checkPerfectNumber(int num) {
        if (num == 1) return false;
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i < num) {
                    sum += num / i;
                }
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(10000000));
    }
}
