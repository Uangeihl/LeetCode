/**
 * 罗马数字包含以下七种字符： I， V， X， L，C，D 和 M。
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给你一个整数，将其转为罗马数字。
 */
public class IntToRoman_12 {
    /*int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (num != 0) {
            while (values[i] > num) i++;
            sb.append(symbols[i]);
            num -= values[i];
        }
        return sb.toString();
    }*/
    public static String intToRoman(int num) {
        if (num / 1000 > 0) return "M" + intToRoman(num - 1000);
        else if (num / 900 > 0) return "CM" + intToRoman(num - 900);
        else if (num / 500 > 0) return "D" + intToRoman(num - 500);
        else if (num / 400 > 0) return "CD" + intToRoman(num - 400);
        else if (num / 100 > 0) return "C" + intToRoman(num - 100);
        else if (num / 90 > 0) return "XC" + intToRoman(num - 90);
        else if (num / 50 > 0) return "L" + intToRoman(num - 50);
        else if (num / 40 > 0) return "XL" + intToRoman(num - 40);
        else if (num / 10 > 0) return "X" + intToRoman(num - 10);
        else if (num / 9 > 0) return "IX" + intToRoman(num - 9);
        else if (num / 5 > 0) return "V" + intToRoman(num - 5);
        else if (num / 4 > 0) return "IV" + intToRoman(num - 4);
        else if (num > 0) return "I" + intToRoman(num - 1);
        else return "";
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}
