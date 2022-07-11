/**
 * 猜数字游戏的规则如下：
 * 每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
 * 如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
 * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）：
 * -1：我选出的数字比你猜的数字小 pick < num
 * 1：我选出的数字比你猜的数字大 pick > num
 * 0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
 * 返回我选出的数字。
 */
public class GuessNumber_374 {
    public static int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int temp = (right - left) / 2 + left;
            switch (guess(temp)) {
                case -1:
                    right = temp - 1;
                    break;
                case 1:
                    left = temp + 1;
                    break;
                case 0:
                    return temp;
            }
        }
        return left;
    }

    static int guess(int num) {
        return Integer.compare(7, num);
    }

    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }
}
