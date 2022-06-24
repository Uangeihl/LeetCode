import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 */
public class IsAnagram_242 {
    public static boolean isAnagram(String s, String t) {
        /*if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else map.put(s.charAt(i), 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (!map.containsKey(t.charAt(i)) || map.get(t.charAt(i)) == 0) return false;
            else map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }
        return true;*/
        //排序比较是否相等
        char[] cs1 = s.toCharArray();
        char[] cs2 = t.toCharArray();
        Arrays.sort(cs1);
        Arrays.sort(cs2);
        return new String(cs1).equals(new String(cs2));
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ab", "a"));
    }
}
