/**
 * 给你一个字符串 columnTitle ，表示 Excel 表格中的列名称。返回 该列名称对应的列序号 。
 */
public class TitleToNumber_171 {
    public static int titleToNumber(String columnTitle) {
        /*int num = 0;
        for (int i = columnTitle.length() - 1; i >= 0; i--) {
            num += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, columnTitle.length() - 1 - i);
        }
        return num;*/
        int ans = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            ans = ans * 26 + (columnTitle.charAt(i) - 'A') + 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        String columnTitle = "ZY";
        System.out.println(titleToNumber(columnTitle));
    }
}
