/**
 * 有两种特殊字符：
 * 第一种字符可以用一比特 0 表示
 * 第二种字符可以用两比特（10 或 11）表示
 * 给你一个以 0 结尾的二进制数组 bits ，如果最后一个字符必须是一个一比特字符，则返回 true 。
 */
public class IsOneBitCharacter_717 {
    public static boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        if (n < 2 || bits[n - 2] == 0) return true;
        else {
            for (int i = bits.length - 3; i >= 0; i--) {
                if (bits[i] == 0) return (n - 2 - i) % 2 == 0;
            }
        }
        return (n - 1) % 2 == 0;
    }

    public static void main(String[] args) {
        int[] bits = {0, 1, 0};
        System.out.println(isOneBitCharacter(bits));
    }
}
