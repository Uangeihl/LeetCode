/**
 * 假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 * 给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false。
 */
public class CanPlaceFlowers_605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int sum = 0;
        if (flowerbed.length == 1) return flowerbed[0] == 0 ? n <= 1 : n == 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (i == 0) {
                if (flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    sum++;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0) {
                    flowerbed[i] = 1;
                    sum++;
                }
            } else {
                if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    sum++;
                }
            }
        }
        return sum >= n;
        /*int i = 0;
        while (i < flowerbed.length && n > 0) {
            if (flowerbed[i] == 1) i += 2;
            else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            } else i += 3;
        }
        return n <= 0;*/
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(flowerbed, 2));
    }
}
