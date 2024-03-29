/**
 * 给你一个字符串 s 表示一个学生的出勤记录，其中的每个字符用来标记当天的出勤情况（缺勤、迟到、到场）。记录中只含下面三种字符：
 * 'A'：Absent，缺勤
 * 'L'：Late，迟到
 * 'P'：Present，到场
 * 如果学生能够 同时 满足下面两个条件，则可以获得出勤奖励：
 * 按 总出勤 计，学生缺勤（'A'）严格 少于两天。
 * 学生 不会 存在 连续 3 天或 连续 3 天以上的迟到（'L'）记录。
 * 如果学生可以获得出勤奖励，返回 true ；否则，返回 false 。
 */
public class CheckRecord_551 {
    public static boolean checkRecord(String s) {
        int absent = 0, late = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') absent++;
            if (s.charAt(i) == 'L') late++;
            else late = 0;
            if (absent > 1 || late > 2) return false;
        }
        return true;
//        return (s.indexOf('A') == s.lastIndexOf('A')) && (!s.contains("LLL"));
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLL"));
    }
}
