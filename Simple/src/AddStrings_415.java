/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和并同样以字符串形式返回。
 * 你不能使用任何內建的用于处理大整数的库（比如 BigInteger）， 也不能直接将输入的字符串转换为整数形式。
 */
public class AddStrings_415 {
    public static String addStrings(String num1, String num2) {
        StringBuffer sb = new StringBuffer();
        int flage = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || flage != 0) {
            int result = (i >= 0 ? num1.charAt(i) - '0' : 0)
                    + (j >= 0 ? num2.charAt(j) - '0' : 0)
                    + flage;
            sb.append(result % 10);
            flage = result / 10;
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("11", "123"));
    }
}
