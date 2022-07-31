/**
 * 给定一个许可密钥字符串 s，仅由字母、数字字符和破折号组成。字符串由 n 个破折号分成 n + 1 组。你也会得到一个整数 k 。
 * 我们想要重新格式化字符串 s，使每一组包含 k 个字符，除了第一组，它可以比 k 短，但仍然必须包含至少一个字符。此外，两组之间必须插入破折号，并且应该将所有小写字母转换为大写字母。
 * 返回 重新格式化的许可密钥 。
 */
public class LicenseKeyFormatting_482 {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuffer sb = new StringBuffer();
        s = s.toUpperCase().replace("-", "");
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
            if ((sb.length() + 1) % (k + 1) == 0 && i > 0) sb.append('-');
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("----", 2));
    }
}
