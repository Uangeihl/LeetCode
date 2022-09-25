/**
 * 给你一个整数 columnNumber ，返回它在 Excel 表中相对应的列名称。
 */
public class ConvertToTitle_ {
    public static String convertToTitle(int columnNumber) {
        StringBuffer res = new StringBuffer();
        while (columnNumber > 0) {
            res.append(Character.toChars('A' + --columnNumber % 26));
            columnNumber /= 26;
        }
        return String.valueOf(res.reverse());
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(701));
    }
}
