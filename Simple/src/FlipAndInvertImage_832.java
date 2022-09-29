import java.util.Arrays;

/**
 * 给定一个 n x n 的二进制矩阵 image ，先 水平 翻转图像，然后 反转 图像并返回 结果 。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。
 * 例如，水平翻转 [1,1,0] 的结果是 [0,1,1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。
 * 例如，反转 [0,1,1] 的结果是 [1,0,0]。
 */
public class FlipAndInvertImage_832 {
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] ints : image) {
            for (int i = 0; i <= (ints.length - 1) / 2; i++) {
                int temp = ints[i];
                ints[i] = ints[ints.length - 1 - i] * -1 + 1;
                ints[ints.length - 1 - i] = temp * -1 + 1;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
//        int[][] image = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
}
