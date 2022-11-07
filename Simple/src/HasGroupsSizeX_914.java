import java.util.HashMap;
import java.util.Map;

/**
 * 给定一副牌，每张牌上都写着一个整数。
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。
 */
public class HasGroupsSizeX_914 {
    public static boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) {
            map.put(i, map.getOrDefault(i, 0) + 1);

     }
        int g = -1;
        for (Integer i : map.values()) {
            if (g == -1) g = i;
            else g = gcd(g, i);
        }
        return g >= 2;
    }

    private static int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }

    public static void main(String[] args) {
        int[] deck = {1, 1, 1, 1, 2, 2, 2, 2, 2, 2};
        System.out.println(hasGroupsSizeX(deck));
    }
}
