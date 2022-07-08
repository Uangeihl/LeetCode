import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();
        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0, res = 0;
        for (j = 0; j < s.length(); j++) {
            Character ch = s.charAt(j);
            res = Math.max(res, j - i);
            if (map.containsKey(ch)) {
                i = map.get(ch) + 1;
                map.put(ch, j);
                Iterator<Integer> iter = map.values().iterator();
                while (iter.hasNext()) {
                    Integer val = iter.next();
                    if (val < i) iter.remove();
                }
            }
            map.put(ch, j);
        }
        return Math.max(res, j - i);
        /*HashMap<Character, Integer> map = new HashMap<>();
        int result = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            Character c = s.charAt(end);
            if (map.containsKey(c)) start = Math.max(start, map.get(c) + 1);
            map.put(c, end);
            result = Math.max(result, end - start + 1);
        }
        return result;*/
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aab"));
    }
}
