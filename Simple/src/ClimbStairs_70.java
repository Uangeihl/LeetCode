/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class ClimbStairs_70 {
    public static int climbStairs(int n) {
        //递归
        /*if (n == 1) return 1;
        if (n == 2) return 2;
        return map.get(n);*/
        //循环
        int last1 = 1;
        int last2 = 1;
        int t = 1;
        for (int i = 2; i <= n; i++) {
            t = last1 + last2;
            last1 = last2;
            last2 = t;
        }
        return t;
        //数组优化，空间换效率
        /*int[] f = new int[n + 1];
        f[0] = f[1] = 1;
        for (int i = 2;i <= n;i ++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];*/
    }

    public static void main(String[] args) {
        int n = 45;
        System.out.println(climbStairs(n));
    }
}
