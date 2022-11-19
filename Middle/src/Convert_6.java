/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * 请你实现这个将字符串进行指定行数变换的函数：
 * string convert(string s, int numRows);
 */
public class Convert_6 {
    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        int n = s.length(), count = n / (2 * numRows - 2), l = 2 * numRows - 2;
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= count; j++) {
                if (j * l + i > n - 1) break;
                res.append(s.charAt(j * l + i));
                if ((j + 1) * l - i > n - 1) break;
                if (i != 0 && i != numRows - 1) res.append(s.charAt((j + 1) * l - i));
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 4));
    }
}
