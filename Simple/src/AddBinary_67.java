/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class AddBinary_67 {
    public static String addBinary(String a, String b) {
        /*HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('0', 0);
        map.put('1', 1);
        String s = "";
        int flag = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        int t;
        int k;
        while (i >= 0 && j >= 0) {
            t = flag + map.get(a.charAt(i--)) + map.get(b.charAt(j--));
            flag = t / 2;
            s = "" + t % 2 + s;
        }
        k = Math.max(i, j);
        while (k >= 0) {
            t = flag + map.get((a.length() > b.length() ? a : b).charAt(k--));
            flag = t / 2;
            s = "" + t % 2 + s;
        }
        if (flag == 1) return "1" + s;
        else return s;*/
        StringBuilder ans = new StringBuilder();

        int n = Math.max(a.length(), b.length()), carry = 0;
        for (int i = 0; i < n; ++i) {
            carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
            carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
            ans.append((char) (carry % 2 + '0'));
            carry /= 2;
        }

        if (carry > 0) {
            ans.append('1');
        }
        ans.reverse();

        return ans.toString();
    }

    public static void main(String[] args) {
        String a = "100";
        String b = "11100";
        System.out.println(addBinary(a, b));
    }
}
