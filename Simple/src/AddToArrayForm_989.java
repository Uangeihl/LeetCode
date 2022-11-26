import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 整数的 数组形式  num 是按照从左到右的顺序表示其数字的数组。
 * 例如，对于 num = 1321 ，数组形式是 [1,3,2,1] 。
 * 给定 num ，整数的 数组形式 ，和整数 k ，返回 整数 num + k 的 数组形式 。
 */
public class AddToArrayForm_989 {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int n = num.length;
        for (int i = n - 1; i >= 0; --i) {
            int sum = num[i] + k % 10;
            k /= 10;
            if (sum >= 10) {
                k++;
                sum -= 10;
            }
            res.add(sum);
        }
        for (; k > 0; k /= 10) {
            res.add(k % 10);
        }
        Collections.reverse(res);
        return res;
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 1};
        System.out.println(addToArrayForm(num, 886));
    }
}
