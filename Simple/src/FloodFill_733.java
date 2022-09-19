import java.util.Arrays;

/**
 * 有一幅以 m x n 的二维整数数组表示的图画 image ，其中 image[i][j] 表示该图画的像素值大小。
 * 你也被给予三个整数 sr ,  sc 和 newColor 。你应该从像素 image[sr][sc] 开始对图像进行 上色填充 。
 * 为了完成 上色工作 ，从初始像素开始，记录初始坐标的 上下左右四个方向上 像素值与初始坐标相同的相连像素点，接着再记录这四个方向上符合条件的像素点与他们对应 四个方向上 像素值与初始坐标相同的相连像素点，……，重复该过程。将所有有记录的像素点的颜色值改为 newColor 。
 * 最后返回 经过上色渲染后的图像 。
 */
public class FloodFill_733 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;
        help_733(image, sr, sc, color);
        return image;
    }

    static void help_733(int[][] image, int sr, int sc, int color) {
        int temp = image[sr][sc];
        image[sr][sc] = color;
        if (sr - 1 >= 0 && temp == image[sr - 1][sc]) help_733(image, sr - 1, sc, color);
        if (sr + 1 < image.length && temp == image[sr + 1][sc]) help_733(image, sr + 1, sc, color);
        if (sc - 1 >= 0 && temp == image[sr][sc - 1]) help_733(image, sr, sc - 1, color);
        if (sc + 1 < image[0].length && temp == image[sr][sc + 1]) help_733(image, sr, sc + 1, color);
    }

    public static void main(String[] args) {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 1)));
    }
}
