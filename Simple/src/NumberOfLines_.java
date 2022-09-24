import java.util.Arrays;

/**
 * 我们要把给定的字符串 S 从左到右写到每一行上，每一行的最大宽度为100个单位，如果我们在写某个字母的时候会使这行超过了100 个单位，那么我们应该把这个字母写到下一行。我们给定了一个数组 widths ，这个数组 widths[0] 代表 'a' 需要的单位， widths[1] 代表 'b' 需要的单位，...， widths[25] 代表 'z' 需要的单位。
 * 现在回答两个问题：至少多少行能放下S，以及最后一行使用的宽度是多少个单位？将你的答案作为长度为2的整数列表返回。
 */
public class NumberOfLines_ {
    public static int[] numberOfLines(int[] widths, String s) {
        /*int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (100 - sum % 100 < widths[s.charAt(i) - 97]) sum += 100 - sum % 100;
            sum += widths[s.charAt(i) - 97];
        }
        if (sum % 100 == 0) return new int[]{sum / 100, 100};
        return new int[]{sum / 100 + 1, sum % 100};*/
        int lines = 1;
        int width = 0;
        for (int i = 0; i < s.length(); i++) {
            int need = widths[s.charAt(i) - 'a'];
            width += need;
            if (width > 100) {
                lines++;
                width = need;
            }
        }
        return new int[]{lines, width};
    }

    public static void main(String[] args) {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String s = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(widths, s)));
    }
}
