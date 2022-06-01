import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负索引 rowIndex，返回「杨辉三角」的第 rowIndex 行。
 * 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
 */
public class GetRow_119 {
    /*public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }

    public static List<Integer> getRow(int rowIndex) {
        return generate(rowIndex + 1).get(rowIndex);
    }*/
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            res.add((int) ((long) res.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRow(6));
    }
}
