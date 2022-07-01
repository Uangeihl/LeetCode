import java.util.HashMap;
import java.util.Map;

/**
 * 给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。
 * 这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应规律。
 */
public class WordPattern_290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length) return false;
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (!map.containsKey(ch)) {
                if (map.containsValue(str[i])) return false;
                map.put(ch, str[i]);
            } else if (!map.get(ch).equals(str[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}
