/**
 * 给你一个 m x n 的矩阵 M ，初始化时所有的 0 和一个操作数组 op ，其中 ops[i] = [ai, bi] 意味着当所有的 0 <= x < ai 和 0 <= y < bi 时， M[x][y] 应该加 1。
 * 在 执行完所有操作后 ，计算并返回 矩阵中最大整数的个数 。
 */
public class MaxCount_598 {
    public static int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0) return m * n;
        int min_m = Integer.MAX_VALUE;
        int min_n = Integer.MAX_VALUE;
        for (int[] op : ops) {
            min_m = Math.min(min_m, op[0]);
            min_n = Math.min(min_n, op[1]);
        }
        return min_m * min_n;
    }

    public static void main(String[] args) {
        int[][] ops = {{2, 2}, {3, 3}};
        System.out.println(maxCount(3, 3, ops));
    }
}
