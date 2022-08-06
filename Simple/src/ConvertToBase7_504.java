/**
 * 给定一个整数 num，将其转化为 7 进制，并以字符串形式输出。
 */
public class ConvertToBase7_504 {
    public static String convertToBase7(int num) {
        StringBuffer sb = new StringBuffer();
        int temp = Math.abs(num);
        while (temp >= 7) {
            sb.append(temp % 7);
            temp /= 7;
        }
        sb.append(temp);
        return (num < 0 ? "-" : "") + sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }
}
